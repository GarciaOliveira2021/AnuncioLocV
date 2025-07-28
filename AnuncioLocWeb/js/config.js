// config.js - Configurações globais do sistema AnunciosLoc

const CONFIG = {
  endpointSOAP: "http://localhost:8080/AnunciosLoc?wsdl",
  gestorEmailPadrao: "admin@gestor.com",
  senhaPadrao: "1234",
  ambiente: "desenvolvimento", // ou 'producao'

  mensagens: {
    erroLogin: "Credenciais inválidas. Tente novamente.",
    sucessoCadastro: "Infraestrutura cadastrada com sucesso!",
    erroCadastro: "Erro ao cadastrar infraestrutura."
  }
};
