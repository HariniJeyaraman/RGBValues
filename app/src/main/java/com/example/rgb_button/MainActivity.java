package com.example.rgb_button;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        layout=(ConstraintLayout)findViewById(R.id.layout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Random random=new Random();
              int color1=Color.rgb(random.nextInt(255),random.nextInt(256),random.nextInt(255));
              layout.setBackgroundColor(color1);
              ColorDrawable viewColor = (ColorDrawable) layout.getBackground();
              int colorId = viewColor.getColor();
              int r=Color.red(colorId);
              int g=Color.green(colorId);
              int b=Color.blue(colorId);
              String s=" ";
              s=s+"R : "+r+" G : "+g+" B : "+b;
              text.setText(s);
            }

        });
    }
}
