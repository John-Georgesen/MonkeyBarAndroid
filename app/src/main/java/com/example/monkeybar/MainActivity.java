package com.example.monkeybar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private boolean droppedDown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        final Button foodButtonDD = (Button) findViewById(R.id.FoodTrucksButton);
        foodButtonDD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                foodButtonDD.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MainActivity.this, FoodActivity.class));
            }
        });
        final Button calendarButtonDD = (Button) findViewById(R.id.CalendarButton);
        calendarButtonDD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calendarButtonDD.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MainActivity.this, CalendarActivity.class));
            }
        });
        final Button contactButtonDD = (Button) findViewById(R.id.ContactButton);
        contactButtonDD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contactButtonDD.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MainActivity.this, ContactActivity.class));
            }
        });
        final Button merchButtonDD = (Button) findViewById(R.id.merchButton);
        merchButtonDD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                merchButtonDD.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MainActivity.this, MerchActivity.class));
            }
        });
        final Button picutresButtonDD = (Button) findViewById(R.id.PicturesButton);
        picutresButtonDD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                picutresButtonDD.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MainActivity.this, PicturesActivity.class));
            }
        });
        final Button menuButtonDD = (Button) findViewById(R.id.MenuButton);
        menuButtonDD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                menuButtonDD.setTextColor(Color.GRAY);
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });

        //navigation buttons on homescreen
        final Button calendarButton = (Button)findViewById(R.id.CalendarNavButton);
        calendarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView calendarText = (TextView) findViewById(R.id.CalendarLabel);

                SpannableString content = new SpannableString("Calender");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                calendarText.setText(content);

                //set icon to black
                calendarText.setTextColor(0xFF000000);
                calendarButton.setBackgroundResource(R.drawable.calendaricon);

                //change app activity
                startActivity(new Intent(MainActivity.this, CalendarActivity.class));

                //wait 1 second and set back to white
                calendarButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        calendarButton.setBackgroundResource(R.drawable.calendariconwhite);
                        calendarText.setTextColor(0xFFFFFFFF);
                    }
                }, 1000);
            }
        });

        final TextView menuText = (TextView) findViewById(R.id.DrinkMenuLabel);
        menuText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final Button drinkMenuButton = (Button)findViewById(R.id.drinkMenuButton);

                SpannableString content = new SpannableString("Drink Menu");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                menuText.setText(content);

                //set to black
                drinkMenuButton.setBackgroundResource(R.drawable.drinkicon);
                menuText.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, MenuActivity.class));

                //wait 1 second and set back to black
                drinkMenuButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        menuText.setTextColor(0xFFFFFFFF);
                        drinkMenuButton.setBackgroundResource(R.drawable.drinkiconwhite);
                    }
                }, 1000);
            }
        });
        final Button drinkMenuButton = (Button)findViewById(R.id.drinkMenuButton);
        drinkMenuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView menuText = (TextView) findViewById(R.id.DrinkMenuLabel);

                SpannableString content = new SpannableString("Drink Menu");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                menuText.setText(content);

                //set to black
                drinkMenuButton.setBackgroundResource(R.drawable.drinkicon);
                menuText.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, MenuActivity.class));

                //wait 1 second and set back to black
                drinkMenuButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        menuText.setTextColor(0xFFFFFFFF);
                        drinkMenuButton.setBackgroundResource(R.drawable.drinkiconwhite);
                    }
                }, 1000);
            }
        });

        final Button foodTruckButton = (Button)findViewById(R.id.foodTruckButton);
        foodTruckButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView foodText = (TextView) findViewById(R.id.FoodButtonLabel);

                SpannableString content = new SpannableString("Food Trucks");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                foodText.setText(content);

                //set icon to black
                foodTruckButton.setBackgroundResource(R.drawable.foodtruckicon);
                foodText.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, FoodActivity.class));

                //wait 1 second and set back to white
                foodTruckButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        foodText.setTextColor(0xFFFFFFFF);
                        foodTruckButton.setBackgroundResource(R.drawable.foodtruckiconwhite);
                    }
                }, 1000);
            }
        });


        final TextView foodText = (TextView) findViewById(R.id.FoodButtonLabel);
        foodText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final Button foodTruckButton = (Button)findViewById(R.id.foodTruckButton);

                SpannableString content = new SpannableString("Food Trucks");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                foodText.setText(content);

                //set icon to black
                foodTruckButton.setBackgroundResource(R.drawable.foodtruckicon);
                foodText.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, FoodActivity.class));

                //wait 1 second and set back to white
                foodTruckButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        foodText.setTextColor(0xFFFFFFFF);
                        foodTruckButton.setBackgroundResource(R.drawable.foodtruckiconwhite);
                    }
                }, 1000);
            }
        });

        //music button
        final Button merchButton = (Button)findViewById(R.id.MerchButton);
        merchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView merchText = (TextView) findViewById(R.id.merchText);

                SpannableString content = new SpannableString("Monkey Merch");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                merchText.setText(content);

                //set icon to black
                merchButton.setBackgroundResource(R.drawable.clothesicon);
                merchText.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, MerchActivity.class));

                //wait 1 second and set back to white
                merchButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        merchText.setTextColor(0xFFFFFFFF);
                        merchButton.setBackgroundResource(R.drawable.clothesiconwhite);
                    }
                }, 1000);
            }
        });

        final TextView merchText = (TextView) findViewById(R.id.merchText);
        merchText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final Button merchButton = (Button)findViewById(R.id.MerchButton);

                SpannableString content = new SpannableString("Monkey Merch");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                merchText.setText(content);

                //set icon to black
                merchButton.setBackgroundResource(R.drawable.clothesicon);
                merchText.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, MerchActivity.class));

                //wait 1 second and set back to white
                merchButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        merchText.setTextColor(0xFFFFFFFF);
                        merchButton.setBackgroundResource(R.drawable.clothesiconwhite);
                    }
                }, 1000);
            }
        });

        //contact button
        final Button contactButton = (Button)findViewById(R.id.contactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView contactLabel = (TextView) findViewById(R.id.contactUsLabel);

                SpannableString content = new SpannableString("Contact Us");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                contactLabel.setText(content);

                //set icon to black
                contactButton.setBackgroundResource(R.drawable.contactusicon);
                contactLabel.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, ContactActivity.class));

                //wait 1 second and set back to white
                contactButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        contactLabel.setTextColor(0xFFFFFFFF);
                        contactButton.setBackgroundResource(R.drawable.contactusiconwhite);
                    }
                }, 1000);
            }
        });

        final TextView contactText = (TextView) findViewById(R.id.contactUsLabel);
        contactText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView contactLabel = (TextView) findViewById(R.id.contactUsLabel);

                SpannableString content = new SpannableString("Contact Us");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                contactLabel.setText(content);

                //set icon to black
                contactButton.setBackgroundResource(R.drawable.contactusicon);
                contactLabel.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, ContactActivity.class));

                //wait 1 second and set back to white
                contactButton.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        contactLabel.setTextColor(0xFFFFFFFF);
                        contactButton.setBackgroundResource(R.drawable.contactusiconwhite);
                    }
                }, 1000);
            }
        });

        //pictures button
        final Button picturesButton = (Button)findViewById(R.id.picturesButton);
        picturesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView picturesLabel = (TextView) findViewById(R.id.picturesLabel);

                SpannableString content = new SpannableString("Pictures");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                picturesLabel.setText(content);

                //set icon to black
                picturesButton.setBackgroundResource(R.drawable.picturesiconblack);
                picturesLabel.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, PicturesActivity.class));

                //wait 1 second and set back to white
                picturesButton.postDelayed(new Runnable()
                {
                    @Override
                    public void run() {
                        picturesLabel.setTextColor(0xFFFFFFFF);
                        picturesButton.setBackgroundResource(R.drawable.picturesiconwhite);
                    }
                }, 1000);
            }
        });

        final TextView picturesText = (TextView) findViewById(R.id.picturesLabel);
        picturesText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final TextView picturesLabel = (TextView) findViewById(R.id.picturesLabel);

                SpannableString content = new SpannableString("Pictures");
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                picturesLabel.setText(content);

                //set icon to black
                picturesButton.setBackgroundResource(R.drawable.picturesiconblack);
                picturesLabel.setTextColor(0xFF000000);

                //change app activity
                startActivity(new Intent(MainActivity.this, PicturesActivity.class));

                //wait 1 second and set back to white
                contactButton.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        picturesLabel.setTextColor(0xFFFFFFFF);
                        picturesButton.setBackgroundResource(R.drawable.picturesiconwhite);
                    }
                }, 1000);
            }
        });


    }
    private void showDropdown()
    {
        LinearLayout dropdownList = (LinearLayout) findViewById(R.id.DropdownList);

        Button calendarButton = (Button) findViewById(R.id.CalendarNavButton);
        Button menuButton = (Button) findViewById(R.id.drinkMenuButton);

        if(droppedDown == false)
        {
            calendarButton.setVisibility(View.INVISIBLE);
            menuButton.setVisibility(View.INVISIBLE);

            dropdownList.setVisibility(View.VISIBLE);
        }
        else
        {
            dropdownList.setVisibility(View.INVISIBLE);
            calendarButton.setVisibility(View.VISIBLE);
            menuButton.setVisibility(View.VISIBLE);
        }

        droppedDown = !droppedDown;
    }
}
