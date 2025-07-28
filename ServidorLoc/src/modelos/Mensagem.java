package modelos;



import java.io.Serializable;
import java.util.Date;

public class Mensagem implements Serializable {
    private String titulo;
    private String conteudo;
    private String autor; // email do autor
    private String infraestruturaNome;
    private Date data;

    public Mensagem() {}

    public Mensagem(String titulo, String conteudo, String autor, String infraestruturaNome) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.infraestruturaNome = infraestruturaNome;
        this.data = new Date(); // agora
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getConteudo() { return conteudo; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getInfraestruturaNome() { return infraestruturaNome; }
    public void setInfraestruturaNome(String infraestruturaNome) { this.infraestruturaNome = infraestruturaNome; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
}
