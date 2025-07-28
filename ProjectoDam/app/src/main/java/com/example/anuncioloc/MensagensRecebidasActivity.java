package com.example.anuncioloc;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MensagensRecebidasActivity extends AppCompatActivity {

    ListView listaMensagens;
    List<String> mensagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens_recebidas);

        listaMensagens = findViewById(R.id.listaMensagens);

        // Simulando mensagens recebidas do servidor
        mensagens.add("Promoção: 20% de desconto na loja da praça.");
        mensagens.add("Evento: Feira comunitária amanhã às 9h.");
        mensagens.add("Aviso: Interrupção de energia hoje às 18h.");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                mensagens
        );

        listaMensagens.setAdapter(adapter);
    }
}
