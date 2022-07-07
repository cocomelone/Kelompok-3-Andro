package com.azhar.pdfreport;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edbb, edtinggi, edimt, edket;
    TextView indeksmassatubuh;
    Button bthitung;
    Double vbb, vtinggi, vimt ;
    String vket;
    TextView keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edbb = (EditText)findViewById(R.id.edbb);
        edtinggi = (EditText)findViewById(R.id.edtinggi);
        bthitung = (Button) findViewById(R.id.bthitung);
        indeksmassatubuh = (TextView) findViewById(R.id.texindeksmassatubuh);
        keterangan = (TextView) findViewById(R.id.textketerangan);
    }

    @SuppressLint("SetTextI18n")
    public void hitung(View view) {
        vbb = Double.parseDouble(edbb.getText().toString());
        vtinggi = Double.parseDouble(edtinggi.getText().toString());

        vimt = vbb / ((vtinggi/100)*(vtinggi/100));

        if (vimt < 18.5){
            vket = "Berat Badan Kurang";
        }
        else if (vimt >= 18.5 && vimt <25){
            vket = "Berat Badan Ideal";
        }
        else if (vimt >= 25 && vimt <30){
            vket = "Berat Badan Berlebih";
        }
        else {
            vket = "Anda gemuk,kurangi INDOMIE+TELOR+NASI!! ";
        }
        indeksmassatubuh.setText(" "+ vimt);
        keterangan.setText(" " + vket);
    }
}