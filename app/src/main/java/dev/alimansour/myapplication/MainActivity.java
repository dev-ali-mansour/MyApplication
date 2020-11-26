package dev.alimansour.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button welcomeButton;
    EditText nameEditText;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeButton = findViewById(R.id.welcomeButton);
        nameEditText = findViewById(R.id.nameEditText);
        clearButton = findViewById(R.id.clearButton);

        welcomeButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == welcomeButton) {
            String fullName = nameEditText.getText().toString();
            Toast.makeText(this, "Welcome back " + fullName, Toast.LENGTH_LONG).show();
        } else if (v == clearButton) {
            nameEditText.setText("");
        }
    }
}