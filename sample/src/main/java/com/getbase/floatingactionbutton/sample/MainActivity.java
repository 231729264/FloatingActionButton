package com.getbase.floatingactionbutton.sample;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mylibrary.FloatingActionButton;
import com.example.mylibrary.FloatingActionsMenu;


public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //a
    final FloatingActionButton actionA = (FloatingActionButton) findViewById(R.id.action_a);
    actionA.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MainActivity.this,"a checked",Toast.LENGTH_SHORT).show();
      }
    });
    final View actionB = findViewById(R.id.action_b);//b
    actionB.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this,"b checked",Toast.LENGTH_SHORT).show();
      }
    });
    final View actionC = findViewById(R.id.action_c);//c
    actionC.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this,"c is checked",Toast.LENGTH_SHORT).show();
      }
    });
    final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.multiple_actions);
//    menuMultipleActions.setCollRotation(180f);
//    menuMultipleActions.setExpandRotation(180f);
    menuMultipleActions.setDrawableResources(R.drawable.ditu);
  }
}
