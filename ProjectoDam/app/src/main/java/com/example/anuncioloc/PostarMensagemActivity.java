package com.example.anuncioloc;



import android.location.Location;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class PostarMensagemActivity extends AppCompatActivity {

    EditText tituloInput, conteudoInput;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postar_mensagem);

        tituloInput = findViewById(R.id.tituloMensagem);
        conteudoInput = findViewById(R.id.conteudoMensagem);
        btnEnviar = findViewById(R.id.btnEnviarMensagem);

        btnEnviar.setOnClickListener(v -> {
            String titulo = tituloInput.getText().toString().trim();
            String conteudo = conteudoInput.getText().toString().trim();

            if (titulo.isEmpty() || conteudo.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show();
                return;
            }

            // Simulação de envio via SOAP (pode ser substituído por SoapClient.postarMensagem())
            Toast.makeText(this, "Mensagem enviada com sucesso!", Toast.LENGTH_LONG).show();

            // Limpa os campos após envio
            tituloInput.setText("");
            conteudoInput.setText("");
        });
    }
}
