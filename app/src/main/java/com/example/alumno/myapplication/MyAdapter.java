package com.example.alumno.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alumno on 07/09/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Persona> personas;

    public MyAdapter(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layaut, parent, false);

        MyViewHolder ret = new MyViewHolder(v);
        return ret;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona p = personas.get(position);

        String nombre = p.getNombre();
        String apellido = p.getApellido();

        holder.lblNombre.setText(nombre);
        holder.lblApellido.setText(apellido);
    }

    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}
