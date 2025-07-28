const express = require("express");
const cors = require("cors");
const fetch = require("node-fetch");

const app = express();
app.use(cors());
app.use(express.text({ type: "*/*" }));

const SOAP_ENDPOINT = "http://localhost:8080/AnunciosLocService";

app.post("/login", async (req, res) => {
  try {
    const response = await fetch(SOAP_ENDPOINT, {
      method: "POST",
     headers: {
  "Content-Type": "text/xml;charset=UTF-8",
  "SOAPAction": '""'  // com aspas
},
      body: req.body
    });
    const result = await response.text();
    res.send(result);
  } catch (err) {
    console.error("Erro no proxy:", err);
    res.status(500).send("Erro ao acessar o serviço SOAP");
  }
});

app.listen(3001, () => console.log(" Proxy rodando em http://localhost:3001"));
app.post("/cadastrarInfraestrutura", async (req, res) => {
  try {
    const response = await fetch(SOAP_ENDPOINT, {
      method: "POST",
      headers: {
        "Content-Type": "text/xml;charset=UTF-8",
        "SOAPAction": '""'
      },
      body: req.body
    });

    const result = await response.text();
    res.send(result);
  } catch (err) {
    console.error("Erro no proxy:", err);
    res.status(500).send("Erro ao acessar o serviço SOAP");
  }
});

