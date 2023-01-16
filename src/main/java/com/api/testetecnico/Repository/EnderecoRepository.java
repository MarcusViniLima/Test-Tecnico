package com.api.testetecnico.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.testetecnico.Model.EnderecoModel;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Integer> {
    
    @Query(value="SELECT * FROM Enderecotb WHERE id_Endereco = ?1", nativeQuery=true)
    Optional findById(String idEndereco);

    @Query(value="SELECT * FROM Enderecotb WHERE id_Pessoa = ?1", nativeQuery=true)
    List<EnderecoModel> findAllByIdPessoa(Integer idPessoa);
    
}
