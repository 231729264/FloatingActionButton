package com.getbase.floatingactionbutton.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;


public class MainActivity2 extends Activity implements View.OnClickListener {
    Button clearButton;
    Button colorButton;
    LinePathView linePathView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        initView();
    }

    public void initView() {
        linePathView = findViewById(R.id.linePathView);
        clearButton = (Button) findViewById(R.id.clear);
        clearButton.setOnClickListener(this);
        colorButton = (Button) findViewById(R.id.color);
        colorButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clear:
                linePathView.clear();
                break;
            case R.id.color:
                linePathView.setPenColor(Color.parseColor("#8dacd5"));
                break;
        }
    }
}
