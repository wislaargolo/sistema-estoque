package br.ufrn.imd.sistemaestoque.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Table(name = "tipo_movimentacao")
@Entity
@EqualsAndHashCode(of = "id")
@Data
public class TipoMovimentacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "tipoMovimentacao")
    private List<Movimentacao> movimentacoes;
}
