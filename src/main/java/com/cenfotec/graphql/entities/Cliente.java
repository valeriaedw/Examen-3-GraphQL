package com.cenfotec.graphql.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Column(name = "direccionVivienda", nullable = false)
    private String direccionVivienda;
    @Column(name = "direccionCobro", nullable = false)
    private String direccionCobro;
    @Column(name = "numTarjeta", nullable = false)
    private int numTarjeta;
    @Column(name = "mes", nullable = false)
    private int mes;
    @Column(name = "anio", nullable = false)
    private int anio;

    private transient String formattedDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccionVivienda() {
        return direccionVivienda;
    }

    public void setDireccionVivienda(String direccionVivienda) {
        this.direccionVivienda = direccionVivienda;
    }

    public String getDireccionCobro() {
        return direccionCobro;
    }

    public void setDireccionCobro(String direccionCobro) {
        this.direccionCobro = direccionCobro;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
