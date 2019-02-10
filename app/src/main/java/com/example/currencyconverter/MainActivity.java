package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAmountToConvert;
    double multiplier = 1.3;

    public void convert(View view){
        Log.i("Info", "Button pressed");

        etAmountToConvert = (EditText) findViewById(R.id.editTextPoundsValue);

        double valueInPounds = Double.parseDouble(etAmountToConvert.getText().toString());
        double valueInDollar = valueInPounds*multiplier;

        Log.i("Info", "Input value: "+etAmountToConvert.getText().toString());

        Log.i("Info", "Converted value: "+valueInDollar);

        String formattedDollarValue = String.format("%.2f", valueInDollar);
        Toast.makeText(this, "£ "+valueInPounds+" = $ "+valueInDollar, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
