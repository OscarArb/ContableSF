/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import clases.clsEmpleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author OscarArb
 */
public class mdlEmpleado {

    private LinkedList<clsEmpleado> empleados = new LinkedList<clsEmpleado>();
    dbConnection dbConnection;
    
        //Constructor
    public mdlEmpleado() {
        dbConnection = new dbConnection();
    }

    //Metodos CRUD Crear, Leer, Editar, Consult<r , eliminar
    public boolean Crear(clsEmpleado empleado) {
        try (Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            System.out.println("Conexion exitosa ");
            //Generar insercion en tabla persona
            String query = "INSERT INTO `empleados`(`nombres`, `telefono`, `fechapago`, `valorquincena`) VALUES (?,?,?,?)";
            PreparedStatement  statementPersona = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            statementPersona.setString(1,empleado.getNombre()); 
            statementPersona.setString(2,empleado.getTelefono());
            statementPersona.setString(3,empleado.getFechapago());
            statementPersona.setInt(4,empleado.getValorquincena());
            int filasModificadas = statementPersona.executeUpdate();
            if(filasModificadas > 0){
                System.out.println("Se creo un registro en tabla empleado");
                
                   
            }
            
        return true;  
        } catch (Exception e) {
            System.out.println("La excepcion es: " + e);
            return false;
        }
    }
    public boolean Crear_cliente(clsEmpleado empleado) {
        try (Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            System.out.println("Conexion exitosa ");
            //Generar insercion en tabla persona
            String query = "INSERT INTO `clientes`(`nombres`, `telefono`, `direccion`, `id_cliente`) VALUES (?,?,?,?)";
            PreparedStatement  statementPersona = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            statementPersona.setString(1,empleado.getNombre()); 
            statementPersona.setString(2,empleado.getTelefono());
            statementPersona.setString(3,empleado.getFechapago());
            statementPersona.setInt(4,empleado.getValorquincena());
            int filasModificadas = statementPersona.executeUpdate();
            if(filasModificadas > 0){
                System.out.println("Se creo un registro en tabla clientes");
                
                   
            }
            
        return true;  
        } catch (Exception e) {
            System.out.println("La excepcion es: " + e);
            return false;
        }
    }
    public clsEmpleado  Consultar_cliente(int identificacion){
        try(Connection connection = DriverManager.getConnection(dbConnection.getUrl(),dbConnection.getUser(),dbConnection.getPass())){
            String query ="SELECT * FROM `clientes`  WHERE id_cliente  = ? ";
            PreparedStatement statementPersona = connection.prepareStatement(query);
            statementPersona.setInt(1,identificacion);
            ResultSet resultado = statementPersona.executeQuery();
            while (resultado.next()){
                
                String nombres = resultado.getString(2);
                String telefono = resultado.getString(3);
                String direccion = resultado.getString(4);
                //int identificacion_persona = resultado.getInt(5);
                System.out.println(nombres);
                
      
                clsEmpleado empleado = new clsEmpleado(nombres,telefono,direccion,identificacion);
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
