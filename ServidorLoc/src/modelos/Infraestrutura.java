package modelos;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "infraestrutura")
@XmlType(propOrder = {"nome", "latitude", "longitude", "raio", "capacidade"})
public class Infraestrutura implements Serializable {
    private String nome;
    private double latitude;
    private double longitude;
    private int raio;       // em metros
    private int capacidade; // número de utilizadores

    public Infraestrutura() {}

    public Infraestrutura(String nome, double latitude, double longitude, int raio, int capacidade) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.raio = raio;
        this.capacidade = capacidade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
}
