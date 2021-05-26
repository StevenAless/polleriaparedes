package com.polleriaparedes.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polleriaparedes.appweb.model.Contacto;
@Repository

public interface ContactoRepository extends JpaRepository<Contacto, Integer>{
    
}