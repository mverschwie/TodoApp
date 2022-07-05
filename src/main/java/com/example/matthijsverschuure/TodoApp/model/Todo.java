package com.example.matthijsverschuure.TodoApp.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public long id;
    private String omschrijving;

    private boolean isAfgerond;

    private LocalDateTime datumToegevoegd;

    private LocalDate datumAfgerond;


    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public boolean isAfgerond() {
        return isAfgerond;
    }

    public void setAfgerond(boolean afgerond) {
        isAfgerond = afgerond;
    }

    public LocalDateTime getDatumToegevoegd() {
        return datumToegevoegd;
    }

    public void setDatumToegevoegd(LocalDateTime datumToegevoegd) {
        this.datumToegevoegd = datumToegevoegd;
    }


    public LocalDate getDatumAfgerond() {
        return datumAfgerond;
    }

    public void setDatumAfgerond(LocalDate datumAfgerond) {
        this.datumAfgerond = datumAfgerond;
    }
}
