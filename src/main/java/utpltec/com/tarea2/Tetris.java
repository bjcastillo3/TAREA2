/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpltec.com.tarea2;

/**
 *
 * @author bryan
 */
public class Tetris extends Juegos{
    // Pacman hereda de clase llamada Juegos
    
    private String modojuego;
    private String panoramajuego;
    
    public Tetris (String nombrejuego, String dificultad, String modojuego, String panoramajuego){
    super (nombrejuego, dificultad);
    this.modojuego = modojuego;    
    this.panoramajuego = panoramajuego;
    
    }
    
    public void imprimirInf3(){
            System.out.println("Nombre de juego: "+getnombrejuego()+
                 "\nDificultad: "+getdificultad()+
                 "\nModo de juego: "+modojuego+
                 "\nPanorama del juego: "+panoramajuego);
           
    
    }
}

