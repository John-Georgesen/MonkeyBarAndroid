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
import android.widget.ScrollView;

public class MenuActivity extends AppCompatActivity
{
    private boolean droppedDown = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

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

        //dropdown buttons
        final Button homeButton = (Button) findViewById(R.id.HomeButton);
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                homeButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        final Button calendarButton = (Button) findViewById(R.id.CalendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calendarButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MenuActivity.this, CalendarActivity.class));
            }
        });
        final Button foodButton = (Button) findViewById(R.id.FoodButton);
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                foodButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MenuActivity.this, FoodActivity.class));
            }
        });
        final Button merchButton = (Button) findViewById(R.id.MerchButton);
        merchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                merchButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MenuActivity.this, MerchActivity.class));
            }
        });
        final Button contactButton = (Button) findViewById(R.id.ContactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contactButton.setTextColor(Color.DKGRAY);
                startActivity(new Intent(MenuActivity.this, ContactActivity.class));
            }
        });
        final Button picturesButton = (Button) findViewById(R.id.PicturesButton);
        picturesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                picturesButton.setTextColor(Color.GRAY);
                startActivity(new Intent(MenuActivity.this, PicturesActivity.class));
            }
        });


        WebView onTapView = (WebView) findViewById(R.id.onTapWebView);
        WebSettings webSettings = onTapView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        onTapView.loadUrl("https://docs.google.com/presentation/d/e/2PACX-1vQh0ivKhILY0SrD_goWBQ1eRAyR1E6cdsIcyCbAX6cD5GqAqNX5Yz-MYfQt9oFK2jA-C1eTEkCEeEQN/embed?start=true&loop=true&delayms=5000&rm=minimal");

        WebView bourbonView = (WebView) findViewById(R.id.BourbonWebView);
        WebSettings webSettingsBourbon = bourbonView.getSettings();
        webSettingsBourbon.setJavaScriptEnabled(true);
        bourbonView.loadUrl("https://docs.google.com/presentation/d/e/2PACX-1vT1qY3Toe6Ynwu6GBFSbL8IO_emRQ96PrcS_xQQoUlrW2hpE138vwP1wuDErZRX4kWm3u3Hv-KgSUg5/embed?start=true&loop=false&delayms=60000&rm=minimal");

        WebView wineView = (WebView) findViewById(R.id.WineWebView);
        WebSettings webSettingsWine = wineView.getSettings();
        webSettingsWine.setJavaScriptEnabled(true);
        wineView.loadUrl("https://docs.google.com/presentation/d/e/2PACX-1vTpsHtAG_FQNng5iLtUHCMD8d3ATE-4akLN2bO-cAbiK7ByKA17aEWliMC9rLG3e1LFJZ_a4vgP67Al/embed?start=true&loop=true&delayms=5000&rm=minimal");

        WebView cocktailsView = (WebView) findViewById(R.id.CocktailsWebView);
        WebSettings webSettingsCocktails = cocktailsView.getSettings();
        webSettingsCocktails.setJavaScriptEnabled(true);
        cocktailsView.loadUrl("https://docs.google.com/presentation/d/e/2PACX-1vRGYoG_qpfcjcrlTdACJnJNRrOhwvQ5PoBcS5O59maskAvY2WkWuEjeYQUxmeP76Q/embed?start=false&loop=false&delayms=3000&rm=minimal");

        showBourbonView();

        //open cocktails tab
        Button cocktailButton = (Button) findViewById(R.id.cocktailsButton);
        cocktailButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showCocktailsView();
            }
        });

        //START OF LEFT SIDE NAV BUTTONS
        //bourbon button
        Button bourbonButton = (Button) findViewById(R.id.bourbonButton);
        bourbonButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showBourbonView();
            }
        });
        //wine button
        Button wineButton = (Button) findViewById(R.id.wineButton);
        wineButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showWineView();
            }
        });

        //onTap button
        Button onTap = (Button) findViewById(R.id.tapButton);
        onTap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ShowOnTapView();
            }
        });
        //END OF LEFT SIDE NAV BUTTONS

    }
    private void showDropdown()
    {
        LinearLayout dropdownList = (LinearLayout) findViewById(R.id.DropdownList);

        Button bourbonButton = (Button) findViewById(R.id.bourbonButton);
        Button onTapButton = (Button) findViewById(R.id.tapButton);

        if(droppedDown == false)
        {
            dropdownList.setVisibility(View.VISIBLE);
            bourbonButton.setVisibility(View.INVISIBLE);
            onTapButton.setVisibility(View.INVISIBLE);
        }
        else
        {
            dropdownList.setVisibility(View.INVISIBLE);
            bourbonButton.setVisibility(View.VISIBLE);
            onTapButton.setVisibility(View.VISIBLE);
        }

        droppedDown = !droppedDown;
    }

    private void ShowOnTapView()
    {
        //load the slides
        //change the ontap view to show the wine list instead of the on tap list
        WebView onTapView = (WebView) findViewById(R.id.onTapWebView);
        onTapView.setVisibility(View.VISIBLE);

        WebView cocktailsView = (WebView) findViewById(R.id.CocktailsWebView);
        cocktailsView.setVisibility(View.INVISIBLE);

        WebView bourbonView = (WebView) findViewById(R.id.BourbonWebView);
        bourbonView.setVisibility(View.INVISIBLE);

        WebView wineView = (WebView) findViewById(R.id.WineWebView);
        wineView.setVisibility(View.INVISIBLE);

        Button googleSlidesButton = (Button) findViewById(R.id.googleSlidesButton);
        googleSlidesButton.setVisibility(View.VISIBLE);

        //on tap open slides button
        googleSlidesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToGoogleSlidesOnTap();
            }
        });
    }
    private void showWineView()
    {
        WebView onTapView = (WebView) findViewById(R.id.onTapWebView);
        onTapView.setVisibility(View.INVISIBLE);

        WebView cocktailsView = (WebView) findViewById(R.id.CocktailsWebView);
        cocktailsView.setVisibility(View.INVISIBLE);

        WebView bourbonView = (WebView) findViewById(R.id.BourbonWebView);
        bourbonView.setVisibility(View.INVISIBLE);

        WebView wineView = (WebView) findViewById(R.id.WineWebView);
        wineView.setVisibility(View.VISIBLE);

        Button googleSlidesButton = (Button) findViewById(R.id.googleSlidesButton);
        googleSlidesButton.setVisibility(View.VISIBLE);

        //on tap open slides button
        googleSlidesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToGoogleSlidesWine();
            }
        });

    }
    private void showCocktailsView()
    {
        WebView onTapView = (WebView) findViewById(R.id.onTapWebView);
        onTapView.setVisibility(View.INVISIBLE);

        WebView cocktailsView = (WebView) findViewById(R.id.CocktailsWebView);
        cocktailsView.setVisibility(View.VISIBLE);

        ScrollView cocktailsScrollView = (ScrollView) findViewById(R.id.scrollViewCocktails) ;
        cocktailsScrollView.setVisibility(View.VISIBLE);

        ScrollView bourbonScrollView = (ScrollView) findViewById(R.id.scrollViewBourbon) ;
        bourbonScrollView.setVisibility(View.INVISIBLE);

        WebView bourbonView = (WebView) findViewById(R.id.BourbonWebView);
        bourbonView.setVisibility(View.INVISIBLE);

        WebView wineView = (WebView) findViewById(R.id.WineWebView);
        wineView.setVisibility(View.INVISIBLE);

        Button googleSlidesButton = (Button) findViewById(R.id.googleSlidesButton);
        googleSlidesButton.setVisibility(View.VISIBLE);

        //on tap open slides button
        googleSlidesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToGoogleSlidesCocktails();
            }
        });
    }
    private void showBourbonView()
    {
        WebView onTapView = (WebView) findViewById(R.id.onTapWebView);
        onTapView.setVisibility(View.INVISIBLE);

        ScrollView cocktailsScrollView = (ScrollView) findViewById(R.id.scrollViewCocktails) ;
        cocktailsScrollView.setVisibility(View.INVISIBLE);

        ScrollView bourbonScrollView = (ScrollView) findViewById(R.id.scrollViewBourbon) ;
        bourbonScrollView.setVisibility(View.VISIBLE);

        WebView cocktailsView = (WebView) findViewById(R.id.CocktailsWebView);
        cocktailsView.setVisibility(View.INVISIBLE);

        WebView bourbonView = (WebView) findViewById(R.id.BourbonWebView);
        bourbonView.setVisibility(View.VISIBLE);

        WebView wineView = (WebView) findViewById(R.id.WineWebView);
        wineView.setVisibility(View.INVISIBLE);

        Button googleSlidesButton = (Button) findViewById(R.id.googleSlidesButton);
        googleSlidesButton.setVisibility(View.VISIBLE);

        //on tap open slides button
        googleSlidesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToGoogleSlidesBourbon();
            }
        });
    }
    private void goToGoogleSlidesOnTap()
    {
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/presentation/d/e/2PACX-1vQh0ivKhILY0SrD_goWBQ1eRAyR1E6cdsIcyCbAX6cD5GqAqNX5Yz-MYfQt9oFK2jA-C1eTEkCEeEQN/embed?start=true&loop=true&delayms=5000&rm=minimal"));
            startActivity(intent);
        }
        catch(ActivityNotFoundException e)
        {
            System.out.println(e);
        }
    }
    private void goToGoogleSlidesWine()
    {
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/presentation/d/e/2PACX-1vTpsHtAG_FQNng5iLtUHCMD8d3ATE-4akLN2bO-cAbiK7ByKA17aEWliMC9rLG3e1LFJZ_a4vgP67Al/embed?start=true&loop=true&delayms=5000&rm=minimal"));
            startActivity(intent);
        }
        catch(ActivityNotFoundException e)
        {
            System.out.println(e);
        }
    }
    private void goToGoogleSlidesCocktails()
    {
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/presentation/d/e/2PACX-1vRGYoG_qpfcjcrlTdACJnJNRrOhwvQ5PoBcS5O59maskAvY2WkWuEjeYQUxmeP76Q/embed?start=false&loop=false&delayms=3000&rm=minimal"));
            startActivity(intent);
        }
        catch(ActivityNotFoundException e)
        {
            System.out.println(e);
        }
    }
    private void goToGoogleSlidesBourbon()
    {
        try
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/presentation/d/e/2PACX-1vT1qY3Toe6Ynwu6GBFSbL8IO_emRQ96PrcS_xQQoUlrW2hpE138vwP1wuDErZRX4kWm3u3Hv-KgSUg5/embed?start=true&loop=false&delayms=60000&rm=minimal"));
            startActivity(intent);
        }
        catch(ActivityNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
