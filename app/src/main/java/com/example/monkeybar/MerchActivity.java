package com.example.monkeybar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Button;

public class MerchActivity extends AppCompatActivity
{
    private boolean droppedDown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merch);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //show beanie
        beanieButtonClick();

        ImageView topBanner = (ImageView) findViewById(R.id.TopBanner);
        topBanner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showDropdown();
            }
        });

        //navigation dropdown
        String[] entries = {"Home","Menu","Calendar", "Food Trucks","Contact Us", "Pictures"};
        ArrayAdapter<String> dropdownAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, entries);

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
                startActivity(new Intent(MerchActivity.this, MainActivity.class));
            }
        });
        final Button calendarButton = (Button) findViewById(R.id.CalendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calendarButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MerchActivity.this, CalendarActivity.class));
            }
        });
        final Button foodButton = (Button) findViewById(R.id.FoodButton);
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                foodButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MerchActivity.this, ContactActivity.class));
            }
        });
        final Button contactButton = (Button) findViewById(R.id.ContactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contactButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MerchActivity.this, ContactActivity.class));
            }
        });
        final Button picutresButton = (Button) findViewById(R.id.PicturesButton);
        picutresButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                picutresButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MerchActivity.this, PicturesActivity.class));
            }
        });
        final Button menuButton = (Button) findViewById(R.id.MenuButton);
        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                menuButton.setTextColor(Color.GRAY);
                startActivity(new Intent(MerchActivity.this, MenuActivity.class));
            }
        });

        Button beanieButton = (Button) findViewById(R.id.beanieTopButton);
        beanieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beanieButtonClick();
            }
        });
        Button hoodieButton = (Button) findViewById(R.id.hoodieButton);
        hoodieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hoodieButtonClick();
            }
        });
        Button shirteButton = (Button) findViewById(R.id.shirtButton);
        shirteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shirtButtonClick();
            }
        });
    }

    private void beanieButtonClick()
    {
        Button beanieButton = (Button) findViewById(R.id.beanieTopButton);
        beanieButton.setBackgroundResource(R.drawable.roundedbuttonblack);
        beanieButton.setTextColor(Color.parseColor("#FFFFFF"));

        Button shirtButton = (Button) findViewById(R.id.shirtButton);
        shirtButton.setBackgroundResource(R.drawable.roundedbutton);
        shirtButton.setTextColor(Color.parseColor("#000000"));

        Button hoodieButton = (Button) findViewById(R.id.hoodieButton);
        hoodieButton.setBackgroundResource(R.drawable.roundedbutton);
        hoodieButton.setTextColor(Color.parseColor("#000000"));

        ScrollView beanieScroll = (ScrollView) findViewById(R.id.beanieScroll);
        beanieScroll.setVisibility(View.VISIBLE);

        ScrollView shirtScroll = (ScrollView) findViewById(R.id.shirtScroll);
        shirtScroll.setVisibility(View.INVISIBLE);

        ScrollView hoodieScroll = (ScrollView) findViewById(R.id.hoodieScroll);
        hoodieScroll.setVisibility(View.INVISIBLE);
    }
    private void shirtButtonClick()
    {
        Button shirtButton = (Button) findViewById(R.id.shirtButton);
        shirtButton.setBackgroundResource(R.drawable.roundedbuttonblack);
        shirtButton.setTextColor(Color.parseColor("#FFFFFF"));

        Button hoodieButton = (Button) findViewById(R.id.hoodieButton);
        hoodieButton.setBackgroundResource(R.drawable.roundedbutton);
        hoodieButton.setTextColor(Color.parseColor("#000000"));

        Button beanieButton = (Button) findViewById(R.id.beanieTopButton);
        beanieButton.setBackgroundResource(R.drawable.roundedbutton);
        beanieButton.setTextColor(Color.parseColor("#000000"));

        ScrollView beanieScroll = (ScrollView) findViewById(R.id.beanieScroll);
        beanieScroll.setVisibility(View.INVISIBLE);

        ScrollView shirtScroll = (ScrollView) findViewById(R.id.shirtScroll);
        shirtScroll.setVisibility(View.VISIBLE);

        ScrollView hoodieScroll = (ScrollView) findViewById(R.id.hoodieScroll);
        hoodieScroll.setVisibility(View.INVISIBLE);
    }
    private void hoodieButtonClick()
    {
        Button hoodieButton = (Button) findViewById(R.id.hoodieButton);
        hoodieButton.setBackgroundResource(R.drawable.roundedbuttonblack);
        hoodieButton.setTextColor(Color.parseColor("#FFFFFF"));

        Button beanieButton = (Button) findViewById(R.id.beanieTopButton);
        beanieButton.setBackgroundResource(R.drawable.roundedbutton);
        beanieButton.setTextColor(Color.parseColor("#000000"));

        Button shirtButton = (Button) findViewById(R.id.shirtButton);
        shirtButton.setBackgroundResource(R.drawable.roundedbutton);
        shirtButton.setTextColor(Color.parseColor("#000000"));

        ScrollView beanieScroll = (ScrollView) findViewById(R.id.beanieScroll);
        beanieScroll.setVisibility(View.INVISIBLE);

        ScrollView shirtScroll = (ScrollView) findViewById(R.id.shirtScroll);
        shirtScroll.setVisibility(View.INVISIBLE);

        ScrollView hoodieScroll = (ScrollView) findViewById(R.id.hoodieScroll);
        hoodieScroll.setVisibility(View.VISIBLE);
    }
    private void showDropdown()
    {
        LinearLayout dropdownList = (LinearLayout) findViewById(R.id.DropdownList);
        Button beanieButton = (Button) findViewById(R.id.beanieTopButton);

        if(droppedDown == false)
        {
            dropdownList.setVisibility(View.VISIBLE);
            beanieButton.setVisibility(View.INVISIBLE);
        }
        else
        {
            dropdownList.setVisibility(View.INVISIBLE);
            beanieButton.setVisibility(View.VISIBLE);
        }

        droppedDown = !droppedDown;
    }
}
