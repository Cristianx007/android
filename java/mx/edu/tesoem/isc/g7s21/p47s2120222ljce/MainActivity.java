package mx.edu.tesoem.isc.g7s21.p47s2120222ljce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnmsuma,btnmresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmsuma = findViewById(R.id.btnmsuma);
        btnmresta = findViewById(R.id.btnmresta);

        btnmsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psuma = new Intent(MainActivity.this,SumaActivity.class);
                startActivity(psuma);


            }
        });

        btnmresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RestaActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}