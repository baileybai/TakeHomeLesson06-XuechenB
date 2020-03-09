package com.example.springtakehomeassignment06_xuechenb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent Intent = getIntent();

        DetailInformation result = (DetailInformation) Intent.getSerializableExtra(StaticConstants.RESULT_KEY);

        TextView textView = (TextView) getView("A2_T1");
        textView.setText(result.toString());

    }

    private View getView(String sID) {
        int ID = getResources().getIdentifier(sID, "id", getPackageName());
        return findViewById(ID);
    }
}
