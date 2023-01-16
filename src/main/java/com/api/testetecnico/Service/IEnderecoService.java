package com.api.testetecnico.Service;

import java.util.List;

import com.api.testetecnico.Model.EnderecoModel;

public interface IEnderecoService {
    public EnderecoModel adicionarEndereco(EnderecoModel enderecoNovo);
    public List<EnderecoModel> buscarPeloIdpessoa(Integer idPessoa);
    public EnderecoModel atualizarEndereco(EnderecoModel enderecoAtualizado);
}
