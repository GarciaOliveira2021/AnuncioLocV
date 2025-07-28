#  AnunciosLoc

**AnunciosLoc** é um sistema distribuído de entrega de anúncios geolocalizados, desenvolvido no âmbito da unidade curricular de Desenvolvimento de Aplicações Móveis (FCN-UAN, 2024/25).

##  Funcionalidades

### Para Utilizadores (App Android):
-  Publicar e receber anúncios automaticamente com base na localização.
-  Autenticação segura via protocolo Kerberos.
- Visualização de locais e infraestruturas próximas.
-  Consulta de saldo de créditos.
- Recebimento de notificações de anúncios novos.

### Para Gestores (Interface Web):
-  Criar e gerir locais e infraestruturas (WiFi, GPS).
- Consultar estatísticas de utilização.
-  Definir políticas e restrições para entrega de anúncios.

 Tecnologias Utilizadas

- **Mobile:** Android (Java/Kotlin)
- **Backend:** Java + JAX-WS (Web Services SOAP)
- **Base de Dados:** PostgreSQL
- **Autenticação:** Kerberos v5
- **Serviços:** UDDI, SOAP, Tomcat
- **Outros:** Git, Figma, Draw.io

 Arquitetura

- Cliente-servidor com suporte híbrido (centralizado e P2P descentralizado).
- Entregas via localização GPS/WiFi e broadcast local.
- Replicação e logs com tolerância a falhas.

Estrutura

         # Este ficheiro
