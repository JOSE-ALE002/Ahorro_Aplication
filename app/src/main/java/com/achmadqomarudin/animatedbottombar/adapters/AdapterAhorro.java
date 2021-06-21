package com.achmadqomarudin.animatedbottombar.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.achmadqomarudin.animatedbottombar.R;
import com.achmadqomarudin.animatedbottombar.models.AbonoAhorro;

import java.util.List;

public class AdapterAhorro extends BaseAdapter {
    public List<AbonoAhorro> listaConsulta;
    public Context context;
    public TextView t1,t2,t3;

    public AdapterAhorro(List<AbonoAhorro> listaConsulta, Context context) {
        this.listaConsulta = listaConsulta;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaConsulta.size();
    }

    @Override
    public Object getItem(int position) {
        return listaConsulta.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AbonoAhorro template = listaConsulta.get(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.lista_ahorro, null);
        t1 = convertView.findViewById(R.id.fechaAbono);
        t2 = convertView.findViewById(R.id.montoAbono);

        t1.setText(String.valueOf(template.getIdAhorro()));
        t2.setText(String.valueOf(template.getCantidad_abono()));

        return convertView;
    }
}
