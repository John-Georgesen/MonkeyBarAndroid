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

public class FoodActivity extends AppCompatActivity
{
    private boolean droppedDown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
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
                startActivity(new Intent(FoodActivity.this, MainActivity.class));
            }
        });
        final Button calendarButton = (Button) findViewById(R.id.CalendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calendarButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(FoodActivity.this, CalendarActivity.class));
            }
        });
        final Button contactButton = (Button) findViewById(R.id.ContactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contactButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(FoodActivity.this, ContactActivity.class));
            }
        });
        final Button merchButton = (Button) findViewById(R.id.MerchButton);
        merchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                merchButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(FoodActivity.this, MerchActivity.class));
            }
        });
        final Button picutresButton = (Button) findViewById(R.id.PicturesButton);
        picutresButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                picutresButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(FoodActivity.this, PicturesActivity.class));
            }
        });
        final Button menuButton = (Button) findViewById(R.id.MenuButton);
        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                menuButton.setTextColor(Color.GRAY);
                startActivity(new Intent(FoodActivity.this, MenuActivity.class));
            }
        });


        //food truck buttons onclick
        Button bgs = (Button) findViewById(R.id.blackShirtButton);
        bgs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bgsgrill.com/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button streetButton = (Button) findViewById(R.id.streetButton);
        streetButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://streetfoodfinder.com/c/oh/columbus"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button bitemeButton = (Button) findViewById(R.id.blueShirtButton);
        bitemeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitemecorndogs.com/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button wickedButton = (Button) findViewById(R.id.whiteHoodieButton);
        wickedButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TheWickedLobstah/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });


        Button carbosButton = (Button) findViewById(R.id.forestGreenShirtButton);
        carbosButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://carbonarasgrill.com/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button martyButton = (Button) findViewById(R.id.orangeShirtButton);
        martyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.martyswaffles.com/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button cheesechongButton = (Button) findViewById(R.id.grayShirtButton);
        cheesechongButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cheesenchong.com/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button jButton = (Button) findViewById(R.id.greenShirtButton);
        jButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/JsFishTaco"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button stellarButton = (Button) findViewById(R.id.pinkShirtButton);
        stellarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/SSECincy/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button seaButton = (Button) findViewById(R.id.redShirtButton);
        seaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/SEACuisineFoodtruck/"));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    System.out.println(e);
                }
            }
        });
        Button mexicoButton = (Button) findViewById(R.id.spiderHoodButton);
        mexicoButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tasteofmexicocincinnati/"));
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
