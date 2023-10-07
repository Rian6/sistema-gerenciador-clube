/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.gerenciador.clube.entity;

/**
 *
 * @author rian_
 */
public class Associado {

    private Long id;
    private String nome;
    private String telefone;
    private String uf;
    private String cidade;
    private String endereco;
    private String email;
    private Integer dependentes;
    private String tipoPagamento;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUF() {
        return uf;
    }

    public void setUF(String uf) {
        this.uf = uf;
    }

    public Integer getDependentes() {
        return dependentes;
    }

    public void setDependentes(Integer dependentes) {
        this.dependentes = dependentes;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
