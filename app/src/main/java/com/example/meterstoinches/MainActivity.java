package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = (EditText) findViewById(R.id.metersEditText);
        convertButton = (Button) findViewById(R.id.convertid);
        resultTextview = (TextView) findViewById(R.id.resultid);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double mul=39.07;
                double res=0.0;
                if(enterMeters.getText().toString().equals(""))
                {
                    resultTextview.setText(R.string.error_msg);
                    resultTextview.setTextColor(Color.RED);
                }
                else
                {
                    double mvalue = Double.parseDouble(enterMeters.getText().toString());
                    res = mvalue*mul;
                    resultTextview.setTextColor(Color.BLUE);
                    resultTextview.setText(String.format("%.2f",res) + " inches");
                }


            }
        });

    }
}