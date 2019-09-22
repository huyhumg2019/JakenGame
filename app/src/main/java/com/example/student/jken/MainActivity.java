package com.example.student.jken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int flag= random.nextInt(3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = findViewById(R.id.imageView);
        final ImageView imageView2 = findViewById(R.id.imageView2);
        final TextView textView = findViewById(R.id.textView);
        final ImageButton gu = findViewById(R.id.gu);
        final ImageButton choki = findViewById(R.id.choki);
        final ImageButton pa = findViewById(R.id.pa);
        gu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag) {
                    case 0:
                        textView.setText("負けました");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.gu);
                        imageView.setImageResource(R.drawable.pa);
                        break;
                    case 1:
                        textView.setText("勝ちました");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.gu);
                        imageView.setImageResource(R.drawable.choki);
                        break;
                    case 2:
                        textView.setText("あいご");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.gu);
                        imageView.setImageResource(R.drawable.gu);
                        break;
                }
                flag = random.nextInt(3);
            }
        });
        choki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag) {
                    case 0:
                        textView.setText("勝ちました");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.choki);
                        imageView.setImageResource(R.drawable.pa);
                        break;
                    case 1:
                        textView.setText("あいご");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.choki);
                        imageView.setImageResource(R.drawable.choki);
                        break;
                    case 2:
                        textView.setText("負けました");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.choki);
                        imageView.setImageResource(R.drawable.gu);
                        break;
                }
                flag = random.nextInt(3);
            }
        });
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag) {
                    case 0:
                        textView.setText("あいご");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.pa);
                        imageView.setImageResource(R.drawable.pa);
                        break;
                    case 1:
                        textView.setText("負けました");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.pa);
                        imageView.setImageResource(R.drawable.choki);
                        break;
                    case 2:
                        textView.setText("勝ちました");
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.setImageResource(R.drawable.pa);
                        imageView.setImageResource(R.drawable.gu);
                        break;
                }
               flag = random.nextInt(3);
            }
        });

    }
}
