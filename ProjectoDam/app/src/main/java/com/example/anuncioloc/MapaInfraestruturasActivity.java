package com.example.anuncioloc;

import android.location.Location;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

import java.util.ArrayList;
import java.util.List;

public class MapaInfraestruturasActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private List<Infraestrutura> infraestruturaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        // Simula infraestruturas cadastradas
        infraestruturaList.add(new Infraestrutura("Praça Central", -8.8306, 13.2456));
        infraestruturaList.add(new Infraestrutura("Bairro Azul", -8.8421, 13.2512));

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapaInfra);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        for (Infraestrutura infra : infraestruturaList) {
            LatLng local = new LatLng(infra.getLatitude(), infra.getLongitude());
            mMap.addMarker(new MarkerOptions().position(local).title(infra.getNome()));
        }

        // Centraliza o mapa
        if (!infraestruturaList.isEmpty()) {
            LatLng foco = new LatLng(infraestruturaList.get(0).getLatitude(), infraestruturaList.get(0).getLongitude());
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(foco, 14));
        }
    }

    // Classe local (simulada) de infraestrutura
    class Infraestrutura {
        private String nome;
        private double latitude;
        private double longitude;

        public Infraestrutura(String nome, double lat, double lng) {
            this.nome = nome;
            this.latitude = lat;
            this.longitude = lng;
        }

        public String getNome() { return nome; }
        public double getLatitude() { return latitude; }
        public double getLongitude() { return longitude; }
    }
}
