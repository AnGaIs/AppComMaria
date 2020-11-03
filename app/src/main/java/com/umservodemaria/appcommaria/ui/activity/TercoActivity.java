package com.umservodemaria.appcommaria.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.umservodemaria.appcommaria.R;
import com.umservodemaria.appcommaria.ui.view.tercos.AveMariaActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.RosaESActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TBatalhaActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TDImaculaCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TDMisericorActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TDesagravoCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TImaculadoCoCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TLSRosaMistiCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TLibertacaoCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TNAssuncaoCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TNsaGracasCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TNsaMaeJeActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TNsaSSacraCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TProvidenciaCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TSmiguelCActivity;
import com.umservodemaria.appcommaria.ui.view.tercos.TStaChagasCActivity;

public class TercoActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terco);
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
            Intent it = new Intent(TercoActivity.this,MainActivity.class);
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
                fragment = new AveMariaActivity();
                break;
            case R.id.nav_menu2:
                fragment = new TBatalhaActivity();
                break;
            case R.id.nav_menu3:
                fragment = new TDesagravoCActivity();
                break;
            case R.id.nav_menu4:
                fragment = new TDMisericorActivity();
                break;

            case R.id.nav_menu5:
                fragment = new TLSRosaMistiCActivity();
                break;
            case R.id.nav_menu6:
                fragment = new TLibertacaoCActivity();
                break;

            case R.id.nav_menu7:
                fragment = new TImaculadoCoCActivity();
                break;

            case R.id.nav_menu8:
                fragment = new TNAssuncaoCActivity();
                break;
            case R.id.nav_menu9:
                fragment = new TNsaGracasCActivity();
                break;
            case R.id.nav_menu10:
                fragment = new TNsaMaeJeActivity();
                break;
            case R.id.nav_menu11:
                fragment = new TNsaSSacraCActivity();
                break;

            case R.id.nav_menu12:
                fragment = new TProvidenciaCActivity();
                break;
            case R.id.nav_menu13:
                fragment = new RosaESActivity();
                break;

            case R.id.nav_menu14:
                fragment = new TSmiguelCActivity();
                break;

            case R.id.nav_menu15:
                fragment = new TStaChagasCActivity();
                break;

            case R.id.nav_menu16:
                fragment = new TDImaculaCActivity();
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
