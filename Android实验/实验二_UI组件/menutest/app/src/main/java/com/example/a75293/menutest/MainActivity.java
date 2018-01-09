package com.example.a75293.menutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx=(TextView)findViewById(R.id.testtext);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.big:
                tx.setTextSize(20);
                break;

            case R.id.small:
                tx.setTextSize(10);
                break;

            case R.id.middle:
                tx.setTextSize(16);
                break;

            case R.id.common:
                Toast.makeText(this, "You click the common menu", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.black:
                tx.setTextColor(Color.parseColor("#080808"));
                break;

            case R.id.red:
                tx.setTextColor(Color.parseColor("#DC143C"));
                break;

        }
            return super.onOptionsItemSelected(item);
        }

}
