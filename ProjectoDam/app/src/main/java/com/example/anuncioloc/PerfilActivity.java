package com.example.anuncioloc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    private TextView nomeText, emailText, tipoText, dataRegistroText;
    private ImageView fotoPerfil;
    private Button btnLogout;

    // Simulação de dados do utilizador
    Usuario usuarioLogado = new Usuario(
            "João Manuel",
            "joao@email.com",
            "comum",
            "2025-07-26"
            //R.drawable.default_avatar // imagem de perfil simulada
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nomeText = findViewById(R.id.nomeText);
        emailText = findViewById(R.id.emailText);
        tipoText = findViewById(R.id.tipoText);
        dataRegistroText = findViewById(R.id.dataRegistroText);
        fotoPerfil = findViewById(R.id.fotoPerfil);
        btnLogout = findViewById(R.id.btnLogout);

        nomeText.setText("Nome: " + usuarioLogado.getNome());
        emailText.setText("Email: " + usuarioLogado.getEmail());
        tipoText.setText("Tipo: " + usuarioLogado.getTipo());
        dataRegistroText.setText("Membro desde: " + usuarioLogado.getDataRegistro());


        btnLogout.setOnClickListener(v -> {
            // Encerra a sessão e volta para o login
            startActivity(new Intent(PerfilActivity.this, LoginActivity.class));
            finish();
        });
    }

    // Classe simulada de modelo de usuário
    class Usuario {
        private String nome, email, tipo, dataRegistro;
        private int fotoPerfilResId;

        public Usuario(String nome, String email, String tipo, String dataRegistro) {
            this.nome = nome;
            this.email = email;
            this.tipo = tipo;
            this.dataRegistro = dataRegistro;

        }

        public String getNome() { return nome; }
        public String getEmail() { return email; }
        public String getTipo() { return tipo; }
        public String getDataRegistro() { return dataRegistro; }

    }
}
