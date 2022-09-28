package mx.edu.tesoem.isc.g7s21.p47s2120222ljce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {


    EditText txtnum1,txtnum2;

    Button btnscalcula,btnsregresa;

    TextView lblresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresult = findViewById(R.id.lblresult);

        btnscalcula = findViewById(R.id.btnscalcula);
        btnscalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt( txtnum1.getText().toString());
                int num2 = Integer.parseInt( txtnum2.getText().toString());

                lblresult.setText("El resultado es:"+String.valueOf(num1+num2));

            }
        });

        btnsregresa = findViewById(R.id.btnsregresa);
        btnsregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}