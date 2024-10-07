package com.example.cart_ease;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    Dialog dialog;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize and show the dialog
                dialog = new Dialog(MainActivity5.this);
                dialog.setContentView(R.layout.custom_dialog_box);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_bg));
                dialog.show();

                // Set up button5 in the dialog
                Button button5 = dialog.findViewById(R.id.button5);
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                        startActivity(intent);
                        dialog.dismiss(); // Dismiss the dialog
                        Toast.makeText(MainActivity5.this, "Account Created", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
