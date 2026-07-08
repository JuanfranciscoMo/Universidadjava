package com.morales.rh.servicio;

import com.morales.rh.Entidad.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    List<Empleado> listarEmpleados();
    Empleado buscarEmpleadoPorId(Integer idEmpleado);
    Empleado guardarEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);

}
