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

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        welcomeButton = findViewById(R.id.welcomeButton);
        nameEditText = findViewById(R.id.nameEditText);
        clearButton = findViewById(R.id.clearButton);

        welcomeButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        if (v == welcomeButton) {
            String fullName = nameEditText.getText().toString();
            String message;
            if (fullName.isEmpty())
                message = getString(R.string.full_name_hint);
            else message = getString(R.string.welcome_back) + " " + fullName;
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            String resource = getString(R.string.test_resource);
        } else if (v == clearButton) {
            nameEditText.setText("");
            Toast.makeText(this, getString(R.string.full_name_cleared_alert), Toast.LENGTH_LONG).show();
        }
    }
}