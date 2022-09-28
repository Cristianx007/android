package mx.edu.tesoem.isc.g7s21.p37s2120222ljce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    Button btncalcula;
    TextView lblresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresult = findViewById(R.id.lblresult);

        btncalcula = findViewById(R.id.btncalcula);
        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt( txtnum1.getText().toString());
                int num2 =Integer.parseInt( txtnum2.getText().toString());

                lblresult.setText(lblresult.getText().toString()+"  "+String.valueOf(num1+num2));
            }
        });
    }
}