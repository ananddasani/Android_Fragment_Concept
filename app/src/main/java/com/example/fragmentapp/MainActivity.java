package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button frag1, frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = findViewById(R.id.frag1);
        frag2 = findViewById(R.id.frag2);

        //set on click listener
        frag1.setOnClickListener(this);
        frag2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.frag1:

                FragmentOne fragmentOne = new FragmentOne();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, fragmentOne);
                transaction.commit();

                break;

            case R.id.frag2:

                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.linearLayout, fragmentTwo);
                transaction1.commit();

                break;
        }
    }
}