package lechuzogames.hangmanbros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;

public class MainActivityMenu extends AppCompatActivity {

    public MainActivityMenu(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }



    public void SettingButton(View view) {
        Intent intent = new Intent(this, Dificultad.class);
    ///crear clase player para ver score
        startActivity(intent);
    }

    public void TheGame(View view){
        Intent intent = new Intent(this, TheGame.class);
        startActivity(intent);
    }

}
