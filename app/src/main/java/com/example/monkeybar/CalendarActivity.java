package com.example.monkeybar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CalendarActivity extends AppCompatActivity
{
    private boolean droppedDown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageView topBanner = (ImageView) findViewById(R.id.TopBanner);
        topBanner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showDropdown();
            }
        });

        //dropdown stuff
        LinearLayout dropdownList = (LinearLayout) findViewById(R.id.DropdownList);
        dropdownList.setVisibility(View.INVISIBLE);

        Button dropdownButton = (Button) findViewById(R.id.DDDropdown);
        dropdownButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showDropdown();
            }
        });

        //dropdown buttons
        final Button homeButton = (Button) findViewById(R.id.HomeButton);
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                homeButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(CalendarActivity.this, MainActivity.class));
            }
        });
        final Button foodButton = (Button) findViewById(R.id.FoodButton);
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                foodButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(CalendarActivity.this, FoodActivity.class));
            }
        });
        final Button contactButton = (Button) findViewById(R.id.ContactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contactButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(CalendarActivity.this, ContactActivity.class));
            }
        });
        final Button merchButton = (Button) findViewById(R.id.MerchButton);
        merchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                merchButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(CalendarActivity.this, MerchActivity.class));
            }
        });
        final Button picutresButton = (Button) findViewById(R.id.PicturesButton);
        picutresButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                picutresButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(CalendarActivity.this, PicturesActivity.class));
            }
        });
        final Button menuButton = (Button) findViewById(R.id.MenuButton);
        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                menuButton.setTextColor(Color.GRAY);
                startActivity(new Intent(CalendarActivity.this, MenuActivity.class));
            }
        });

        //open google calendar in webview
        WebView calendarView = (WebView) findViewById(R.id.calendarWebView);
        WebSettings webSettings = calendarView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        calendarView.loadUrl("https://calendar.google.com/calendar/embed?src=rn0oj632dj9n4u4o9s42v671jg%40group.calendar.google.com&ctz=America%2FNew_York");

        //calendar button
        Button calendarBtn = (Button) findViewById(R.id.calendarIconButton);
        calendarBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToCalendar();
            }
        });
    }
    private void showDropdown()
    {
        LinearLayout dropdownList = (LinearLayout) findViewById(R.id.DropdownList);

        if(droppedDown == false)
        {
            dropdownList.setVisibility(View.VISIBLE);
        }
        else
        {
            dropdownList.setVisibility(View.INVISIBLE);
        }

        droppedDown = !droppedDown;
    }
    private void goToCalendar()
    {
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://calendar.google.com/calendar/embed?src=rn0oj632dj9n4u4o9s42v671jg%40group.calendar.google.com&ctz=America%2FNew_York"));
            startActivity(intent);
        }
        catch(ActivityNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
