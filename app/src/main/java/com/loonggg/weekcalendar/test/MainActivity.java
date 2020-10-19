package com.loonggg.weekcalendar.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.loonggg.weekcalendar.view.WeekCalendar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    WeekCalendar weekCalendar;//自定义日历控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weekCalendar = (WeekCalendar) findViewById(R.id.week_calendar);

    }

    @Override
    protected void onResume() {
        super.onResume();
        weekCalendar.refreshTime();
    }
}
