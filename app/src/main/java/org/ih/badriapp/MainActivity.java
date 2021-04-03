package org.ih.badriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        Intent intent = new Intent(this,RS.class);
        startActivity(intent);
    }

    public void clickPolisi(View view) {
        Intent intent = new Intent(this,Polisi.class);
        startActivity(intent);
    }

    public void clickMarket(View view) {
        Intent intent = new Intent(this,Market.class);
        startActivity(intent);
    }

    public void clickSekolah(View view) {
        Intent intent = new Intent(this,Sekolah.class);
        startActivity(intent);
    }
}