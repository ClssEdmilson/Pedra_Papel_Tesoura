package com.clssEd.pedra_papel_tesoura;

import static com.clssEd.pedra_papel_tesoura.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra (View view){
        opcaoEscolhida("pedra");
    }

    public void papel (View view){
        opcaoEscolhida("papel");
    }

    public void tesoura (View view){
        opcaoEscolhida("tesoura");
    }


    public void opcaoEscolhida(String opcao_escolhida){

        ImageView image = findViewById(R.id.resultado_image);
        TextView texto = findViewById(R.id.Texto_Resultado);

        int rand = new Random().nextInt(3);
        String[] opcoesApp = { "pedra", "papel", "tesoura" };
        String opcaoApp = opcoesApp[rand];

        switch (opcaoApp){
            case("pedra"):
                image.setImageResource(pedra);
                    if(opcao_escolhida == "pedra") {
                        texto.setText("Empatamos");
                    }
                    else if(opcao_escolhida == "tesoura"){
                        texto.setText("Você perdeu!");
                    }
                    else{
                        texto.setText("Você ganhou!");
                    }
                break;
            case("papel"):
                image.setImageResource(papel);
                if(opcao_escolhida == "pedra") {
                    texto.setText("Você perdeu!");
                }
                else if(opcao_escolhida == "tesoura"){
                    texto.setText("Você ganhou!");
                }
                else{
                    texto.setText("Empatamos!");
                }
                break;
            case("tesoura"):
                image.setImageResource(tesoura);
                if(opcao_escolhida == "pedra") {
                    texto.setText("Você ganhou!");
                }
                else if(opcao_escolhida == "tesoura"){
                    texto.setText("Empatamos!");
                }
                else{
                    texto.setText("Você perdeu!");
                }
                break;
            default:
                break;
        }
    }
}