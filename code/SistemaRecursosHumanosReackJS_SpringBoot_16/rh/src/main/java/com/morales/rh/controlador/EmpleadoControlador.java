package com.morales.rh.controlador;

import com.morales.rh.Entidad.Empleado;
import com.morales.rh.excepcion.RecursoNoEnotradoExcepcion;
import com.morales.rh.servicio.IEmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
// http:/localhost:8080/rh-app/
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    // http:/localhost:8080/rh-app/empleados
    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados(){
        var empleados = empleadoServicio.listarEmpleados();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return  empleados;
    }

    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        logger.info("Empleado a agregar: " + empleado);
        return  empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado>
            obtenerEmpleadoPorId(@PathVariable Integer id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null){
            throw new RecursoNoEnotradoExcepcion("No se enocontro el empleado con el id: " + id);
        }
        return ResponseEntity.ok(empleado);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(
            @PathVariable Integer id,
            @RequestBody Empleado empleadoRecibido) {

        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);

        if (empleado == null) {
            throw new RecursoNoEnotradoExcepcion(
                    "El empleado con id " + id + " no existe");
        }

        empleado.setNombre(empleadoRecibido.getNombre());
        empleado.setDepartamento(empleadoRecibido.getDepartamento());
        empleado.setSueldo(empleadoRecibido.getSueldo());

        return ResponseEntity.ok(
                empleadoServicio.guardarEmpleado(empleado));
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>>
    eliminarEmpleado(@PathVariable Integer id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado== null)
            throw  new RecursoNoEnotradoExcepcion("El id recibido no existe: " + id);
        empleadoServicio.eliminarEmpleado(empleado);
        // Respuesta {"eliminado": "true"}
        Map<String, Boolean> reaspuesta = new HashMap<>();
        reaspuesta.put("eliminado", Boolean.TRUE);
        return ResponseEntity.ok(reaspuesta);
    }

}
