package com.example.petgram.Fragments;

import com.example.petgram.Adapters.MascotaAdaptador;
import com.example.petgram.Pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by inavid on 07/07/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascotas> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
