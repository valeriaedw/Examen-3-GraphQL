package com.cenfotec.graphql.repositories;

import com.cenfotec.graphql.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteReppository extends JpaRepository<Cliente, Integer> {
}
