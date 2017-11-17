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



    public void SettingsBoton(View view) {
        Intent intent = new Intent(this, Dificultad.class);
        // EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void TheGame(View view){
        Intent intent = new Intent(this, TheGame.class);
        startActivity(intent);
    }

}
