package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personas = new ArrayList<>();

        personas.add(new Persona("unoq", "1"));
        personas.add(new Persona("dos", "2"));
        personas.add(new Persona("tres", "3"));
        personas.add(new Persona("cuatro", "4"));
        personas.add(new Persona("cinco", "5"));
        personas.add(new Persona("seisq", "6"));
        personas.add(new Persona("siete", "7"));
        personas.add(new Persona("ocho", "8"));
        personas.add(new Persona("nueve", "9"));
        personas.add(new Persona("diez", "10"));

        RecyclerView rvPersonas = (RecyclerView) super.findViewById(R.id.rcvPersona);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seHizoClickEnElItem(1);
            }
        };

        RecyclerView.Adapter adapter = new MyAdapter(personas, onClickListener);
        rvPersonas.setAdapter(adapter);

        RecyclerView.LayoutManager lym = new LinearLayoutManager(this);
        rvPersonas.setLayoutManager(lym);
    }

    public void seHizoClickEnElItem(int i){
        Log.d("Click Item", "Se hizo click en " + personas.get(i).getApellido());
    }
}
