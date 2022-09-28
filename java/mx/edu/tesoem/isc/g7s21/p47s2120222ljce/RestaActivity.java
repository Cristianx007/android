package mx.edu.tesoem.isc.g7s21.p47s2120222ljce;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {

    EditText txtrnum1,txtrnum2;

    Button btnrcalcula,btnrregresa;

    TextView lblrresult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        txtrnum1 = findViewById(R.id.txtrnum1);
        txtrnum2 = findViewById(R.id.txtrnum2);
        lblrresult = findViewById(R.id.lblrresult);

        btnrcalcula = findViewById(R.id.btnrcalcula);
        btnrcalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtrnum1.getText().toString());
                int num2 = Integer.parseInt(txtrnum2.getText().toString());
                lblrresult.setText("El resultado es:"+String.valueOf(num1-num2));

            }
        });

        btnrregresa = findViewById(R.id.btnrregresa);
        btnrregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}