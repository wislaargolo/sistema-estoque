package br.ufrn.imd.sistemaestoque.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Estoque {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String endereco;

    @OneToMany(mappedBy = "estoque")
    private List<EstoqueProduto> produtos;

    public Estoque() {}

    public Estoque(Long id, String descricao, String endereco,
                   List<EstoqueProduto> produtos) {
        this.id = id;
        this.descricao = descricao;
        this.endereco = endereco;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<EstoqueProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<EstoqueProduto> produtos) {
        this.produtos = produtos;
    }
}
