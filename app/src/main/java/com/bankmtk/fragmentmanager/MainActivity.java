package com.bankmtk.fragmentmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        Button add1 = (Button)findViewById(R.id.add1);
        add1.setOnClickListener(new ListenerOnAdd(fragment1));
        Button add2 = (Button)findViewById(R.id.add2);
        add2.setOnClickListener(new ListenerOnAdd(fragment2));
        Button add3 = (Button)findViewById(R.id.add3);
        add3.setOnClickListener(new ListenerOnAdd(fragment3));
        Button remove1 = (Button)findViewById(R.id.remove1);
        remove1.setOnClickListener(new ListenerOnRemove(fragment1));
        Button remove2 = (Button)findViewById(R.id.remove2);
        remove2.setOnClickListener(new ListenerOnRemove(fragment2));
        Button remove3 = (Button)findViewById(R.id.remove3);
        remove3.setOnClickListener(new ListenerOnRemove(fragment3));
        Button replace1 = (Button)findViewById(R.id.replace1);
        replace1.setOnClickListener(new ListenerOnReplace(fragment1));
        Button replace2 = (Button)findViewById(R.id.replace2);
        replace2.setOnClickListener(new ListenerOnReplace(fragment2));
        Button replace3 = (Button)findViewById(R.id.replace3);
        replace3.setOnClickListener(new ListenerOnReplace(fragment3));


    }
}
