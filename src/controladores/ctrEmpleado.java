/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clases.clsEmpleado;
import modelos.mdlEmpleado;

/**
 *
 * @author OscarArb
 */
public class ctrEmpleado {
    mdlEmpleado mdlEmpleado = new mdlEmpleado();
    
    public ctrEmpleado(){
    
    }
    // metodos CRUD
    //Crear, editar,consultar, eliminar
    
    public boolean Crear(clsEmpleado empleado){
        //si se crea el objeto al nivel del modelo de datos(base de datos,lista)
        //true
        //false
        try{
            if (empleado.getValorquincena() > 0){
                //Llamado a la capa modelos.Modelo Empleado
                mdlEmpleado.Crear(empleado);
            }
            return true;
            
         }catch(Exception e ){
            System.out.println("La exepcion es: "+ e); 
            return false;
            
            }
        
        
    } 
    public boolean Crear_cliente(clsEmpleado empleado){
        //si se crea el objeto al nivel del modelo de datos(base de datos,lista)
        //true
        //false
        try{
            if (empleado.getValorquincena() > 0){
                //Llamado a la capa modelos.Modelo Empleado
                mdlEmpleado.Crear_cliente(empleado);
            }
            return true;
            
         }catch(Exception e ){
            System.out.println("La exepcion es: "+ e); 
            return false;
            
            }
        
        
    } 
    public clsEmpleado Consultar_cliente (int identificacion){
        
        try{
            
                //Llamado a la capa modelos.Modelo Empleado
                return mdlEmpleado.Consultar_cliente(identificacion);
            
            
            
            
         }catch(Exception e ){
            System.out.println("La exepcion es: "+ e); 
            return null;
            
            }
    }
}
