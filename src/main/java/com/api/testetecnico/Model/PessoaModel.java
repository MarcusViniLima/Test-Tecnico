package com.api.testetecnico.Model;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pessoatb")
public class PessoaModel {
    @Id
    @Column(name = "id_Pessoa",  length = 5)
    private Integer idPessoa;
    @Column(name = "nome_Pessoa", nullable = false, length = 100)
    private String nomePessoa;
    @Column(name = "dataNasc_Pessoa", length = 20)
    private Integer dataNascPessoa;
    @OneToMany
    private List<EnderecoModel> endereco;
    
    public Integer getIdPessoa() {
        return idPessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public int getDataNascPessoa() {
        return dataNascPessoa;
    }
    public void setIdPessoa(Integer id) {
        this.idPessoa = id;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public void setDataNascPessoa(int dataNascPessoa) {
        this.dataNascPessoa = dataNascPessoa;
    }
    public List<EnderecoModel> getEndereco() {
        return endereco;
    }
    public void setAddEndereco(EnderecoModel endereco) {
        this.endereco.add(endereco);
    }
    public void setEndereco(List<EnderecoModel> endereco) {
        this.endereco =endereco;
    }
}
