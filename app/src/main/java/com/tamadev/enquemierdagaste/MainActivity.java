package com.tamadev.enquemierdagaste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _rvCuentas;
    private GridLayoutManager _glManager;
    private RVAdapterCuentas _adapterCuentas;
    private ArrayList<Cuenta> _lstCuentas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _glManager = new GridLayoutManager(MainActivity.this,2, GridLayoutManager.VERTICAL, false);

        _lstCuentas = new ArrayList<>();

        _lstCuentas.add(new Cuenta("Efectivo",12000, 1));
        _lstCuentas.add(new Cuenta("Brubank",2200, 2));
        _lstCuentas.add(new Cuenta("Mercado Pago",1000, 2));

        _adapterCuentas = new RVAdapterCuentas(MainActivity.this, _lstCuentas);

        _rvCuentas = findViewById(R.id.rvCuentas);
        _rvCuentas.setLayoutManager(_glManager);
        _rvCuentas.setAdapter(_adapterCuentas);
    }
}