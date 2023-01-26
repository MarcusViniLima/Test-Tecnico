package com.api.testetecnico.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.testetecnico.Model.PessoaModel;
import com.api.testetecnico.Repository.PessoaRepository;

import jakarta.transaction.Transactional;

@Service
public class PessoaServiceImpl implements IPessoaService{
    
    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    @Transactional
    public PessoaModel adicionarPessoa(PessoaModel pessoaNovo) {
        if( pessoaNovo.getNomePessoa() != null){
            return pessoaRepository.save(pessoaNovo);
        }
        return null;
    }

    @Override
    public PessoaModel atualizarPessoa(PessoaModel pessoaAtualizada) {
        if(pessoaAtualizada.getNomePessoa() != null){
            return pessoaRepository.save(pessoaAtualizada);
        }
        return null;
    }

    @Override
    public List<PessoaModel> buscarTodasPessoa() {
       List<PessoaModel>listaPessoa;
       listaPessoa = (List<PessoaModel>)pessoaRepository.findAll();
        return listaPessoa;
    }

    @Override
    public PessoaModel buscarPeloId(Integer idPessoa) {
       return pessoaRepository.findById(idPessoa).orElse(null);
    }

    public Optional<PessoaModel> buscarPeloid(Integer idPessoa) {
        return pessoaRepository.findById(idPessoa);
     }

}
