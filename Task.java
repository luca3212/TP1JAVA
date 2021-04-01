/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtask;

import java.time.LocalDate;

/**
 *
 * @author luca
 */
public class Task {
    
    //ATRIBUTOS
    private String descripcion;
    private boolean completado;
    private LocalDate fechaVencimiento;
    
    //CONSTRUCTORES
    //COMPLETO
    public Task(String descripcion, boolean completado, String fechaIN) {
        this.descripcion = descripcion;
        this.completado = completado;
        this.fechaVencimiento = LocalDate.parse(fechaIN);
    }
    
    //INICIO VACIO
    public Task(){
        this.descripcion = "VACIO";
        this.completado = false;
        this.fechaVencimiento = LocalDate.now();
    }
    
    //GETS Y SETS
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVenci) {
        this.fechaVencimiento = LocalDate.parse(fechaVenci);
    }
    
    
    //PROCEDIMIENTOS
    //CAMBIA EL ESTADO ACTUAL AL INVERSO
    public void CambiarEstado(){
        if(this.completado){
            this.completado=false;
        }else{
            this.completado=true;
        }
    }
    
    //REINICIA TODAS LAS VARIABLES AL INICIO
    public void Eliminar(){
        this.descripcion = "VACIO";
        this.completado = false;
        this.fechaVencimiento = LocalDate.now();
    }
 
}
