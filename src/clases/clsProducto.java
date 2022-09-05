/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author OscarArb
 */
public class clsProducto {
    // Atributos
    protected String detalle;
    
    protected int valorproducto;
    
    
    // Metodos
    // Constructores
    
    public clsProducto(String detalle, int valorproducto) {
        
        this.detalle = detalle;
        
        this.valorproducto = valorproducto;
    }

    
    //Setter y Getter
    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    
    /**
     * @return the valorproducto
     */
    public int getValorproducto() {
        return valorproducto;
    }

    /**
     * @param valorproducto the valorproducto to set
     */
    public void setValorproducto(int valorproducto) {
        this.valorproducto = valorproducto;
    }
   
}
