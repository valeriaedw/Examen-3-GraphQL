package com.cenfotec.graphql.query;

import com.cenfotec.graphql.entities.Cliente;
import com.cenfotec.graphql.services.ClienteService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClienteQuery implements GraphQLQueryResolver {

    @Autowired
    private ClienteService clienteService;
    public List<Cliente> getClientes(int count){
        return this.clienteService.getAllClientes(count);
    }
    public Optional<Cliente> getCliente(int id){
        return this.clienteService.getCliente(id);
    }

}
