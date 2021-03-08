/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appnominas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class SistemaNominas {
    private List<Empleado> empleados;

    /**
     *
     */
    public SistemaNominas() {
        empleados=new ArrayList<>();
    }
    
    /**
     *Permite incluir un Empleado en el sistema de nominas
     * @param empleado Empleado que será imcluido
     * @return true si el empleado es imcuido en el sistema y false en el otro caso
     */
    public boolean incluirEmpleado(Empleado empleado){
        boolean incluido=false;
        
        if(!empleados.contains(empleado)){
        empleados.add(empleado);
        incluido=true;
        }
        
        return incluido;
    }
    
    /**
     *
     * @param dni
     * @return
     */
    public Empleado getEmpleado(String dni){
        Empleado empleado=null;
        Iterator<Empleado> iterador=empleados.iterator();
        
        while(iterador.hasNext()){
            empleado=iterador.next();
            if(empleado.getDni().equals(dni)){
                return empleado;
            }
        }
        return null;
    }
    
    /**
     *
     * @param empleado
     * @return
     */
    public boolean eliminarEmpleado(Empleado empleado){        
        return empleados.remove(empleado);
    }
    
    public List<Empleado> listarEmpleados(){
        List<Empleado> listado=new ArrayList<>(empleados);
        
         Collections.sort(listado);
       
    return listado;
    }
    
    /**
     *
     * @return
     */    
     public List<Empleado> listarEmpleadosPorSueldo(){
        
        Collections.sort(empleados);
       
        return empleados;
    }
     
    /**
     *
     * @return
     */
    public float getTotalSalarios(){
         float acumulador=0;
         Iterator<Empleado> iterador=empleados.iterator();
         
         while(iterador.hasNext()){
             acumulador+=iterador.next().ingresos();
         }
         
         return acumulador;
    }
    
}
