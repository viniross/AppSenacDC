package com.example.appsenac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCenciasNatureza, btnTecnico, btnLinguagens, btnMatematica, btnCienciasHumanas, btnProjetoProfissional, btnProjetoDeVida, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCenciasNatureza = findViewById(R.id.btnCienciasNatureza);
        btnCenciasNatureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CienciasDaNatureza = new Intent(getApplicationContext(), CienciasDaNaturezaActivity.class);
                startActivity(CienciasDaNatureza);
            }
        });

        btnTecnico = findViewById(R.id.btnTecnico);
        btnTecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tecnico = new Intent(getApplicationContext(), TecnicoActivity.class);
                startActivity(Tecnico);
            }
        });

        btnLinguagens = findViewById(R.id.btnLinguagens);
        btnTecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Linguagens = new Intent(getApplicationContext(), LinguagensActivity.class);
                startActivity(Linguagens);
            }
        });

        btnMatematica = findViewById(R.id.btnMatematica);
        btnMatematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Matematica = new Intent(getApplicationContext(), LinguagensActivity.class);
                startActivity(Matematica);
            }
        });

        btnCienciasHumanas = findViewById(R.id.btnCienciasHumanas);
        btnCienciasHumanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CienciasHumanas = new Intent(getApplicationContext(), CienciasHumanasActivity.class);
                startActivity(CienciasHumanas);
            }
        });

        btnProjetoProfissional = findViewById(R.id.btnProjetoProfissional);
        btnProjetoProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProjetoProfissional = new Intent(getApplicationContext(), ProjetoProfissionalActivity.class);
                startActivity(ProjetoProfissional);
            }
        });

        btnProjetoDeVida = findViewById(R.id.btnProjetoDeVida);
        btnProjetoDeVida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProjetoDeVida = new Intent(getApplicationContext(), ProjetoDeVidaActivity.class);
                startActivity(ProjetoDeVida);
            }
        });

        btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });
    }
}