package lechuzogames.hangmanbros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.annotation.SuppressLint;
import android.content.Intent;
/**
 * Created by sergi on 11/16/2017.
 */

public class Dificultad extends AppCompatActivity {

    public Dificultad(){

    }


    @SuppressLint({"NewApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificultad);
    }


    public void Morty_dif(View view){
        Intent intent = new Intent(this, TheGame.class);
        intent.putExtra("Numero de vidas: ",5);
    }
// aqui falta la dificultad mediana y dif Rick
}
