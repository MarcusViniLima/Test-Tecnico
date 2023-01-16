package com.api.testetecnico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.testetecnico.Model.PessoaModel;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {

}
