package com.api.testetecnico.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.testetecnico.Model.EnderecoModel;
import com.api.testetecnico.Repository.EnderecoRepository;

import jakarta.transaction.Transactional;

@Service
public class EnderecoServiceImpl implements IEnderecoService{

    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    @Transactional
    public EnderecoModel adicionarEndereco(EnderecoModel enderecoNovo) {
        if(this.existById(enderecoNovo.getIdEndereco())){
            return null;
        }
        if( enderecoNovo.getPessoa() != null){ 
            return enderecoRepository.save(enderecoNovo);
        }
        return null;
    }

    private boolean existById(Integer integer) {
        return false;
    }

    @Override
    public List<EnderecoModel> buscarPeloIdpessoa(Integer idPessoa) {
        List<EnderecoModel> listaEndereco = enderecoRepository.findAllByIdPessoa(idPessoa);
        return listaEndereco;
    }

    @Override
    public EnderecoModel atualizarEndereco(EnderecoModel enderecoAtualizado) {
        
        return null;
    }

    public Optional buscarPeloidEndereco(Integer idEndereco) {
        return enderecoRepository.findById(idEndereco);
    }
    
}
