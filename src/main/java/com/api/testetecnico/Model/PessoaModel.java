package com.api.testetecnico.Model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pessoatb")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Pessoa", nullable = false, length = 5)
    private Integer idPessoa;
    @Column(name = "nome_Pessoa", nullable = false, length = 100)
    private String nomePessoa;
    @Column(name = "dataNasc_Pessoa", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate dataNascPessoa;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIncludeProperties("idEndereco")
    private List<EnderecoModel> endereco;
    
    public Integer getIdPessoa() {
        return idPessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public LocalDate getDataNascPessoa() {
        return dataNascPessoa;
    }
    public void setIdPessoa(Integer id) {
        this.idPessoa = id;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public void setDataNascPessoa(LocalDate dataNascPessoa) {
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
