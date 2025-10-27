package com.octavio.cadastroramais.model;

import jakarta.persistence.*;

@Entity
public class Ramal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String numero;
    private String setor;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
}
