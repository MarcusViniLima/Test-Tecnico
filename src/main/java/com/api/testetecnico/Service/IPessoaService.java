package com.api.testetecnico.Service;

import java.util.List;

import com.api.testetecnico.Model.PessoaModel;

public interface IPessoaService {
    public PessoaModel adicionarPessoa(PessoaModel pessoaNovo);
    public PessoaModel atualizarPessoa(PessoaModel pessoaAtualizada);
    public List<PessoaModel> buscarTodasPessoa();
    public PessoaModel buscarPeloId(Integer nomePessoa);

}
