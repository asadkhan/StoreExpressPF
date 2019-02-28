package com.example.irfan.storeexpressagas.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.irfan.storeexpressagas.R;
import com.example.irfan.storeexpressagas.baseclasses.BaseActivity;
import com.example.irfan.storeexpressagas.extras.MenuHandler;

public class AllStoresActivity extends BaseActivity implements  View.OnClickListener {

    ImageView img_shazz;
    TextView  txt_shazz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_allstore);
       /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_allstore);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_allstore);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_allstore);
        navigationView.setNavigationItemSelectedListener(this);
*/
        img_shazz = (ImageView) findViewById(R.id.img_shazz);

        txt_shazz = (TextView) findViewById(R.id.txt_shazz);

        img_shazz.setOnClickListener(this);

        txt_shazz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.img_shazz:
                openActivity(MainActivity.class);
                break;

            case R.id.txt_shazz:

                //  showMessageDailogNextScreen("test","testing message",Login.class);
                openActivity(MainActivity.class);
                break;



        }

    }





    }
