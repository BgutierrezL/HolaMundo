package com.example.belen.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 *
 * Mi primera aplicación de Android
 * @author Belen Gutierrez
 * @version 1.0
 * @see android.app.Activity
 */
public class HolaMundoActivity extends AppCompatActivity {

    private TextView txvMessage;


    @Override
    //Comentario en linea
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        txvMessage= (TextView) findViewById(R.id.txvMessage);
        txvMessage.setText(R.string.second_message);
    }
}
