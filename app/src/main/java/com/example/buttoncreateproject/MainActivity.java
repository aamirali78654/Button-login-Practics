package com.example.buttoncreateproject;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    EditText phone;
    TextView textviewa , fla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //



        //
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void players(View view) {
        LayoutInflater lf = getLayoutInflater();
       View vie = lf.inflate(R.layout.activity_custom_toast, (ViewGroup)findViewById(R.id.custom_toast1));
       phone = findViewById(R.id.editphone);
       fla = findViewById(R.id.texta);
       textviewa = vie.findViewById(R.id.text_ct);
       String name = phone.getText().toString();
       fla.setText("Number : "+name);
       textviewa.setText(name);
       Toast t = new Toast(getApplicationContext());
       t.setGravity(Gravity.CENTER, 0,0);
       t.setView(vie);
       t.setDuration(Toast.LENGTH_LONG);
       t.show();
    }
}