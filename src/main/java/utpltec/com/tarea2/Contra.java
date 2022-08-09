/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpltec.com.tarea2;

/**
 *
 * @author bryan
 */
public class Contra extends Juegos{
    // Pacman hereda de clase llamada Juegos
    
    private String tipojuego;
    private String nivel;
    
    public Contra (String nombrejuego, String dificultad, String tipojuego, String nivel){
    super (nombrejuego, dificultad);
    this.tipojuego = tipojuego;    
    this.nivel = nivel;
    
    }
    
    public void imprimirInf(){
            System.out.println("Nombre de juego: "+getnombrejuego()+
                 "\nDificultad: "+getdificultad()+
                 "\nTipo de juego: "+tipojuego+
                 "\nNivel del juego: "+nivel);
           
    
    }
}
