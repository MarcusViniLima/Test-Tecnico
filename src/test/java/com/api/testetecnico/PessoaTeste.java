package com.api.testetecnico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.testetecnico.Model.PessoaModel;

@SpringBootTest
public class PessoaTeste {

    @Test
    void validarPropriedadesPessoa(){
        var pessoa = new PessoaModel();
        pessoa.setIdPessoa(5);
        pessoa.setNomePessoa("Matheus Henrique");
        pessoa.setDataNascPessoa(29091997);
        assertEquals(5, pessoa.getIdPessoa());
        assertEquals("Matheus Henrique", pessoa.getNomePessoa());
        assertEquals(29091997, pessoa.getDataNascPessoa());
    }
    
}
