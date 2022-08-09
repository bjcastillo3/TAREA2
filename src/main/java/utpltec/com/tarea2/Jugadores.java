/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpltec.com.tarea2;

/**
 *
 * @author bryan
 */
public class Jugadores {
    
    private String nombre;
    private String apellido;
    private String puntaje;
    
    
    public Jugadores (String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
    
    
    }
    
    public String getnombre(){
            return nombre;
    }
    
    public String getapellido(){
            return apellido;
    }   
    
           
    
   public void presentarJugadores(){
           System.out.println("Hola soy "+ this.nombre+ " "+this.apellido);
   }
                  
     }
