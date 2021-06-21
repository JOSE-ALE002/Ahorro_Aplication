package com.achmadqomarudin.animatedbottombar.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AbonoAhorro {
    @PrimaryKey(autoGenerate = true)
    private int idAbonoAhorro;
    private int idAhorro;
    private Double cantidad_abono;
    //private String fecha_Abono;

    public AbonoAhorro(int idAbonoAhorro, int idAhorro, Double cantidad_abono) {
        this.idAbonoAhorro = idAbonoAhorro;
        this.idAhorro = idAhorro;
        this.cantidad_abono = cantidad_abono;
        //this.fecha_Abono = fecha_Abono;
    }

    public int getIdAbonoAhorro() {

        return idAbonoAhorro;
    }

    public void setIdAbonoAhorro(int idAbonoAhorro) {

        this.idAbonoAhorro = idAbonoAhorro;
    }

    public int getIdAhorro() {

        return idAhorro;
    }

    public void setIdAhorro(int idAhorro) {

        this.idAhorro = idAhorro;
    }

    public Double getCantidad_abono() {

        return cantidad_abono;
    }

    public void setCantidad_abono(Double cantidad_abono) {

        this.cantidad_abono = cantidad_abono;
    }

    /*public String getFecha_Abono() {
        return fecha_Abono;
    }

    public void setFecha_Abono(String fecha_Abono) {
        this.fecha_Abono = fecha_Abono;
    }*/
}
