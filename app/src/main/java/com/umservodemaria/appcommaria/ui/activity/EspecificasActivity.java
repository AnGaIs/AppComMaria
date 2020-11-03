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
import com.umservodemaria.appcommaria.ui.view.oraespecificas.ADrtedevActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.AgelusActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.AlmasActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.AntRefActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.ApoRefActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.AtCtriActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.AtLouvActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.AvPtActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.BSantiActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.BendictuActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.CantSimeActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.CoNSenhoraActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.CoSCJesusActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.ConfissaoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.CredoNCActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.DCrucifixActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.DoEsposoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.DonsESActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.EnfermiActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.EsSantoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.JMJ2013Activity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDhumildaActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDmiseriActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDnsaActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDnsjActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDntsActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDpealmasActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDpreciosjActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LDscorajesjActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LembraivosActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.LevseDeusActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.MagnificatActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.MaosensanActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.MariaPassaActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.MusicosActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.OraManhaActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.OraNoiteActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PCasaisActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PFalecidosActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PFamiliaActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PFilhosActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PNecessitadosActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PPaisActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PSacerdotesActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PViagemActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PaiEterActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.PestudosActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.QuaSMiguelActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.QuinzeOraActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.RaiCeuActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.RepaSSacraActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.SCruzVitoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.SerenidadeActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.SocMariaActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.StePainoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.StoLenhoVitoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.TeDeumActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.OSSacramentoActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.VeniCreatorActivity;
import com.umservodemaria.appcommaria.ui.view.oraespecificas.ViaSacraActivity;

public class EspecificasActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especificas);
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
            Intent it = new Intent(EspecificasActivity.this,MainActivity.class);
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
                fragment = new AvPtActivity();
                break;
            case R.id.nav_menu2:
                fragment = new ADrtedevActivity();
                break;
            case R.id.nav_menu3:
                fragment = new AlmasActivity();
                break;
            case R.id.nav_menu4:
                fragment = new AgelusActivity();
                break;

            case R.id.nav_menu5:
                fragment = new AntRefActivity();
                break;
            case R.id.nav_menu6:
                fragment = new ApoRefActivity();
                break;

            case R.id.nav_menu7:
                fragment = new QuinzeOraActivity();
                break;

            case R.id.nav_menu8:
                fragment = new AtCtriActivity();
                break;

            case R.id.nav_menu9:
                fragment = new AtLouvActivity();
                break;

            case R.id.nav_menu10:
                fragment = new BSantiActivity();
                break;

            case R.id.nav_menu11:
                fragment = new BendictuActivity();
                break;
            case R.id.nav_menu12:
                fragment = new CantSimeActivity();
                break;
            case R.id.nav_menu13:
                fragment = new ConfissaoActivity();
                break;
            case R.id.nav_menu14:
                fragment = new CoSCJesusActivity();
                break;

            case R.id.nav_menu15:
                fragment = new CoNSenhoraActivity();
                break;
            case R.id.nav_menu16:
                fragment = new CredoNCActivity();
                break;

            case R.id.nav_menu17:
                fragment = new DCrucifixActivity();
                break;

            case R.id.nav_menu18:
                fragment = new DonsESActivity();
                break;

            case R.id.nav_menu19:
                fragment = new DoEsposoActivity();
                break;

            case R.id.nav_menu20:
                fragment = new EnfermiActivity();
                break;

            case R.id.nav_menu21:
                fragment = new EsSantoActivity();
                break;
            case R.id.nav_menu22:
                fragment = new JMJ2013Activity();
                break;
            case R.id.nav_menu23:
                fragment = new LDmiseriActivity();
                break;
            case R.id.nav_menu24:
                fragment = new LDhumildaActivity();
                break;

            case R.id.nav_menu25:
                fragment = new LDnsaActivity();
                break;
            case R.id.nav_menu26:
                fragment = new LDnsjActivity();
                break;

            case R.id.nav_menu27:
                fragment = new LDntsActivity();
                break;

            case R.id.nav_menu28:
                fragment = new LDpreciosjActivity();
                break;

            case R.id.nav_menu29:
                fragment = new LDscorajesjActivity();
                break;

            case R.id.nav_menu30:
                fragment = new LDpealmasActivity();
                break;


            case R.id.nav_menu31:
                fragment = new LembraivosActivity();
                break;
            case R.id.nav_menu32:
                fragment = new LevseDeusActivity();
                break;
            case R.id.nav_menu33:
                fragment = new MagnificatActivity();
                break;
            case R.id.nav_menu34:
                fragment = new MaosensanActivity();
                break;

            case R.id.nav_menu35:
                fragment = new MariaPassaActivity();
                break;
            case R.id.nav_menu36:
                fragment = new MusicosActivity();
                break;

            case R.id.nav_menu37:
                fragment = new OraManhaActivity();
                break;

            case R.id.nav_menu38:
                fragment = new OraNoiteActivity();
                break;

            case R.id.nav_menu39:
                fragment = new StePainoActivity();
                break;

            case R.id.nav_menu40:
                fragment = new PaiEterActivity();
                break;


            case R.id.nav_menu41:
                fragment = new PFamiliaActivity();
                break;
            case R.id.nav_menu42:
                fragment = new PestudosActivity();
                break;
            case R.id.nav_menu43:
                fragment = new PCasaisActivity();
                break;
            case R.id.nav_menu44:
                fragment = new PSacerdotesActivity();
                break;

            case R.id.nav_menu45:
                fragment = new PViagemActivity();
                break;
            case R.id.nav_menu46:
                fragment = new PFalecidosActivity();
                break;

            case R.id.nav_menu47:
                fragment = new PFilhosActivity();
                break;

            case R.id.nav_menu48:
                fragment = new PNecessitadosActivity();
                break;

            case R.id.nav_menu49:
                fragment = new PPaisActivity();
                break;

            case R.id.nav_menu50:
                fragment = new QuaSMiguelActivity();
                break;

            case R.id.nav_menu51:
                fragment = new RaiCeuActivity();
                break;
            case R.id.nav_menu52:
                fragment = new RepaSSacraActivity();
                break;
            case R.id.nav_menu53:
                fragment = new SCruzVitoActivity();
                break;
            case R.id.nav_menu54:
                fragment = new StoLenhoVitoActivity();
                break;

            case R.id.nav_menu55:
                fragment = new SerenidadeActivity();
                break;
            case R.id.nav_menu56:
                fragment = new SocMariaActivity();
                break;

            case R.id.nav_menu57:
                fragment = new TeDeumActivity();
                break;

            case R.id.nav_menu58:
                fragment = new VeniCreatorActivity();
                break;

            case R.id.nav_menu59:
                fragment = new ViaSacraActivity();
                break;

            case R.id.nav_menu60:
                fragment = new OSSacramentoActivity();
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