/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package utpltec.com.tarea2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Tarea2 {

    public static void main(String[] args) {
        
    int opcion1;
    int opcion2;
    int opcion3;
    
    
        System.out.println("SALA DE JUEGOS\n" +
"\n" +
"1. CONTRA\n" +
"2. SUPERMARIO\n" +
"3. TERTRIS");
        
  Scanner teclado = new Scanner(System.in);
        System.out.print("\nEscoja un juego (1-3): ");
        opcion1 = teclado.nextInt();      
 
  if(opcion1>0&&opcion1<4) {
      switch(opcion1)
{
            case 1:  System.out.println("\nUsted ingresó a Contra\n");
            
            Contra Contra = new Contra("Contra", "Medio", "Arcade"," Principiante");
        
        Contra.imprimirInf();
                     break;
            case 2:  System.out.println("\nUsted ingresó a Super Mario\n");
            
        SuperMario SuperMario = new SuperMario("SuperMario", "Facil", "Plataformas"," Fase de lava");
        
        SuperMario.imprimirInf2();
                     break;
            case 3:  System.out.println("\nUsted ingresó a Tetris\n");
            
        Tetris Tetris = new Tetris ("Tetris", "Dificil", "Competitivo"," Extra rápido");
        
        Tetris.imprimirInf3();
        
                     break;
}
    } else {
      System.out.println("No es un juego de la lista");
    }
  
        

        System.out.println("\nQue necesitas realizar:\n"+ 
          "1. Agregar jugador\n" +
          "2. Listar jugadores\n" +
          "3. Salir\n");
    
        System.out.print("\nEscoja una opcion (1-3): ");
        opcion2 = teclado.nextInt(); 
        
          if(opcion2>0&&opcion1<4) {
      switch(opcion2)
{
            case 1:  
            String apodojugador1;
            String apodojugador2;
            
            String puntaje1;
            String puntaje2;
            
            System.out.println("\n INGRESE LOS DATOS\n ");
            
                               
             System.out.print("\nIngrese Apodo Jugador 1: ");
             apodojugador1 = teclado.nextLine(); 
             apodojugador1 = teclado.nextLine(); 
             System.out.print("\nPuntaje Jugador 1 (1-1000): ");
             puntaje1 = teclado.nextLine(); 
             
             System.out.print("\nIngrese Apodo de Jugador 2: ");
             apodojugador2 = teclado.nextLine(); 
            System.out.print("\nPuntaje Jugador 2 (1-1000): ");
             puntaje2 = teclado.nextLine();
             
             
             System.out.println("Desea listar los jugadores ingresados?\n"+
             "1. SI\n" +
             "2. NO\n");
             
             System.out.print("\nIngrese opcion (1-2): ");
             opcion3 = teclado.nextInt(); 
             
             if(opcion3>0&&opcion3<2) {   
                 System.out.println("Jugadores ingresados:\n"+apodojugador1+"  Puntaje:"+puntaje1+
                 "\n"+apodojugador2+"  Puntaje:"+puntaje2);
             
             } else{
                 System.out.println("HASTA LUEGO.");
             }   
                                     break;
            case 2:  System.out.println("\nNo se han ingresado jugadores\n");
            
      
                     break;
            case 3:  System.out.println("\nHASTA LUEGO.\n");
            
               
                     break;
}
    } else {
      System.out.println("No es un juego de la lista");
    }
        
  
        
    }
}
