package com.example.kisii_national_polytechnic;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
  private DrawerLayout drawerLayout;
  private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//


        Toolbar toolbar= findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

//        ====add menu icon on top using actinbartoggle====
        drawerLayout= findViewById(R.id.drawer_layout);

        NavigationView navigationView= findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classHome()).commit();
            navigationView.setCheckedItem(R.id.nav_home);

        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_site:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classWebsite()).commit();
                break;
            case R.id.nav_portal:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classPortal()).commit();
                break;
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classHome()).commit();
                break;

            case R.id.nav_onlineApplication:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classOnlineCourse()).commit();
                break;

            case R.id.nav_departments:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classAcademicDepartments()).commit();
                break;

            case R.id.nav_programs:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classAcademicProgram()).commit();
                break;

            case R.id.nav_download:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classDownloads()).commit();
                break;

            case R.id.nav_share:

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Welcome to Kisiipoly Mobile App.Access all services via our App.";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Kisii National Polytechnic");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                break;

            case R.id.nav_faq:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classFaq()).commit();
                break;

            case R.id.nav_chat:
                Toast.makeText(this, "Lets chat", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classAssistant()).commit();
                break;

            case R.id.nav_info:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new classInfo()).commit();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    //===========when menu is preesed back==============
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
//        to make transparent background when menu pressed, create new style if the API level is 21>
    }
}
