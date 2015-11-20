package com.example.dylicious.mydoctors;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;


public class ViewDoc2 extends FragmentActivity {

    Button promptDayBtn;
    Calendar calendarConsult;
    String format = "";
    TimePicker consultTime;
    TextView consultTimeOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_doc22);

        consultTime = (TimePicker)findViewById(R.id.timePicker2);
        consultTimeOutput = (TextView)findViewById(R.id.ConsultTime);
        calendarConsult = Calendar.getInstance();

        int hour = calendarConsult.get(Calendar.HOUR_OF_DAY);
        int min = calendarConsult.get(Calendar.MINUTE);
        showTime(hour, min);

        Button stp3btn = (Button)findViewById(R.id.proceed3);
        stp3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentVD3 = new Intent (getApplicationContext(), ViewDoc3.class);
                startActivity(intentVD3);
            }
        });



    }

    public void setTime (View v)
    {
        int hour = consultTime.getCurrentHour();
        int min = consultTime.getCurrentMinute();
        showTime(hour, min);
    }

    public void showTime(int hour, int min) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        }
        else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
        consultTimeOutput.setText(new StringBuilder().append(hour).append(" : ").append(min)
                .append(" ").append(format));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_doc2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
