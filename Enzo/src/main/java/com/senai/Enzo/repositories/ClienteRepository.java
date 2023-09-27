package com.senai.Enzo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Enzo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long >{

}
