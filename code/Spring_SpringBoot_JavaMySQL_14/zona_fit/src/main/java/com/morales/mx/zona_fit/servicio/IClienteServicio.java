package com.morales.mx.zona_fit.servicio;

import com.morales.mx.zona_fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    List<Cliente> listarClientes();
    Cliente bucarClientePorId(Integer idCliente);
    void guardarCliente(Cliente cliente);
    void elminarCliente(Cliente cliente);

}
