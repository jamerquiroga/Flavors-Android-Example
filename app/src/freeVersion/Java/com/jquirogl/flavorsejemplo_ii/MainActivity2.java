package com.jquirogl.flavorsejemplo_ii;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jquirogl on 08/11/2017.
 */

public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.myTextView) TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        myTextView.setText("App Gratuita");
    }
}
