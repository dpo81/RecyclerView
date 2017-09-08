package com.example.alumno.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 07/09/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public View view;
    public TextView Nombre;
    public TextView Apellido;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.view = itemView;

        Nombre = (TextView) this.view.findViewById(R.id.lblNombre);
        Apellido = (TextView) this.view.findViewById(R.id.lblApellido);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        Nombre.setOnClickListener(onClickListener);
        Apellido.setOnClickListener(onClickListener);
    }
}
