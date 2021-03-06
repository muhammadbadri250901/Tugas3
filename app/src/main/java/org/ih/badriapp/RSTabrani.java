package org.ih.badriapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSTabrani extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center", "SMS Center", "Driving Direction", "Website", "Info Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilpilihan(pilihan);
    }

    private void tampilpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center"))
            {
                String notel = "tel:0761 35464";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(notel));
            }
            else if (pilihan.equals("SMS Center"))
            {
                String smsText = "Ikhwan Habibi/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081244444444"));
                a.putExtra("sms_body", smsText );
            }
            else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "https://goo.gl/maps/fn5CCB2m5VXdRJjm7";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            }
            else if (pilihan.equals("Website"))
            {
                String website = "http://rstabrani.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            }
            else if (pilihan.equals("Info Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Tabrani");
            } else {
                a = new Intent(this,RS.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
