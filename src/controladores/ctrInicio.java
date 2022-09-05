/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import clases.clsProducto;
import modelos.mdlInicio;

/**
 *
 * @author OscarArb
 */
public class ctrInicio {
    mdlInicio mdlInicio = new mdlInicio();
    public ctrInicio(){
    
    }
    public String ListarProducto(){
        return mdlInicio.ListarProducto();
    }
    public int UltimaFactura(){
        return mdlInicio.UltimaFactura();
    }
    public String ListarEmpleado(){
        return mdlInicio.ListarEmpleado();
    }
    public clsProducto Consultar_producto(String producto){
        
        try{
            
                //Llamado a la capa modelos.Modelo Empleado
                return mdlInicio.Consultar_producto(producto);
            
            
            
            
         }catch(Exception e ){
            System.out.println("La exepcion es: "+ e); 
            return null;
            
            }
    }
}
