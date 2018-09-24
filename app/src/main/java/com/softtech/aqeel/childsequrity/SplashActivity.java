package com.softtech.aqeel.childsequrity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    CardView cardlayout;
    Animation frombottom;
    Button signup_button;
    Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        cardlayout = findViewById(R.id.card_id);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        cardlayout.setAnimation(frombottom);
        login_button = findViewById(R.id.splash_login);
        signup_button = findViewById(R.id.splash_sign_up);
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(login_intent);
            }
        });
    }
}
