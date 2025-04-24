package com.inovaboard.userflow.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity //diz que essa classe representa uma tabela no DB
public class Usuario {
    @Id //define o campo id como chave primário (semelhante ao PRIMARY KEY no SQL)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera o valor do id automaticamente
    private long id;

    @NotBlank(message = "Nome é obrigatório") //garante que o campo não esteja vazio ou preenchido somente com espaços
    private String nome;

    @Email(message = "E-mail deve ser válido") //verifica se o campo tem formato de e-mail válido
    @NotBlank(message = "E-mail é obrigatório")
    private String email;

    @Size (min = 6, message = "Senha deve ter no mínimo 6 caracteres") //valida o tamanho mínimo de caracteres
    private String senha;

    @PastOrPresent (message = "Data de nascimento não pode ser no futuro") //garante que a data não seja no futuro
    private LocalDate dataNascimento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
