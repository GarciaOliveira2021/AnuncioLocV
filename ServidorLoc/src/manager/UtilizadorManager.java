package manager;

	import persistencia.BancoDados;

import java.util.List;

import modelos.Utilizador;

	public class UtilizadorManager {

	    // Ativa o utilizador pelo email
	    public boolean ativarUtilizador(String email) {
	        for (Utilizador u : BancoDados.utilizadores) {
	            if (u.getEmail().equalsIgnoreCase(email)) {
	                u.setAtivo(true);
	                return true;
	            }
	        }
	        return false;
	    }

	    // Retorna saldo fictício (exemplo)
	    public double consultarSaldo(String email) {
	        for (Utilizador u : BancoDados.utilizadores) {
	            if (u.getEmail().equalsIgnoreCase(email)) {
	                return u.getSaldo(); // getter fictício
	            }
	        }
	        return 0.0;
	    }
	    

	    // Adiciona novo utilizador
	    public String cadastrar(Utilizador novo) {
	        for (Utilizador u : BancoDados.utilizadores) {
	            if (u.getEmail().equalsIgnoreCase(novo.getEmail())) {
	                return "email_ja_utilizado";
	            }
	        }
	        BancoDados.utilizadores.add(novo);
	        return "cadastrado";
	    }

		public List<Utilizador> listarTodos() {
			 return BancoDados.utilizadores;
		}
	}


