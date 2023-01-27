package com.api.testetecnico.Controller;


import java.util.List;
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

import com.api.testetecnico.Model.PessoaModel;
import com.api.testetecnico.Service.PessoaServiceImpl;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path="/tecnicoPessoa")
public class PessoaController {
    
    @Autowired
    PessoaServiceImpl pessoaService;

    @PostMapping("/pessoa")
    public ResponseEntity<PessoaModel> adicionarPessoa(@Valid @RequestBody PessoaModel pessoaNova){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.adicionarPessoa(pessoaNova));
    }

    @GetMapping("/listarPessoas")
    public ResponseEntity<List<PessoaModel>> listarPessoas(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.buscarTodasPessoa());
    }

    @GetMapping("/pessoa/{id}")
    public ResponseEntity<Object> bucarPessoa(@PathVariable Integer id){
        PessoaModel pessoa = pessoaService.buscarPeloId(id);
        if(pessoa != null){
                return ResponseEntity.ok(pessoa);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada!");
    }

    @PutMapping("/pessoa/{id}")
    public ResponseEntity<Object> alterarPessoa(@PathVariable Integer id, @Valid @RequestBody PessoaModel pessoaAtualizada){
        Optional pessoaOptional = pessoaService.buscarPeloid(id);
        if(!pessoaOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível atualizar dados! Verifique-os e tente novamente.");
        }
        var pessoa = pessoaOptional.get();
        ((PessoaModel) pessoa).setIdPessoa(pessoaAtualizada.getIdPessoa());
        ((PessoaModel) pessoa).setNomePessoa(pessoaAtualizada.getNomePessoa());
        ((PessoaModel) pessoa).setDataNascPessoa(pessoaAtualizada.getDataNascPessoa());
        ((PessoaModel) pessoa).setEndereco(pessoaAtualizada.getEndereco());
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.adicionarPessoa(pessoaAtualizada));
    }

}
