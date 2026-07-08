package com.morales.rh.servicio;

import com.morales.rh.Empleado;
import com.morales.rh.repositorio.EmpeladoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{
    @Autowired
    private EmpeladoRepositorio empeladoRepositorio;


    @Override
    public List<Empleado> listarEmpleados() {
        return empeladoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        return empeladoRepositorio.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empelado) {
        return empeladoRepositorio.save(empelado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empeladoRepositorio.delete(empleado);
    }
}
