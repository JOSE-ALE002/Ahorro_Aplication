package com.achmadqomarudin.animatedbottombar.controllers;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.achmadqomarudin.animatedbottombar.models.MetasDeAhorro;

import java.util.List;

@Dao
public interface operacionesMetaAhorro {

    @Query("SELECT * FROM MetasDeAhorro")
    List<MetasDeAhorro> getList();

    @Insert
    void insert(MetasDeAhorro metasDeAhorro);

    @Delete
    void delete(MetasDeAhorro metasDeAhorro);

}
