
package com.porfolio.luvidev.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author lucho
 */
public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    
    private String img;
    
    private LocalDate fecha;
    @NotBlank
    private String descripcionE;
    
    //Contructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String img, LocalDate fecha, String descripcionE) {
        this.nombreE = nombreE;
        this.img = img;
        this.fecha = fecha;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
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

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    
    
}
