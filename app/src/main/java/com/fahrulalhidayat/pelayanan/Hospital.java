package com.fahrulalhidayat.pelayanan;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] ListHospital = new String[] {"RS. AWAL BROSS", "RS. EKA HOSPITAL",
        "RS. JIWA TAMPAN", "RS. TABRANI"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,ListHospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("RS. AWAL BROSS")) {
                a = new Intent(this,RSAwalBross.class);

            } else if (pilihan.equals("RS. EKA HOSPITAL")) {

            }
            startActivity(a);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
