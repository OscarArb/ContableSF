/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import clases.clsEmpleado;
import clases.clsProducto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author OscarArb
 */
public class mdlInicio {
    dbConnection dbConnection;
       //Constructor
    public mdlInicio() {
        dbConnection = new dbConnection();
    }
    
    public String ListarProducto(){
        System.out.println("Listado productos");
        String Lista ="";
        
        try(Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            String query ="SELECT `id`, `producto` FROM `productos`";
            PreparedStatement statementEmpleado = connection.prepareStatement(query);
            ResultSet resultado = statementEmpleado.executeQuery();
            while (resultado.next()){
                String nombre = resultado.getString(2);
                
        
                Lista = Lista + nombre +",";
                
                
            }
   
        }catch (Exception e){
            System.out.println("La excepcion es: "+ e);
        }
        return Lista;
    }
    public int UltimaFactura(){
        System.out.println("Ultima Factura Registrada");
        int numFact = 0;
        
        try(Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            String query ="SELECT MAX(id) FROM `facturas`";
            PreparedStatement statementEmpleado = connection.prepareStatement(query);
            ResultSet resultado = statementEmpleado.executeQuery();
            while (resultado.next()){
                String nombre = resultado.getString(1);
                
        
                numFact = Integer.parseInt(nombre);
                
                
            }
   
        }catch (Exception e){
            System.out.println("La excepcion es: "+ e);
        }
        return numFact;
    }
    public String ListarEmpleado(){
        System.out.println("Listado Empleado");
        String Lista ="";
        
        try(Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            String query ="SELECT `id`, `nombres` FROM `empleados`";
            PreparedStatement statementEmpleado = connection.prepareStatement(query);
            ResultSet resultado = statementEmpleado.executeQuery();
            while (resultado.next()){
                String nombre = resultado.getString(2);
                
        
                Lista = Lista + nombre +",";
                
                
            }
   
        }catch (Exception e){
            System.out.println("La excepcion es: "+ e);
        }
        return Lista;
    }
    public clsProducto  Consultar_producto(String producto){
        try(Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            String query ="SELECT * FROM `productos`  WHERE producto  = ? ";
            PreparedStatement statementPersona = connection.prepareStatement(query);
            statementPersona.setString(1,producto);
           
            ResultSet resultado = statementPersona.executeQuery();
            while (resultado.next()){
                
                String nombres = resultado.getString(2);
                
                int valorproducto = resultado.getInt(3);
                System.out.println(nombres);
                
      
                clsProducto empleado = new clsProducto(nombres,valorproducto);
                System.out.println("Se encontro el cliente");
                return empleado;
            }
            
            
            
            
            /*for (clsEmpleado empleadoAuxiliar : empleados)
            {
                if (empleadoAuxiliar.getIdentificacion() == identificacion)
                {
                    return empleadoAuxiliar;
                    
                }
            }*/
            System.out.println("No se encontro el empleado");
           return null;
        }catch(Exception e){
            System.out.println("La excepcion es:"+ e);
            return null;
        }
    }

}
