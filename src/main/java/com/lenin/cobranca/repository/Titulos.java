package com.lenin.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenin.cobranca.model.Titulo;

@Repository
public interface Titulos extends JpaRepository<Titulo, Long>{

}
