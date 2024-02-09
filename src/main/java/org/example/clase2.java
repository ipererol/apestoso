package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class clase2 {
    private String nombre_ALUMNO;
    private Calendar brithdate;
    private clase2 progenitor1;
    private clase2 progenitor2;
    private List<clase2> bro = new ArrayList<>();

    public clase2(String name) {
        this.nombre_ALUMNO = name;
    }
    public clase2(String nombre, int day, int month, int year) {
        this.nombre_ALUMNO = nombre;
        this.brithdate = Calendar.getInstance();
        this.brithdate.set(year, day, month);
    }

    public void setProgenitor1(clase2 progenitor1) {
        this.progenitor1 = progenitor1;
    }

    public void addBro(clase2 bro) {
        // bro...
        this.bro.add(bro);
        bro.getBro().add(this);
    }

    public void setProgenitor2(clase2 progenitor2) {
        this.progenitor2 = progenitor2;
    }

    public List<clase2> getBro() {
        return bro;
    }

    public boolean familiaNumerosa() {
        return bro.size() > 2;
    }

    public boolean get_Exposito() {
        if(progenitor1 == null && progenitor2 == null) {
            return true;
        } else
            return false;
    }
}
