// main.js - Script principal para navegação entre telas (modo SPA simples)

document.addEventListener("DOMContentLoaded", function () {
  const routes = {
    "login": "Telas/login.html",
    "dashboard": "Telas/dashboard.html",
    "cadastro-local": "Telas/cadastro-local.html",
    "estatisticas": "Telas/estatisticas.html"
  };

  const container = document.getElementById("app");

  function navigate(page) {
    if (routes[page]) {
      fetch(routes[page])
        .then((res) => res.text())
        .then((html) => {
          container.innerHTML = html;
        });
    } else {
      container.innerHTML = "<p>Página não encontrada</p>";
    }
  }

  window.navigate = navigate;
  
  // Rota padrão
  navigate("login");
});
