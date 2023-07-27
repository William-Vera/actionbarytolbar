package com.example.actionbarytolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.topAppBar);
        toolbar.setTitle("UTEQ App 2023");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mnuBuscar)
            Toast.makeText(this.getApplicationContext(), "Ha presionado opción buscar ", Toast.LENGTH_LONG).show();
        else if (item.getItemId() == R.id.mnuConfig)
            Toast.makeText(this.getApplicationContext(), "Ha presionado opción settings ", Toast.LENGTH_LONG).show();
        else if (item.getItemId() == R.id.mnuNuevo)
            Toast.makeText(this.getApplicationContext(), "Ha presionado opción nurvo ", Toast.LENGTH_LONG).show();
        else
            return super.onOptionsItemSelected(item);
        return true;
    }
}