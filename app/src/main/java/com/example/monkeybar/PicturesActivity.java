package com.example.monkeybar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class PicturesActivity extends AppCompatActivity
{
    private boolean droppedDown = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        int images[] = {R.drawable.barview, R.drawable.barview1, R.drawable.barview2, R.drawable.barview3, R.drawable.barview4, R.drawable.barview5, R.drawable.barview6,
                R.drawable.barview7, R.drawable.barview8, R.drawable.barview9, R.drawable.barview10, R.drawable.barview11, R.drawable.barview12};

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
        ImageView topBanner = (ImageView) findViewById(R.id.TopBanner);
        topBanner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showDropdown();
            }
        });
        final TextView historyLabel = (TextView) findViewById(R.id.historyLabel);
        historyLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://themonkeybarandgrille.com/our-building"));
                startActivity(intent);
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
                startActivity(new Intent(PicturesActivity.this, MainActivity.class));
            }
        });
        final Button calendarButton = (Button) findViewById(R.id.CalendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calendarButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(PicturesActivity.this, CalendarActivity.class));
            }
        });
        final Button foodButton = (Button) findViewById(R.id.FoodButton);
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                foodButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(PicturesActivity.this, FoodActivity.class));
            }
        });
        final Button merchButton = (Button) findViewById(R.id.MerchButton);
        merchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                merchButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(PicturesActivity.this, MerchActivity.class));
            }
        });
        final Button contactButton = (Button) findViewById(R.id.ContactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contactButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(PicturesActivity.this, ContactActivity.class));
            }
        });
        final Button menuButton = (Button) findViewById(R.id.MenuButton);
        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                menuButton.setTextColor(Color.GRAY);
                startActivity(new Intent(PicturesActivity.this, MenuActivity.class));
            }
        });

        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.ImageSlideShow);

        //for loop for flipper
        for(int i = 0; i< images.length; i++)
        {
            flipperImages(images[i]);
        }
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
    public void flipperImages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.ImageSlideShow);
        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        //animation
        flipper.setInAnimation(this, android.R.anim.fade_in);
        flipper.setOutAnimation(this, android.R.anim.fade_out);
    }
}
