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
public class clsEmpleado {
    // Atributos
    protected String nombre;
    protected String telefono;
    protected String fechapago;
    protected int valorquincena;
    
    
    // Metodos
    // Constructores
    
    public clsEmpleado(String nombre, String telefono, String fechapago, int valorquincena) {
        
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechapago = fechapago;
        this.valorquincena = valorquincena;
    }

    
    //Setter y Getter
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @return the fechapago
     */
    public String getFechapago() {
        return fechapago;
    }

    /**
     * @param fechapago the fechapago to set
     */
    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }
    
    /**
     * @return the valorquincena
     */
    public int getValorquincena() {
        return valorquincena;
    }

    /**
     * @param velorquincena the valorquincena to set
     */
    public void setValorquincena(int fvalorquincena) {
        this.valorquincena = valorquincena;
    }
   
    
    
    
    
    
}
