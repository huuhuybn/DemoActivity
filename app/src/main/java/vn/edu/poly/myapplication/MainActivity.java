package vn.edu.poly.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("onCreate","onCreate");


        tvText = findViewById(R.id.textView);

        btnOK = findViewById(R.id.button);

        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivty.class);

                startActivity(intent);
            }
        });


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivty.class);

                startActivity(intent);

            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("onResume","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","onStop");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","onStart");

    }
}
