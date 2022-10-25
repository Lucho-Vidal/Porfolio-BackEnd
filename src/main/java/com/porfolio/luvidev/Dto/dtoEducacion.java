package com.porfolio.luvidev.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
/**
 *
 * @author lucho
 */
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String instituto;
    private String img;
    private LocalDate fecha;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String instituto, String img, LocalDate fecha) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.instituto = instituto;
        this.img = img;
        this.fecha = fecha;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
}
