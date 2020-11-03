package com.umservodemaria.appcommaria.ui.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.umservodemaria.appcommaria.R;

public class AboutActivity extends AppCompatActivity {

    TextView t;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Fontes Personalizada
        t= (TextView) findViewById(R.id.tex1);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t.setTypeface(myCustomFont);

        t1= (TextView) findViewById(R.id.usdm);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t1.setTypeface(myCustomFont1);

        t2= (TextView) findViewById(R.id.desen);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t2.setTypeface(myCustomFont2);

        t3= (TextView) findViewById(R.id.email0);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t3.setTypeface(myCustomFont3);

        t4= (TextView) findViewById(R.id.email1);
        Typeface myCustomFont4=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t4.setTypeface(myCustomFont4);

        t5= (TextView) findViewById(R.id.site0);
        Typeface myCustomFont5=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t5.setTypeface(myCustomFont5);

        t6= (TextView) findViewById(R.id.site1);
        Typeface myCustomFont6=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t6.setTypeface(myCustomFont6);

        t7= (TextView) findViewById(R.id.face0);
        Typeface myCustomFont7=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t7.setTypeface(myCustomFont7);

        t8= (TextView) findViewById(R.id.face1);
        Typeface myCustomFont8=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t8.setTypeface(myCustomFont8);

        t9= (TextView) findViewById(R.id.t0);
        Typeface myCustomFont9=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t9.setTypeface(myCustomFont9);

        t10= (TextView) findViewById(R.id.t1);
        Typeface myCustomFont10=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t10.setTypeface(myCustomFont10);

        t11= (TextView) findViewById(R.id.insta0);
        Typeface myCustomFont11=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t11.setTypeface(myCustomFont11);

        t12= (TextView) findViewById(R.id.insta1);
        Typeface myCustomFont12=Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        t12.setTypeface(myCustomFont12);

    }
    public void BrowseEmail(View view){
        TextView textView = (TextView) view;
        Intent emailIntent;
        emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"+textView.getText().toString()));

        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        } else {

        }

    }
    public void Browse(View view){
        TextView textView = (TextView) view;

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(textView.getText().toString()));
        startActivity(browserIntent);
    }



    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
        return;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                super.onBackPressed();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
