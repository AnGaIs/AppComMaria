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
import com.umservodemaria.appcommaria.ui.view.novenas.NNsaDeNosActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.AnjoGActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.BeatoCActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.DPaiEternoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.MJPragaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.MMisericordiaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsaAuxiliadoraActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsaCabecaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsaConceicaoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsaMeMilaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsaNavegantesActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsaPPsocorroActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadBPartoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadBRemedioActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadCarmoEscaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadCasaluceActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadDesteroActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadFatimaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadGuadalupeActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadLourdesActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadSchoenstattActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadaDefesaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadaDoresActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadaPazActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadaSaudeActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.NsadasGracasActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.PastorzinhosFActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SBeneditoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SBentoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SBomfimActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SBrasActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SCristovaoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SFAssisActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SGabrielActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJBatistaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJBoscoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJMEscrivaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJTadeuActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJoaquimActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJorgeActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SJoseActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SLazaroActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SMiguelActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SPatricioActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SPelegrinoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SPioActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SRafaelActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SSebastiaoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.SVicentPauloActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaAnaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaBakhitaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaBarbaraActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaClaraActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaEdiwigesActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaJoanaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaLuziaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaMonicaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaRitaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaTereMJesusActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StaTerezinhaActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoAfonsoLActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoAfonsoMLActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoAgostinhoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoAntonio2Activity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoAntonioActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoExpeditoActivity;
import com.umservodemaria.appcommaria.ui.view.prosantos.StoILoyolaActivity;

public class ProSantoActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_santo);
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
            Intent it = new Intent(ProSantoActivity.this,MainActivity.class);
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
                fragment = new AnjoGActivity();
                break;
            case R.id.nav_menu2:
                fragment = new BeatoCActivity();
                break;
            case R.id.nav_menu3:
                fragment = new DPaiEternoActivity();
                break;
            case R.id.nav_menu4:
                fragment = new MMisericordiaActivity();
                break;

            case R.id.nav_menu5:
                fragment = new MJPragaActivity();
                break;
            case R.id.nav_menu6:
                fragment = new NsaMeMilaActivity();
                break;

            case R.id.nav_menu7:
                fragment = new NsaAuxiliadoraActivity();
                break;

            case R.id.nav_menu8:
                fragment = new NsaCabecaActivity();
                break;

            case R.id.nav_menu9:
                fragment = new NsaConceicaoActivity();
                break;

            case R.id.nav_menu10:
                fragment = new NsadaDefesaActivity();
                break;

            case R.id.nav_menu11:
                fragment = new NsadaPazActivity();
                break;
            case R.id.nav_menu12:
                fragment = new NsadaSaudeActivity();
                break;
            case R.id.nav_menu13:
                fragment = new NsadaDoresActivity();
                break;
            case R.id.nav_menu14:
                fragment = new NsadasGracasActivity();
                break;

            case R.id.nav_menu15:
                fragment = new NsadCasaluceActivity();
                break;
            case R.id.nav_menu16:
                fragment = new NsadFatimaActivity();
                break;

            case R.id.nav_menu17:
                fragment = new NsadGuadalupeActivity();
                break;

            case R.id.nav_menu18:
                fragment = new NsadLourdesActivity();
                break;

            case R.id.nav_menu19:
                fragment = new NsadSchoenstattActivity();
                break;

            case R.id.nav_menu20:
                fragment = new NNsaDeNosActivity();
                break;

            case R.id.nav_menu21:
                fragment = new NsadBPartoActivity();
                break;
            case R.id.nav_menu22:
                fragment = new NsadBRemedioActivity();
                break;
            case R.id.nav_menu23:
                fragment = new NsadCarmoEscaActivity();
                break;
            case R.id.nav_menu24:
                fragment = new NsadDesteroActivity();
                break;

            case R.id.nav_menu25:
                fragment = new NsaPPsocorroActivity();
                break;
            case R.id.nav_menu26:
                fragment = new NsaNavegantesActivity();
                break;

            case R.id.nav_menu27:
                fragment = new PastorzinhosFActivity();
                break;

            case R.id.nav_menu28:
                fragment = new StaAnaActivity();
                break;

            case R.id.nav_menu29:
                fragment = new StaBarbaraActivity();
                break;

            case R.id.nav_menu30:
                fragment = new StaClaraActivity();
                break;


            case R.id.nav_menu31:
                fragment = new StaEdiwigesActivity();
                break;
            case R.id.nav_menu32:
                fragment = new StaJoanaActivity();
                break;
            case R.id.nav_menu33:
                fragment = new StaBakhitaActivity();
                break;
            case R.id.nav_menu34:
                fragment = new StaLuziaActivity();
                break;

            case R.id.nav_menu35:
                fragment = new StaMonicaActivity();
                break;
            case R.id.nav_menu36:
                fragment = new StaRitaActivity();
                break;

            case R.id.nav_menu37:
                fragment = new StaTerezinhaActivity();
                break;

            case R.id.nav_menu38:
                fragment = new StaTereMJesusActivity();
                break;

            case R.id.nav_menu39:
                fragment = new StoAfonsoLActivity();
                break;

            case R.id.nav_menu40:
                fragment = new StoAfonsoMLActivity();
                break;


            case R.id.nav_menu41:
                fragment = new StoAgostinhoActivity();
                break;
            case R.id.nav_menu42:
                fragment = new StoAntonioActivity();
                break;
            case R.id.nav_menu43:
                fragment = new StoAntonio2Activity();
                break;
            case R.id.nav_menu44:
                fragment = new StoExpeditoActivity();
                break;

            case R.id.nav_menu45:
                fragment = new StoILoyolaActivity();
                break;
            case R.id.nav_menu46:
                fragment = new SBeneditoActivity();
                break;

            case R.id.nav_menu47:
                fragment = new SBentoActivity();
                break;

            case R.id.nav_menu48:
                fragment = new SBrasActivity();
                break;

            case R.id.nav_menu49:
                fragment = new SCristovaoActivity();
                break;

            case R.id.nav_menu50:
                fragment = new SFAssisActivity();
                break;

            case R.id.nav_menu51:
                fragment = new SGabrielActivity();
                break;
            case R.id.nav_menu52:
                fragment = new SJBatistaActivity();
                break;
            case R.id.nav_menu53:
                fragment = new SJBoscoActivity();
                break;
            case R.id.nav_menu54:
                fragment = new SJoaquimActivity();
                break;

            case R.id.nav_menu55:
                fragment = new SJorgeActivity();
                break;
            case R.id.nav_menu56:
                fragment = new SJoseActivity();
                break;

            case R.id.nav_menu57:
                fragment = new SJMEscrivaActivity();
                break;

            case R.id.nav_menu58:
                fragment = new SJTadeuActivity();
                break;

            case R.id.nav_menu59:
                fragment = new SLazaroActivity();
                break;

            case R.id.nav_menu60:
                fragment = new SMiguelActivity();
                break;

            case R.id.nav_menu61:
                fragment = new SPatricioActivity();
                break;
            case R.id.nav_menu62:
                fragment = new SPelegrinoActivity();
                break;
            case R.id.nav_menu63:
                fragment = new SPioActivity();
                break;
            case R.id.nav_menu64:
                fragment = new SRafaelActivity();
                break;

            case R.id.nav_menu65:
                fragment = new SSebastiaoActivity();
                break;
            case R.id.nav_menu66:
                fragment = new SVicentPauloActivity();
                break;

            case R.id.nav_menu67:
                fragment = new SBomfimActivity();
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