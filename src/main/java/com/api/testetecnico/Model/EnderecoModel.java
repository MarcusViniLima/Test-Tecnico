package com.api.testetecnico.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Enderecotb")
public class EnderecoModel {
    @Id
    @Column(name = "id_Endereco", length = 4, nullable = false)
    private String idEndereco;
    @Column(name = "logradouro_Endereco",length = 100, nullable = false)
    private  String logradouroEndereco;
    @Column(name = "cep_Endereco",length = 8, nullable = false)
    private Integer cepEndereco;
    @Column(name = "numero_Endereco",length = 4, nullable = false)
    private Integer numeroEndereco;
    @Column(name = "cidade_Endereco",length = 50, nullable = false)
    private String cidadeEndereco;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Pessoa")
    private PessoaModel pessoa;
    @Column(name = "favorito_Endereco", nullable = false)
    private boolean enderecoFavorito;

    public int getCepEndereco() {
        return cepEndereco;
    }
    public String getCidadeEndereco() {
        return cidadeEndereco;
    }
    public String getIdEndereco() {
        return idEndereco;
    }
    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }
    public int getNumeroEndereco() {
        return numeroEndereco;
    }
    public PessoaModel getPessoa() {
        return pessoa;
    }
    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }
    public void setCepEndereco(int cepEndereco) {
        this.cepEndereco = cepEndereco;
    }
    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }
    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }
    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }
    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }
}
