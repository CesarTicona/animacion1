package com.example.cesar.amimaciones_study_jam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import static com.example.cesar.amimaciones_study_jam.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private ImageView imagen1;
    private ImageView imagen2;

    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen1 = (ImageView) findViewById(R.id.minion);
        imagen2 = (ImageView) findViewById(R.id.minion2);



    }
}
