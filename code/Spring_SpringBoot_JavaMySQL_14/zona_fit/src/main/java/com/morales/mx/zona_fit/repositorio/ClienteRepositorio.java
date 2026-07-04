package com.morales.mx.zona_fit.repositorio;

import com.morales.mx.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
