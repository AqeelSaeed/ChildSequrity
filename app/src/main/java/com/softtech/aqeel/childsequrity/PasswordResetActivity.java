package com.softtech.aqeel.childsequrity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PasswordResetActivity extends AppCompatActivity {
    Button password_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);
        password_reset = findViewById(R.id.reset_password_button);
        password_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasswordResetActivity.this, CreatePassword.class);
                startActivity(intent);
            }
        });
    }
}
