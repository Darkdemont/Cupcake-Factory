package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class activity_member_home extends AppCompatActivity {

    private Button btnViewCupcakes, btnOrderCupcakes, btnViewOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_home);

        btnViewCupcakes = findViewById(R.id.btnViewCupcakes);
        btnOrderCupcakes = findViewById(R.id.btnOrderCupcakes);
        btnViewOrder = findViewById(R.id.btnViewOrder);

        btnViewCupcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the ViewCupcakes Activity
                Intent intent = new Intent(activity_member_home.this, ViewCupcakes.class);
                startActivity(intent);
            }
        });

//        btnOrderCupcakes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Navigate to the Order Cupcakes Activity
//                Intent intent = new Intent(activity_member_home.this, OrderCupcakesActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btnViewOrder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Navigate to the View Order Activity
//                Intent intent = new Intent(activity_member_home.this, ViewOrderActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}


