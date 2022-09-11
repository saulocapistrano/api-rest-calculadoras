package com.apinet.apicalculadoras.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="TB_IMC")
public class Imc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_IMC)
    private  Integer id;
    @Column(name ="CD_CLI")
    private Integer codCliente;
    @Column(name = "NOME_CLI")
    private String nomeCliente;
    @Column(name = "IDADE_CLI")
    private Integer idade;
    @Column(name = "SEXO_CLI")
    private String sexo;
    @Column(name = "PESO_CLI")
    private BigDecimal peso;
    @Column(name = "ALTURA_CLI")
    private BigDecimal altura;
    @Column(name = "RESULT_IMC")
    private BigDecimal resultadoImc;
    @Column(name = "DESC_RESULT_IMC")
    private String descricaoResultadoImc;
    @Column(name = "DT_RESULT_IMC")
    private LocalDateTime dtResultadoImc = LocalDateTime.now();
    @Column(name = "ID_TECNICO")
    private Integer idTecnico;
    @Column(name = "DT_ALTERACAO")
    private Date dtAlteracao;
    @Column(name = "DT_EXCLUSAO")
    private Date dtExclusa;

}
