package com.example.anuncioloc.modelos;



public class Utilizador {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String tipo; // "comum" ou "moderador"
    private String dataRegistro;
    private String localizacao; // opcional
    private String fotoPerfil; // caminho local ou URL

    public Utilizador(int id, String nome, String email, String senha, String tipo, String dataRegistro, String localizacao, String fotoPerfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.dataRegistro = dataRegistro;
        this.localizacao = localizacao;
        this.fotoPerfil = fotoPerfil;
    }

    // Getters e Setters

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getTipo() { return tipo; }
    public String getDataRegistro() { return dataRegistro; }
    public String getLocalizacao() { return localizacao; }
    public String getFotoPerfil() { return fotoPerfil; }

    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setDataRegistro(String dataRegistro) { this.dataRegistro = dataRegistro; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public void setFotoPerfil(String fotoPerfil) { this.fotoPerfil = fotoPerfil; }
}
