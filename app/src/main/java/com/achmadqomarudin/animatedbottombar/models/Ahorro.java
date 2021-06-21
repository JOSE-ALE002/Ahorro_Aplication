package com.achmadqomarudin.animatedbottombar.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Ahorro {
    @PrimaryKey(autoGenerate = true)
    private int idAhorro;
    private String nombreAhorro;
    private Double montoAhorro;

    public Ahorro(int idAhorro, String nombreAhorro, Double montoAhorro) {
        this.idAhorro = idAhorro;
        this.nombreAhorro = nombreAhorro;
        this.montoAhorro = montoAhorro;
    }

    public int getIdAhorro() {
        return idAhorro;
    }

    public void setIdAhorro(int idAhorro) {
        this.idAhorro = idAhorro;
    }

    public String getNombreAhorro() {
        return nombreAhorro;
    }

    public void setNombreAhorro(String nombreAhorro) {
        this.nombreAhorro = nombreAhorro;
    }

    public Double getMontoAhorro() {
        return montoAhorro;
    }

    public void setMontoAhorro(Double montoAhorro) {
        this.montoAhorro = montoAhorro;
    }
}
