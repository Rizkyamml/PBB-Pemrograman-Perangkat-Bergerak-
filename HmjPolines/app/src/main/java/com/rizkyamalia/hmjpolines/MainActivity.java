package com.rizkyamalia.hmjpolines;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.rizkyamalia.hmjpolines.R.*;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHmj;
    private ArrayList<Hmj> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("KIKI FAVORITE FILM");
        }
        rvHmj = findViewById(id.rv_hmj);
        rvHmj.setHasFixedSize(true);

        list.addAll(HmjData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(xml.profil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== id.item_about){
            startActivity(new Intent(this, aboutme.class));
        }
        return true;
    }

    private void showRecyclerList() {
        rvHmj.setLayoutManager(new LinearLayoutManager(this));
        CardHmjAdapter cardHmjAdapter = new CardHmjAdapter(this, list);
        rvHmj.setAdapter(cardHmjAdapter);
    }
}
