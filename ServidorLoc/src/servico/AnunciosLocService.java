package servico;

import manager.UtilizadorManager;
import manager.InfraestruturaManager;
import manager.MensagemManager;
import modelos.Infraestrutura;
import modelos.Mensagem;
import modelos.Utilizador;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
import javax.jws.WebParam;
@WebService
public class AnunciosLocService {

    private UtilizadorManager utilizadorManager = new UtilizadorManager();
    private InfraestruturaManager infraestruturaManager = new InfraestruturaManager();
    private MensagemManager mensagemManager = new MensagemManager();

  

    @WebMethod
    public String loginGestor(
        @WebParam(name = "email") String email,
        @WebParam(name = "senha") String senha
    ) {
        System.out.println("Tentativa de login: " + email + " | " + senha);
        
        List<Utilizador> usuarios = utilizadorManager.listarTodos();
        for (Utilizador u : usuarios) {
            System.out.println("Verificando: " + u.getEmail() + " | " + u.getSenha() + " | " + u.getTipo());
            if (u.getEmail().equalsIgnoreCase(email)
                && u.getSenha().equals(senha)
                && u.getTipo().equals("gestor")) {
                return "sucesso";
            }
        }
        return "falha";
    }




    // Cadastrar utilizador
    @WebMethod
    public String cadastrarUtilizador(@WebParam(name = "utilizador") Utilizador u) {
        return utilizadorManager.cadastrar(u);
    }

    // Ativar utilizador
    @WebMethod
    public boolean ativarUtilizador(@WebParam(name = "email") String email) {
        return utilizadorManager.ativarUtilizador(email);
    }

    // Consultar saldo de um utilizador
    @WebMethod
    public double consultarSaldo(@WebParam(name = "email") String email) {
        return utilizadorManager.consultarSaldo(email);
    }

    // Cadastrar nova infraestrutura
    @WebMethod
    public String cadastrarInfraestrutura(@WebParam(name = "infraestrutura") Infraestrutura i) {
        System.out.println("🚀 Recebido cadastro de: " + i.getNome());
        infraestruturaManager.cadastrar(i);
        return "infraestrutura_cadastrada";
    }
    // Listar todas as infraestruturas cadastradas
    @WebMethod
    public List<Infraestrutura> listarInfraestruturas() {
        return infraestruturaManager.listar();
    }

    // Postar mensagem associada a uma infraestrutura
    @WebMethod
    public String postarMensagem(@WebParam(name = "mensagem") Mensagem m) {
        mensagemManager.postar(m);
        return "mensagem_postada";
    }

    // Listar mensagens postadas por um utilizador
    @WebMethod
    public List<Mensagem> receberMensagem(@WebParam(name = "email") String email) {
        return mensagemManager.listarPorUtilizador(email);
    }

    // Listar mensagens associadas a uma infraestrutura
    @WebMethod
    public List<Mensagem> mensagensPorInfraestrutura(@WebParam(name = "nomeInfraestrutura") String nomeInfraestrutura) {
        return mensagemManager.listarPorInfraestrutura(nomeInfraestrutura);
    }
}
