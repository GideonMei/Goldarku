package com.example.goldarku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.goldarku.Activity.PrediksiGoldar;
import com.example.goldarku.Activity.WelcomeActivity;
import com.example.goldarku.Fragment.AboutFragment;
import com.example.goldarku.Fragment.DonorIndexFragment;
import com.example.goldarku.Fragment.MenuFragment;
import com.example.goldarku.Fragment.PrediksiIndexFragment;
import com.example.goldarku.Fragment.ResultFragment;

public class MainActivity extends AppCompatActivity implements
        MenuFragment.OnFragmentInteractionListener,
        PrediksiIndexFragment.OnFragmentInteractionListener,
        DonorIndexFragment.OnFragmentInteractionListener,
        ResultFragment.OnFragmentInteractionListener {

    private AboutFragment aboutFragment;
    private MenuFragment menuFragment;
    private PrediksiIndexFragment prediksiIndexFragment;
    private DonorIndexFragment donorIndexFragment;
    private ResultFragment resultFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        aboutFragment = AboutFragment.newInstance("Gideon Mei Ditama");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuFragment = new MenuFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, menuFragment)
                .commit();
        prediksiIndexFragment = new PrediksiIndexFragment();
        donorIndexFragment = new DonorIndexFragment();
        resultFragment = new ResultFragment();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(MainActivity.this, MenuFragment.class);
//                startActivity(i);
//                finish();
//            }
//        }, 1000);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // TODO: Tambahkan penanganan menu di sini
        if (item.getItemId() == R.id.menu_about) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, aboutFragment)
                    .addToBackStack(null)
                    .commit();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onPrediksiButtonClicked() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, prediksiIndexFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onDonorButtonClicked() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, donorIndexFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onPrediksiButtonClicked(String GolAnak) {
        resultFragment.setInformation(String.format("Kemungkinan anak anda memiliki golongan darah "+GolAnak));
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, resultFragment, "PREDIKSI")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onTryAgainButtonClicked(String tag) {
        if (tag.equals("PREDIKSI")) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, prediksiIndexFragment)
                    .commit();
        } else if (tag.equals("DONOR")) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, donorIndexFragment)
                    .commit();
        }
    }

    @Override
    public void onDonorButtonClicked(String hasil) {
            resultFragment.setInformation(String.format("Anda "+hasil+" untuk melakukan donor darah"));
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, resultFragment, "DONOR")
                    .addToBackStack(null)
                    .commit();
    }
}
