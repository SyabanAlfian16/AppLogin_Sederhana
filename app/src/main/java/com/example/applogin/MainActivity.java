package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username_valid = "usm";
        String password_valid = "jaya";

        EditText edUsername = (EditText) findViewById(R.id.edUsername);
        EditText edPassword = (EditText) findViewById(R.id.edPassword);

        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((edUsername.getText().toString().trim().isEmpty()) || (edPassword.getText().toString().trim().isEmpty())) {
                    // Jika salah satu isian ada yang kosong
                    Toast.makeText(getApplicationContext(), "Data yang dimasukan salah", Toast.LENGTH_SHORT).show();
                }else{
                    // jika kedua isian telah terisi
                    if ((edUsername.getText().toString().trim().equals(username_valid)) && (edPassword.getText().toString().trim().equals(password_valid))){
                        // Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();

                        Intent inten_dashboard = new Intent(MainActivity.this, DashboardActivity.class);
                        inten_dashboard.putExtra("username", username_valid);
                        startActivity(inten_dashboard);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}