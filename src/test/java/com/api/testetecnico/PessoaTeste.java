package com.api.testetecnico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

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
        pessoa.setDataNascPessoa(LocalDate.of(1989, 7, 10));
        assertEquals(5, pessoa.getIdPessoa());
        assertEquals("Matheus Henrique", pessoa.getNomePessoa());
        assertEquals(LocalDate.of(1989, 7, 10), pessoa.getDataNascPessoa());
    }
    
}
