package com.api.testetecnico;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.testetecnico.Model.EnderecoModel;
import com.api.testetecnico.Model.PessoaModel;

@SpringBootTest
public class EnderecoTeste {

    @Test
    void validarPropriedadesEndereco(){
        var pessoa = new PessoaModel();
        var endereco = new EnderecoModel();
        endereco.setIdEndereco(2);
        endereco.setCepEndereco(41245740);
        endereco.setCidadeEndereco("Salvador");
        endereco.setLogradouroEndereco("Pau da Lima");
        endereco.setNumeroEndereco(290);
        endereco.setPessoa(pessoa);

        assertEquals(2, endereco.getIdEndereco());
        assertEquals("Salvador", endereco.getCidadeEndereco());
        assertEquals(41245740, endereco.getCepEndereco());
        assertEquals("Pau da Lima", endereco.getLogradouroEndereco());
        assertEquals(290, endereco.getNumeroEndereco());
        assertEquals(pessoa, endereco.getPessoa());
    }
    
}
