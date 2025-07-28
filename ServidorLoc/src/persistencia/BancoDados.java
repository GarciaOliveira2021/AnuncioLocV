package persistencia;



	import modelos.Infraestrutura;
	import modelos.Mensagem;
	import modelos.Utilizador;

	import java.util.ArrayList;
	import java.util.List;

	public class BancoDados {

	    // Lista estática de utilizadores
	    public static List<Utilizador> utilizadores = new ArrayList<>();

	    // Lista estática de infraestruturas
	    public static List<Infraestrutura> infraestruturas = new ArrayList<>();

	    // Lista estática de mensagens
	    public static List<Mensagem> mensagens = new ArrayList<>();

	    // Bloco estático para dados iniciais
	    static {
	        // Usuário gestor padrão
	        Utilizador gestor = new Utilizador("Administrador", "admin@anunciosloc.com", "admin123", "gestor");
	        gestor.setAtivo(true);
	        gestor.setSaldo(100.0); // exemplo de saldo

	        utilizadores.add(gestor);

	        // Infraestrutura de exemplo
	        Infraestrutura infra = new Infraestrutura("Praça Central", -8.839, 13.242, 200, 50);
	        infraestruturas.add(infra);
	    }
	    
	    
	}


