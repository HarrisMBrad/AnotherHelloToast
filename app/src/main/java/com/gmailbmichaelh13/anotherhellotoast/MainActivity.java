package com.gmailbmichaelh13.anotherhellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.CollationElementIterator;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private int nCount = 0;
    private TextView nShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        nShowCount = (TextView) findViewById( R.id.show_count );
    }

    public void showToast(View view) {
       Toast toast = Toast.makeText( this, "Hello Crispy Toast!",
               Toast.LENGTH_SHORT );
       toast.show();
    }

    CollationElementIterator nshowCount = null;



        public void countUp(View view) {
           nCount++;
           if(nShowCount != null)
               nShowCount.setText(Integer.toString(nCount));
}
}
