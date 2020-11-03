package com.umservodemaria.appcommaria.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.umservodemaria.appcommaria.R;
import com.umservodemaria.appcommaria.ui.view.consagracao.CCoracaoActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CDivinoPaiActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CImaculadoActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CNsaAparecidaActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CNsaMercesActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CNsaNazareActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CSantissimaVActivity;

public class ConsagracaoActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consagracao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.consagracao, menu);
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
           Intent it = new Intent(ConsagracaoActivity.this,MainActivity.class);
           startActivity(it);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void displaySelectedScreen(int itemId) {

        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (itemId) {
            case R.id.nav_menu1:
                fragment = new CCoracaoActivity();
                break;
            case R.id.nav_menu2:
                fragment = new CDivinoPaiActivity();
                break;
            case R.id.nav_menu3:
                fragment = new CImaculadoActivity();
                break;
            case R.id.nav_menu4:
                fragment = new CNsaAparecidaActivity();
                break;

            case R.id.nav_menu5:
                fragment = new CNsaMercesActivity();
                break;
            case R.id.nav_menu6:
                fragment = new CNsaNazareActivity();
                break;

            case R.id.nav_menu7:
                fragment = new CSantissimaVActivity();
                break;

        }


        //replacing the fragment fragment != null
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        //calling the method displayselectedscreen and passing the id of selected menu
        displaySelectedScreen(item.getItemId());
        //make this method blank
        return true;
    }


}
