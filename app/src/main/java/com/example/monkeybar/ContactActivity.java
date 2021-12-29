package com.example.monkeybar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
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

public class ContactActivity extends AppCompatActivity {

    private boolean droppedDown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
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

        //reservation and employment label on clicks
        TextView reservationLabel = (TextView) findViewById(R.id.clickHereReserve);
        reservationLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://themonkeybarandgrille.com/book-a-space"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });

        TextView employmentLabel = (TextView) findViewById(R.id.clickHereEmploy);
        employmentLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://themonkeybarandgrille.com/employment-application"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
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
                startActivity(new Intent(ContactActivity.this, MainActivity.class));
            }
        });
        final Button calendarButton = (Button) findViewById(R.id.CalendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calendarButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(ContactActivity.this, CalendarActivity.class));
            }
        });
        final Button foodButton = (Button) findViewById(R.id.FoodButton);
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                foodButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(ContactActivity.this, FoodActivity.class));
            }
        });
        final Button merchButton = (Button) findViewById(R.id.MerchButton);
        merchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                merchButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(ContactActivity.this, MerchActivity.class));
            }
        });
        final Button picutresButton = (Button) findViewById(R.id.PicturesButton);
        picutresButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                picutresButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(ContactActivity.this, PicturesActivity.class));
            }
        });
        final Button menuButton = (Button) findViewById(R.id.MenuButton);
        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                menuButton.setTextColor(Color.GRAY);
                startActivity(new Intent(ContactActivity.this, MenuActivity.class));
            }
        });

        //open phone
        TextView phoneLabel = (TextView) findViewById(R.id.phoneLabelClickable);
        phoneLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:+15137814246";
                i.setData(Uri.parse(p));
                startActivity(i);
            }
        });

        //open maps
        TextView addressLabel = (TextView) findViewById(R.id.addressLabelClickable);
        addressLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox?compose=GTvVlcSHvpBxGCWdLGZtgbsXPqmdZBPTNhtmXsnfLzLcDCjGPRDHxjzKZKVcWLwwDXPQzHjqRqJGc"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });

        //open email
        TextView emailLabel = (TextView) findViewById(R.id.emailLabelClickable);
        emailLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox?compose=GTvVlcSHvpBxGCWdLGZtgbsXPqmdZBPTNhtmXsnfLzLcDCjGPRDHxjzKZKVcWLwwDXPQzHjqRqJGc"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });

        //open instagram
        TextView instagramLabel = (TextView) findViewById(R.id.instagramLabelClickable);
        instagramLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/themonkeybarandgrille/?hl=en"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });

        //open facebook
        TextView facebookLabel = (TextView) findViewById(R.id.facebookLabelClickable);
        facebookLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/918921888496963"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });

        //open website
        TextView websiteLabel = (TextView) findViewById(R.id.websiteLabelClickable);
        websiteLabel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.themonkeybarandgrille.com/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
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
}
