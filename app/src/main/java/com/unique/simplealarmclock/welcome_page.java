package com.unique.simplealarmclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.simplealarmclock.activities.MainActivity;

public class
welcome_page extends AppCompatActivity {
    Button navigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set content view to the corresponding layout
        setContentView(R.layout.activity_welcome_page);
        navigate=findViewById(R.id.navigate_to_home);

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcome_page.this, MainActivity.class);
                startActivity(intent);
            }
        });





    }
}
