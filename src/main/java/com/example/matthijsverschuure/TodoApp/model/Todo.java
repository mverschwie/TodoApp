package com.example.matthijsverschuure.TodoApp.model;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public long id;
    private String omschrijving;

    private boolean isAfgerond;

    private String datumToegevoegd;

    private String datumUpdate;


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

    public String getDatumToegevoegd() {
        return datumToegevoegd;
    }

    public void setDatumToegevoegd(String datumToegevoegd) {
        this.datumToegevoegd = datumToegevoegd;
    }

    public String getDatumUpdate() {
        return datumUpdate;
    }

    public void setDatumUpdate(String datumUpdate) {
        this.datumUpdate = datumUpdate;
    }
}
