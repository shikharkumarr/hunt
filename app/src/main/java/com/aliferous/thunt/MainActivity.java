package com.aliferous.thunt;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toolbar;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.goToAppButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignUp.class));
            }
        });

        setSupportActionBar( findViewById(R.id.toolbar));

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setElevation(100);

    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
