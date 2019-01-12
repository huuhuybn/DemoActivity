package vn.edu.poly.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnTotal;
    private EditText edtA, edtB;

    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("onCreate", "onCreate");


        btnTotal = findViewById(R.id.btnTotal);

        edtA = findViewById(R.id.edtA);

        edtB = findViewById(R.id.edtB);

        tvResult = findViewById(R.id.textView);


        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());

                int total = a + b;

                tvResult.setText(total + "");
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("onResume", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "onStop");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "onStart");

    }
}
