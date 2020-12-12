package com.cenfotec.graphql.mutation;

import com.cenfotec.graphql.entities.Cliente;
import com.cenfotec.graphql.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ClienteMutation implements GraphQLMutationResolver{
    @Autowired
    ClienteService clienteService;

    public Cliente createCliente(String nombre, String apellidos,String direccionVivienda, String direccionCobro, int numTarjeta,int mes,int anio){

        return this.clienteService.createCliente(nombre, apellidos,direccionVivienda,direccionCobro,numTarjeta,mes, anio);
    }

    public boolean deleteCliente(int id){
        return this.clienteService.deleteCliente(id);
    }

    public Cliente updateCliente(int id, String nombre, String apellidos,String direccionVivienda, String direccionCobro, int numTarjeta,int mes,int anio){

        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setApellidos(apellidos);
        cliente.setDireccionVivienda(direccionVivienda);
        cliente.setDireccionCobro(direccionCobro);
        cliente.setNumTarjeta(numTarjeta);
        cliente.setMes(mes);
        cliente.setAnio(anio);
        return this.clienteService.updateCliente(cliente);
    }
}
