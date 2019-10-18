package com.example.goldarku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.goldarku.Fragment.AboutFragment;
import com.example.goldarku.Fragment.DonorIndexFragment;
import com.example.goldarku.Fragment.MenuFragment;
import com.example.goldarku.Fragment.PrediksiIndexFragment;
import com.example.goldarku.Fragment.ResultFragment;

public class MainActivity extends AppCompatActivity implements
        MenuFragment.OnFragmentInteractionListener,
        PrediksiIndexFragment.OnFragmentInteractionListener,
        DonorIndexFragment.OnFragmentInteractionListener{

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
                .setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left)
                .replace(R.id.fragment_container, menuFragment)
                .commit();
        prediksiIndexFragment = new PrediksiIndexFragment();
        donorIndexFragment = new DonorIndexFragment();
        resultFragment = new ResultFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // TODO: Tambahkan penanganan menu di sini
        if (item.getItemId() == R.id.menu_about) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left)
                    .replace(R.id.fragment_container, aboutFragment)
                    .addToBackStack(null)
                    .commit();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onPrediksiButtonClicked() {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left)
                .replace(R.id.fragment_container, prediksiIndexFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onDonorButtonClicked() {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left)
                .replace(R.id.fragment_container, donorIndexFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onPrediksiButtonClicked(String GolAnak) {
        resultFragment.setInformation(String.format("Kemungkinan anak anda memiliki golongan darah (persen) : "+GolAnak));
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left)
                .replace(R.id.fragment_container, resultFragment, "PREDIKSI")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onDonorButtonClicked(String hasil) {
            resultFragment.setInformation(String.format("Anda "+hasil));
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left)
                    .replace(R.id.fragment_container, resultFragment, "DONOR")
                    .addToBackStack(null)
                    .commit();
    }
}
