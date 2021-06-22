package com.achmadqomarudin.animatedbottombar.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MetasDeAhorro {

    @PrimaryKey (autoGenerate = true)
    private int idMetaAhorro;
    private String nombre_meta;
    private String fecha_propuesta;
    private double cant_ahorrar;

    public MetasDeAhorro(int idMetaAhorro, String nombre_meta, String fecha_propuesta, double cant_ahorrar) {
        this.idMetaAhorro = idMetaAhorro;
        this.nombre_meta = nombre_meta;
        this.fecha_propuesta = fecha_propuesta;
        this.cant_ahorrar = cant_ahorrar;
    }

    public int getIdMetaAhorro() {
        return idMetaAhorro;
    }

    public void setIdMetaAhorro(int idMetaAhorro) {
        this.idMetaAhorro = idMetaAhorro;
    }

    public String getNombre_meta() {
        return nombre_meta;
    }

    public void setNombre_meta(String nombre_meta) {
        this.nombre_meta = nombre_meta;
    }

    public String getFecha_propuesta() {
        return fecha_propuesta;
    }

    public void setFecha_propuesta(String fecha_propuesta) {
        this.fecha_propuesta = fecha_propuesta;
    }

    public double getCant_ahorrar() {
        return cant_ahorrar;
    }

    public void setCant_ahorrar(double cant_ahorrar) {
        this.cant_ahorrar = cant_ahorrar;
    }
}
