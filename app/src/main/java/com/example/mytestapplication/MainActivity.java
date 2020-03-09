package com.example.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCustomText;
    private EditText editTextName;

    public void onClickButton(View view){
        textViewCustomText.setText(editTextName.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v);
            }
        });

        textViewCustomText = findViewById(R.id.textViewCustomText);
        editTextName = findViewById(R.id.editTextName);
    }
}
