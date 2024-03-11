package br.ufrn.imd.sistemaestoque.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Entity
@EqualsAndHashCode(of = "id")
@Data
public class Movimentacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    @Column(columnDefinition = "DATE")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_tipo_movimentacao")
    private TipoMovimentacao tipoMovimentacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
