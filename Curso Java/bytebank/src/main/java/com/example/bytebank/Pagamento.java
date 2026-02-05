package com.example.bytebank;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String funcionario;
    private String cpf;
    private String agencia;
    private String conta;
    private Double valor;
    private String mesDeReferencia;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMesDeReferencia() {
        return mesDeReferencia;
    }

    public void setMesDeReferencia(String mesDeReferencia) {
        this.mesDeReferencia = mesDeReferencia;
    }
}
