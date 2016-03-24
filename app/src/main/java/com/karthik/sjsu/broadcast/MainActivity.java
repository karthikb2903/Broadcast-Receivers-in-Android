package com.karthik.sjsu.broadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText amount;
    private TextView res;
    public static String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        amount = (EditText) findViewById(R.id.amountEditTxt);
        res = (TextView) findViewById(R.id.result);

    }




    public void convertToPound(View v) {

       double pAmt = Double.valueOf(amount.getText().toString());

        // 1 dollar is 0.72 pounds
        double pound = pAmt * 0.72;
        Intent i = new Intent();
        i.setAction("com.karthik.sjsu.result_CUSTOM_EVENT");
        msg = "Converted to Pounds : " + pound;
        i.putExtra("message", msg);
        sendBroadcast(i);

        res.setText(Double.toString(pound)+" Pounds");



    }

    public void convertToEuro(View v) {

        double eAmt = Double.valueOf(amount.getText().toString());
        // 1 dollar is 0.92 euros
        double euro = (double) eAmt * 0.92;
        Intent i = new Intent();
        i.setAction("com.karthik.sjsu.result_CUSTOM_EVENT");
        msg = "Converted to Euros : " + euro;
        i.putExtra("message", msg);
        sendBroadcast(i);

        res.setText(Double.toString(euro)+" Euros");


    }

    public void convertToRupee(View v) {

        double rAmt = Double.valueOf(amount.getText().toString());
        // 1 dollar is 67.59 rupees
        double rupee = (double) rAmt * 67.59;
        Intent i = new Intent();
        i.setAction("com.karthik.sjsu.result_CUSTOM_EVENT");
        msg = "Converted to Rupees : " + rupee;
        i.putExtra("message", msg);
        sendBroadcast(i);

        res.setText(Double.toString(rupee)+" Rupees");


    }

    public void exitApp(View v){

        finish();
        System.exit(0);

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
