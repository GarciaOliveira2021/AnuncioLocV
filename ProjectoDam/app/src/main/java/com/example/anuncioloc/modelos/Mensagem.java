package com.example.anuncioloc.modelos;



public class Mensagem {
    private int id;
    private String titulo;
    private String conteudo;
    private int idUtilizador;
    private int idInfraestrutura;
    private String dataEnvio;
    private double latitude;
    private double longitude;
    private boolean visualizado;

    public Mensagem(int id, String titulo, String conteudo, int idUtilizador, int idInfraestrutura, String dataEnvio, double latitude, double longitude, boolean visualizado) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.idUtilizador = idUtilizador;
        this.idInfraestrutura = idInfraestrutura;
        this.dataEnvio = dataEnvio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.visualizado = visualizado;
    }

    // Getters e Setters

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getConteudo() { return conteudo; }
    public int getIdUtilizador() { return idUtilizador; }
    public int getIdInfraestrutura() { return idInfraestrutura; }
    public String getDataEnvio() { return dataEnvio; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public boolean isVisualizado() { return visualizado; }

    public void setVisualizado(boolean visualizado) { this.visualizado = visualizado; }
}
