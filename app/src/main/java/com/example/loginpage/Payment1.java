package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payment1 extends AppCompatActivity {

    Button cash,upi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment1);

        cash = findViewById(R.id.btn_payment_cash);
        upi = findViewById(R.id.btn_payment_upi);

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Payment1.this, "Your order has been placed", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Payment1.this, Restaurant_MainScreen_User.class);
                startActivity(i);
            }
        });

        upi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to upi screen
                Intent i = new Intent(Payment1.this, Payment.class);
                startActivity(i);

            }
        });
    }
}
