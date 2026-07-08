package com.morales.rh.repositorio;

import com.morales.rh.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpeladoRepositorio extends JpaRepository<Empleado, Integer> {
}
