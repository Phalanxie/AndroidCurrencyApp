package com.example.assignment13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.telephony.TelephonyDisplayInfo;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.EventListener;
import java.util.IllegalFormatCodePointException;

public class ConvertCurrency extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent fromCurrency = getIntent();
        Intent toCurrency = getIntent();

        String from = fromCurrency.getStringExtra("currency1");
        String to = toCurrency.getStringExtra("currency2");

        ((TextView)findViewById(R.id.currency1)).setText(from);
        ((TextView)findViewById(R.id.currency2)).setText(to);

//        Button btn = findViewById(R.id.convertBtn);
//        btn.setOnClickListener(this::launchConvertCurrency);
    }

    public void launchCurrencySelect(View view)
    {
        Intent i = new Intent(this, CurrencySelect.class);
        /*String message = ((TextView)findViewById(R.id.editText)).getText().toString();
        i.putExtra("COOL", message);*/
        startActivity(i);
    }

    public void launchConvertCurrency(View view)
    {
        double fromCurrecy = ((Double.parseDouble(((TextView)findViewById(R.id.currencyInput)).getText().toString())));
        double toCurrency = 1;
        TextView currencyInput = findViewById(R.id.currencyInput);
        TextView currencyOutput = findViewById(R.id.currencyOutput);
//        currencyInput.setOnClickListener();
        /*TextView currency1 = findViewById(R.id.currency1);
        TextView currency2 = findViewById(R.id.currency2);
        TextView currencyOutput = findViewById(R.id.currencyOutput);*/

        /*TextView currency1 = findViewById(R.id.currency1);
        TextView currency2 = findViewById(R.id.currency2);*/
/*
        String baseCurrency = ((TextView)findViewById(R.id.currency1)).getText().toString();
        String convertedCurrency = ((TextView)findViewById(R.id.currency2)).getText().toString();*/

        TextView baseCurrency = findViewById(R.id.currency1);
        TextView convertedCurrency = findViewById(R.id.currency2);


        double conversionRate = 0f;
        double eh = 0f;
        if (baseCurrency.getText().toString().equals(convertedCurrency.getText().toString()))
        {

            Toast.makeText(this, "Cannot convert the same currency!", Toast.LENGTH_LONG).show();
        }

        /*Log.d("info", "success");*/

        /*-----------------------------------------iterations for USD-----------------------------------------*/
        if (baseCurrency.getText().toString().equals("USD") && convertedCurrency.getText().toString().equals("EUR"))
        {
            toCurrency = fromCurrecy * 0.8223007976;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("USD") && convertedCurrency.getText().toString().equals("JPY"))
        {
            toCurrency = fromCurrecy * 104.2184030919;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("USD") && convertedCurrency.getText().toString().equals("CAD"))
        {
            toCurrency = fromCurrecy * 1.2753885371;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("USD") && convertedCurrency.getText().toString().equals("HKD"))
        {
            toCurrency = fromCurrecy * 7.7554477428;
            currencyOutput.setText(Double.toString(toCurrency));
        }

        /*-----------------------------------------iterations for EUR-----------------------------------------*/
        if (baseCurrency.getText().toString().equals("EUR") && convertedCurrency.getText().toString().equals("USD"))
        {
            toCurrency = fromCurrecy * 1.20425;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("EUR") && convertedCurrency.getText().toString().equals("JPY"))
        {
            toCurrency = fromCurrecy * 126.74;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("EUR") && convertedCurrency.getText().toString().equals("CAD"))
        {
            toCurrency = fromCurrecy * 1.551;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("EUR") && convertedCurrency.getText().toString().equals("HKD"))
        {
            toCurrency = fromCurrecy * 9.4314;
            currencyOutput.setText(Double.toString(toCurrency));
        }

        /*-----------------------------------------iterations for JPY-----------------------------------------*/
        if (baseCurrency.getText().toString().equals("JPY") && convertedCurrency.getText().toString().equals("USD"))
        {
            toCurrency = fromCurrecy * 0.0095952343;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("JPY") && convertedCurrency.getText().toString().equals("EUR"))
        {
            toCurrency = fromCurrecy * 0.0078901688;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("JPY") && convertedCurrency.getText().toString().equals("CAD"))
        {
            toCurrency = fromCurrecy * 0.0122376519;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("JPY") && convertedCurrency.getText().toString().equals("HKD"))
        {
            toCurrency = fromCurrecy * 	0.0744153385;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        /*-----------------------------------------iterations for CAD-----------------------------------------*/
        if (baseCurrency.getText().toString().equals("CAD") && convertedCurrency.getText().toString().equals("USD"))
        {
            toCurrency = fromCurrecy * 	0.7840747905;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("CAD") && convertedCurrency.getText().toString().equals("EUR"))
        {
            toCurrency = fromCurrecy * 0.6447453256;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("CAD") && convertedCurrency.getText().toString().equals("JPY"))
        {
            toCurrency = fromCurrecy * 81.7150225661;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("CAD") && convertedCurrency.getText().toString().equals("HKD"))
        {
            toCurrency = fromCurrecy * 6.0808510638;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        /*-----------------------------------------iterations for HKD-----------------------------------------*/
        if (baseCurrency.getText().toString().equals("HKD") && convertedCurrency.getText().toString().equals("USD"))
        {
            toCurrency = fromCurrecy * 0.1289416205;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("HKD") && convertedCurrency.getText().toString().equals("EUR"))
        {
            toCurrency = fromCurrecy * 0.1060287974;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("HKD") && convertedCurrency.getText().toString().equals("JPY"))
        {
            toCurrency = fromCurrecy * 	13.4380897852;
            currencyOutput.setText(Double.toString(toCurrency));
        }
        else if (baseCurrency.getText().toString().equals("HKD") && convertedCurrency.getText().toString().equals("CAD"))
        {
            toCurrency = fromCurrecy * 	0.1644506648;
            currencyOutput.setText(Double.toString(toCurrency));
        }


    }

    /*public EventListener listener(TextView view)
    {
        view = findViewById(R.id.currencyInput);
        TextView fromC = findViewById(R.id.currency1);
        if (fromC == "USD")
    }*/
}