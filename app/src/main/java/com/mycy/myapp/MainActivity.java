package com.mycy.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mycy.myapp.R;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
              
        View include1 = findViewById(R.id.data1);
        View include2 = findViewById(R.id.data2);
        View include3 = findViewById(R.id.data3);
        View include4 = findViewById(R.id.data4);
        View include5 = findViewById(R.id.data5);
        View include6 = findViewById(R.id.data6);
        View include7 = findViewById(R.id.data7);
     

        TextView textView1 = include1.findViewById(R.id.data_title); 
        textView1.setText("Progress");

        TextView textView2 = include2.findViewById(R.id.data_title); 
        textView2.setText("Advancement");

        TextView textView3 = include3.findViewById(R.id.data_title); 
        textView3.setText("Growth");

        TextView textView4 = include4.findViewById(R.id.data_title); 
        textView4.setText("Evolution");

        TextView textView5 = include5.findViewById(R.id.data_title); 
        textView5.setText("Improvement");

        TextView textView6 = include6.findViewById(R.id.data_title); 
        textView6.setText("Enhancement");

        TextView textView7 = include7.findViewById(R.id.data_title); 
        textView7.setText("Maturation");
       
    }
}
