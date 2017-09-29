package com.inborn.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.fs.wheel.widget.WheelView;

public class MainActivity extends AppCompatActivity {
    private String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
    private TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_content = (TextView) findViewById(R.id.tv_content);

        WheelView wheel = (WheelView) findViewById(R.id.wheel);
        wheel.setOnItemSelectedListener(new WheelView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                tv_content.setText(nums[index]);
            }
        });
        wheel.setAdapter(new WheelView.WheelAdapter() {
            @Override
            protected int getItemCount() {
                return nums.length;
            }

            @Override
            protected String getItem(int index) {
                return nums[index];
            }
        });
    }
}
