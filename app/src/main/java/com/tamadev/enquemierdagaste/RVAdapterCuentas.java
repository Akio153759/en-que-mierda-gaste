package com.tamadev.enquemierdagaste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapterCuentas extends RecyclerView.Adapter<RVAdapterCuentas.ViewHolder>
{
    private Context _context;
    private ArrayList<Cuenta> _lstCuentas;

    public RVAdapterCuentas(Context _context, ArrayList<Cuenta> _lstCuentas) {
        this._context = _context;
        this._lstCuentas = _lstCuentas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View _view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_cuentas, parent, false);
        return new ViewHolder(_view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder._lblCuenta.setText(_lstCuentas.get(position).get_sDescripcion());
        holder._lblSaldo.setText(String.valueOf(_lstCuentas.get(position).get_dSaldo()));
    }

    @Override
    public int getItemCount() {
        return _lstCuentas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView _lblSaldo, _lblCuenta;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            _lblSaldo = itemView.findViewById(R.id.lblSaldo);
            _lblCuenta = itemView.findViewById(R.id.lblCuenta);
        }
    }
}
