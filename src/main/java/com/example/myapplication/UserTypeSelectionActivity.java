package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class UserTypeSelectionActivity extends AppCompatActivity {

    private Button btnAdminUser, btnMemberUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type_selection);

        btnAdminUser = findViewById(R.id.btnAdminUser);
        btnMemberUser = findViewById(R.id.btnMemberUser);

        // Set onClickListener for the Admin User button to navigate to the AdminLoginActivity
        btnAdminUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserTypeSelectionActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnMemberUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserTypeSelectionActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for the Member User button if needed
        // btnMemberUser.setOnClickListener(...);
    }
}
