/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpltec.com.tarea2;

/**
 *
 * @author bryan
 */
public class SuperMario extends Juegos{
    // Pacman hereda de clase llamada Juegos
    
    private String clasejuego;
    private String fasejuego;
    
    public SuperMario (String nombrejuego, String dificultad, String clasejuego, String fasejuego){
    super (nombrejuego, dificultad);
    this.clasejuego = clasejuego;    
    this.fasejuego = fasejuego;
    
    }
    
    public void imprimirInf2(){
            System.out.println("Nombre de juego: "+getnombrejuego()+
                 "\nDificultad: "+getdificultad()+
                 "\nClase de Juego: "+clasejuego+
                 "\nFase del Juego: "+fasejuego);
           
    
    }
}
