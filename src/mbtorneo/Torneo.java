package mbtorneo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

    private int cant_equipos;
    private String nombre_id;
    private ArrayList<Equipo> list_equipos = new ArrayList<>();
    private ArrayList<Partido> list_partidos = new ArrayList<>();
    
    public Torneo(int cant_equipos, String nombre_id, ArrayList<Equipo> list_equipos) {
        this.cant_equipos = cant_equipos;
        this.nombre_id = nombre_id;
        this.list_equipos = list_equipos;
        ArrayList<Partido> list_partidos = new ArrayList<>();
        this.list_partidos=list_partidos;
    }

    public int getCant_equipos() {
        return cant_equipos;
    }

    public void setCant_equipos(int cant_equipos) {
        this.cant_equipos = cant_equipos;
    }

    public String getNombre_id() {
        return nombre_id;
    }

    public void setNombre_id(String nombre_id) {
        this.nombre_id = nombre_id;
    }

    public ArrayList<Equipo> getList_equipos() {
        return list_equipos;
    }

    public void setList_equipos(ArrayList<Equipo> list_equipos) {
        this.list_equipos = list_equipos;
    }

    public ArrayList<Partido> getList_partidos() {
        return list_partidos;
    }

    public void setList_partidos(ArrayList<Partido> list_partidos) {
        this.list_partidos = list_partidos;
    }

}
