package com.example.goldarku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.goldarku.Activity.WelcomeActivity;
import com.example.goldarku.Fragment.AboutFragment;

public class MainActivity extends AppCompatActivity {

    private AboutFragment aboutFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        aboutFragment = AboutFragment.newInstance("Gideon Mei Ditama");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(i);
                finish();
            }
        }, 1000);
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

}
