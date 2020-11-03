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

import com.umservodemaria.appcommaria.R;
import com.umservodemaria.appcommaria.ui.view.consagracao.CCoracaoActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CDivinoPaiActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CImaculadoActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CNsaAparecidaActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CNsaMercesActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CNsaNazareActivity;
import com.umservodemaria.appcommaria.ui.view.consagracao.CSantissimaVActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NDepressaoActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NEspiritoSActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NFreiGActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NImaculadaCActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NJesusRMActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NMEnsanguentadasActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NMedalhaMi2Activity;
import com.umservodemaria.appcommaria.ui.view.novenas.NMedalhaMiActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaAparecidaActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaCarmoActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaDeNosActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaFatimaActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaGracasActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaGuadalupeActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaMercesActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaPpSocorroActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NPelasAlmasActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSagradoCJesusActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSantaEdithActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSantaMartaActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSantaMonicaActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSaoJoseActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSaoMiguelActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NSaoRafael;
import com.umservodemaria.appcommaria.ui.view.novenas.NStaRitaActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NStaTerezinhaActivity;
import com.umservodemaria.appcommaria.ui.view.novenas.NStoExpeditoActivity;

public class NovenasActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novenas);
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
            Intent it = new Intent(NovenasActivity.this,MainActivity.class);
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
                fragment = new NDepressaoActivity();
                break;
            case R.id.nav_menu2:
                fragment = new NEspiritoSActivity();
                break;
            case R.id.nav_menu3:
                fragment = new NFreiGActivity();
                break;
            case R.id.nav_menu4:
                fragment = new NImaculadaCActivity();
                break;

            case R.id.nav_menu5:
                fragment = new NJesusRMActivity();
                break;
            case R.id.nav_menu6:
                fragment = new NMEnsanguentadasActivity();
                break;

            case R.id.nav_menu7:
                fragment = new NMedalhaMiActivity();
                break;

            case R.id.nav_menu8:
                fragment = new NMedalhaMi2Activity();
                break;
            case R.id.nav_menu9:
                fragment = new NNsaAparecidaActivity();
                break;
            case R.id.nav_menu10:
                fragment = new NNsaGracasActivity();
                break;
            case R.id.nav_menu11:
                fragment = new NNsaMercesActivity();
                break;

            case R.id.nav_menu12:
                fragment = new NNsaFatimaActivity();
                break;
            case R.id.nav_menu13:
                fragment = new NNsaGuadalupeActivity();
                break;

            case R.id.nav_menu14:
                fragment = new NNsaDeNosActivity();
                break;
            case R.id.nav_menu15:
                fragment = new NNsaCarmoActivity();
                break;
            case R.id.nav_menu16:
                fragment = new NNsaPpSocorroActivity();
                break;
            case R.id.nav_menu17:
                fragment = new NPelasAlmasActivity();
                break;
            case R.id.nav_menu18:
                fragment = new NSagradoCJesusActivity();
                break;

            case R.id.nav_menu19:
                fragment = new NSantaEdithActivity();
                break;
            case R.id.nav_menu20:
                fragment = new NSantaMartaActivity();
                break;

            case R.id.nav_menu21:
                fragment = new NSantaMonicaActivity();
                break;

            case R.id.nav_menu22:
                fragment = new NStaRitaActivity();
                break;
            case R.id.nav_menu23:
                fragment = new NStaTerezinhaActivity();
                break;
            case R.id.nav_menu24:
                fragment = new NStoExpeditoActivity();
                break;
            case R.id.nav_menu25:
                fragment = new NSaoJoseActivity();
                break;

            case R.id.nav_menu26:
                fragment = new NSaoMiguelActivity();
                break;
            case R.id.nav_menu27:
                fragment = new NSaoRafael();
                break;


        }

        //replacing the fragment
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