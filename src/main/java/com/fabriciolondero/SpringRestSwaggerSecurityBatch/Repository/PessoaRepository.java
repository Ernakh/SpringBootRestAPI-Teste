package com.fabriciolondero.SpringRestSwaggerSecurityBatch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabriciolondero.SpringRestSwaggerSecurityBatch.Models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>
{

}
