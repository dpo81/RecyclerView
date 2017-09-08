package com.example.alumno.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 07/09/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public View view;
    public TextView lblNombre;
    public TextView lblApellido;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.view = itemView;

        lblNombre = (TextView) this.view.findViewById(R.id.lblNombre);
        lblApellido = (TextView) this.view.findViewById(R.id.lblApellido);
    }
}
