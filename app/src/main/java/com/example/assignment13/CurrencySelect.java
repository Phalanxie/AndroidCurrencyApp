package com.example.assignment13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class CurrencySelect extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_select);

        Resources res = getResources();
        String[] currencies = res.getStringArray(R.array.currencies);
//        String[] items = new String[]{"USD","EUR","JPY","CAD","HKD"};

        Spinner select = findViewById(R.id.fromCurrencyInput);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, currencies);
//        select.getSelectedItem();

        select.setAdapter(adapter);
//        select.setOnItemClickListener();

        String selected = select.getSelectedItem().toString();
        Log.d("zone", selected);

//        launchConvertCurrency(selected);
//        Intent input = new Intent(this, ConvertCurrency.class)
//        Intent input = Intent(this, ConvertCurrency.class);
//        input.putExtra("currency1", selected);

        /*we can find the item, now we need a listener to pick the one selected
        String st = select.getAdapter().getItem(0).toString();
        Log.d("cows", st);*/

        /*if (select.performClick())
        {
            Intent i = new Intent(this, ConvertCurrency.class);
            Object obj =  select.getAdapter().getItem(0).toString();
            String out = obj.toString();
            Log.d("cows",out);
            i.putExtra("cow", out);
        }*/


        Spinner select2 = findViewById(R.id.toCurrencyInput);
//        String[] items2 = new String[]{"USD","EUR","JPY","CAD","HKD"};
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//        select2.setAdapter(adapter);


//        String button = ((SpinnerAdapter)(R.id.fromCurrencyInput)).getItem();
    }

    // Implement the OnClickListener callback

    /*public void inputCurrencyListener(View spinner)
    {

        // do something when the button is clicked
        Spinner spinner1 = (Spinner)spinner;
        Log.d("cow", ((String)spinner1.getSelectedItem().toString()));
    }
    public void outputCurrencyListener(View spinner)
    {
        // do something when the button is clicked

        spinner.findViewById(R.id.toCurrencyInput);
    }*/



    /*public void setFromCurrency(AdapterView.OnItemSelectedListener listener)
    {
        listener.onItemSelected();
    }
*/




    public void launchConvertCurrency(View view)
    {

        /*select.getAdapter().getItem(launchConvertCurrency(view));
        Log.d("adapt",)*/
        Spinner sel = findViewById(R.id.fromCurrencyInput);
        Spinner sel2 = findViewById(R.id.toCurrencyInput);

        sel.getSelectedItem();
        sel2.getSelectedItem();

        String currency1 = sel.getSelectedItem().toString();
        String currency2 = sel2.getSelectedItem().toString();

        Intent i = new Intent(this, ConvertCurrency.class);
        /*Spinner input = findViewById(R.id.fromCurrencyInput).get
        Log.d("cur",input);*/
        /*String message = ((TextView)findViewById(R.id.editText)).getText().toString();
        i.putExtra("COOL", message);*/
        i.putExtra("currency1", currency1);
        i.putExtra("currency2", currency2);

        startActivity(i);
    }

}