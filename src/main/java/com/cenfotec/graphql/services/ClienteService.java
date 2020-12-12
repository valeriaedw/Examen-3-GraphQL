package com.cenfotec.graphql.services;

import com.cenfotec.graphql.entities.Cliente;
import com.cenfotec.graphql.repositories.ClienteReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    ClienteReppository clienteReppository;

    public List<Cliente> getAllClientes(int count) {
        return this.clienteReppository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<Cliente> getCliente(int id) {

        return this.clienteReppository.findById(id);
    }

    public Cliente createCliente(String nombre, String apellidos, String direccionVivienda, String direccionCobro, int numTarjeta, int mes, int anio) {

        Cliente cliente = new Cliente();

        cliente.setNombre(nombre);
        cliente.setApellidos(apellidos);
        cliente.setDireccionVivienda(direccionVivienda);
        cliente.setDireccionCobro(direccionCobro);
        cliente.setNumTarjeta(numTarjeta);
        cliente.setMes(mes);
        cliente.setAnio(anio);

        return this.clienteReppository.save(cliente);
    }

    public boolean deleteCliente(int id) {
        this.clienteReppository.deleteById(id);
        return true;
    }

    public Cliente updateCliente(Cliente cliente) {

           return clienteReppository.save(cliente);

    }
}


