package com.example.dam_uc4_valdivieso;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;






import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn2 = findViewById(R.id.idButtonLogin);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Primero haga un registro", Toast.LENGTH_SHORT).show());

        Button btn1 = findViewById(R.id.idButtonRegistro);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Registrado", Toast.LENGTH_SHORT).show());

        TextView tv2 = findViewById(R.id.idTextViewRegistrar);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Consulte con escuela", Toast.LENGTH_SHORT).show());




    }
}