package com.example.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import com.example.navigation.fragment.AboutFragment;
import com.example.navigation.fragment.ContactFragment;
import com.example.navigation.fragment.CourseFragment;
import com.example.navigation.fragment.GalleryFragment;
import com.example.navigation.fragment.HomeFragment;
import com.example.navigation.fragment.PrincipalFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.content, new HomeFragment()).commit();

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content,new HomeFragment()).commit();

        } else if (id == R.id.nav_gallery) {

            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content,new GalleryFragment()).commit();

        } else if (id == R.id.nav_About) {

            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content,new AboutFragment()).commit();

        } else if (id == R.id.nav_message) {

            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content,new PrincipalFragment()).commit();
            Toast.makeText(this,"sdsd",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_course) {

            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content,new CourseFragment()).commit();

        } else if (id == R.id.nav_contact) {
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content,new ContactFragment()).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
