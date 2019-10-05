package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        EditText etNIM = findViewById(R.id.etNIM);
        EditText etProdi = findViewById(R.id.etProdi);
        EditText etTempatTanggalLahir = findViewById(R.id.etTempatTanggalLahir);
        EditText etAlamat = findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btDaftar = findViewById(R.id.btDaftar);

        btClear.setOnClickListener(v -> {
            etNama.setText("");
            etNIM.setText("");
            etProdi.setText("");
            etTempatTanggalLahir.setText("");
            etAlamat.setText("");

            etNama.requestFocus();
        });

        btDaftar.setOnClickListener(v -> {
            etNama.setText("");
            etNIM.setText("");
            etProdi.setText("");
            etTempatTanggalLahir.setText("");
            etAlamat.setText("");

            etNama.requestFocus();
            Toast.makeText(this, "anda telah terdaftar", Toast.LENGTH_SHORT).show();        });
    }
}
