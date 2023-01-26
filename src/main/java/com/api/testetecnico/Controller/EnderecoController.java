package com.api.testetecnico.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.testetecnico.Model.EnderecoModel;
import com.api.testetecnico.Model.PessoaModel;
import com.api.testetecnico.Service.EnderecoServiceImpl;
import com.api.testetecnico.Service.PessoaServiceImpl;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path="/tecnicoEndereco")
public class EnderecoController {
    
    @Autowired
    EnderecoServiceImpl enderecoService;
    
    @Autowired
    PessoaServiceImpl pessoaService;

    @PostMapping("/endereco")
    public ResponseEntity<Object> adicionarEndereco(@RequestBody EnderecoModel enderecoNovo){
        Optional pessoaOptional = pessoaService.buscarPeloid(enderecoNovo.getPessoa().getIdPessoa());
        if(!pessoaOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível encontrar essa Pessoa! Verifique os dados e tente novamente.");
        }
        enderecoService.adicionarEndereco(enderecoNovo);
        var pessoa = pessoaOptional.get();
        ((PessoaModel) pessoa).setIdPessoa(enderecoNovo.getPessoa().getIdPessoa());
        ((PessoaModel) pessoa).setAddEndereco(enderecoNovo);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }

    @PutMapping("/endereco/{id}")
    public ResponseEntity<Object> adicionarEndereco(@PathVariable Integer id, @RequestBody EnderecoModel enderecoNovo){
        Optional enderecoOptional = enderecoService.buscarPeloidEndereco(enderecoNovo.getIdEndereco());
        if(!enderecoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível encontrar esse Endereco! Verifique os dados e tente novamente.");
        }
        var endereco = enderecoOptional.get();
        ((EnderecoModel) endereco).setIdEndereco(enderecoNovo.getIdEndereco());
        ((EnderecoModel) endereco).setCepEndereco(enderecoNovo.getCepEndereco());
        ((EnderecoModel) endereco).setLogradouroEndereco(enderecoNovo.getLogradouroEndereco());
        ((EnderecoModel) endereco).setNumeroEndereco(enderecoNovo.getNumeroEndereco());
        ((EnderecoModel) endereco).setCidadeEndereco(enderecoNovo.getCidadeEndereco());
        ((EnderecoModel) endereco).setPessoa(enderecoNovo.getPessoa());
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoNovo.getPessoa());
    }

    @GetMapping("/endereco/{idPessoa}")
    public ResponseEntity<Object> listarEnderecoPessoa(@PathVariable Integer idPessoa){
        Optional pessoaOptional = pessoaService.buscarPeloid(idPessoa);
        if(!pessoaOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível encontrar essa Pessoa! Verifique os dados e tente novamente.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.buscarPeloIdpessoa(idPessoa));
    }
}
