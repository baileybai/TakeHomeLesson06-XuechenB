package com.example.springtakehomeassignment06_xuechenb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.springtakehomeassignment06_xuechenb.R;

public class MainActivity extends AppCompatActivity {
    private DetailInformation result;
    private Integer amount;
    private Integer taxPercentage;
    private Integer tipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) getView("Button1");
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            Button button = (Button) v;

            EditText e1 = (EditText) getView("message1");
            EditText e2 = (EditText) getView("message2");
            EditText e3 = (EditText) getView("message3");

            amount = Integer.parseInt(e1.getText().toString());
            taxPercentage = Integer.parseInt(e2.getText().toString());
            tipPercentage = Integer.parseInt(e3.getText().toString());
            result = new DetailInformation(amount, taxPercentage, tipPercentage);
            jump();
        }
    };

    private View getView(String sID) {
        int ID = getResources().getIdentifier(sID, "id", getPackageName());
        return findViewById(ID);
    }

    public void jump() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(StaticConstants.RESULT_KEY, result);
        startActivity(intent);
    }


}
