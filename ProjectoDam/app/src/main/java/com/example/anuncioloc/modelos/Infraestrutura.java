package com.example.anuncioloc.modelos;


public class Infraestrutura {
    private int id;
    private String nome;
    private double latitude;
    private double longitude;
    private int raio; // em metros
    private int capacidade;
    private String dataCadastro;

    public Infraestrutura(int id, String nome, double latitude, double longitude, int raio, int capacidade, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.raio = raio;
        this.capacidade = capacidade;
        this.dataCadastro = dataCadastro;
    }

    // Getters

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public int getRaio() { return raio; }
    public int getCapacidade() { return capacidade; }
    public String getDataCadastro() { return dataCadastro; }
}
