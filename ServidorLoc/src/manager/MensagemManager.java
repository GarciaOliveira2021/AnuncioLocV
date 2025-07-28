package manager;



	import persistencia.BancoDados;
	import modelos.Mensagem;

	import java.util.ArrayList;
	import java.util.List;

	public class MensagemManager {

	    // Publicar nova mensagem
	    public void postar(Mensagem msg) {
	        BancoDados.mensagens.add(msg);
	    }

	    // Retorna mensagens associadas ao nome da infraestrutura
	    public List<Mensagem> listarPorInfraestrutura(String nomeInfra) {
	        List<Mensagem> lista = new ArrayList<>();
	        for (Mensagem m : BancoDados.mensagens) {
	            if (m.getInfraestruturaNome().equalsIgnoreCase(nomeInfra)) {
	                lista.add(m);
	            }
	        }
	        return lista;
	    }

	    // Retorna mensagens relacionadas ao email do utilizador
	    public List<Mensagem> listarPorUtilizador(String email) {
	        List<Mensagem> lista = new ArrayList<>();
	        for (Mensagem m : BancoDados.mensagens) {
	            if (m.getAutor().equalsIgnoreCase(email)) {
	                lista.add(m);
	            }
	        }
	        return lista;
	    }
	}


