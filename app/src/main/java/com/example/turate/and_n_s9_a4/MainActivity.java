package com.example.turate.and_n_s9_a4;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        registerForContextMenu(tv1);
    }


    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        TextView textView = (TextView) v.findViewById(R.id.tv1);
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }



    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.call) {
            Toast.makeText(this, "You selected CALL", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.sms){
            Toast.makeText(this,"You selected SMS",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.browse){
            Toast.makeText(this,"You selected Internet",Toast.LENGTH_LONG).show();
        }
        else{
            return false;
        }
        return true;
    }

}
