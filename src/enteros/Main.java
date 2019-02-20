/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Gestion de enteros");
        Interfaz a = new Interfaz();
        Scanner dato = new Scanner(System.in);
        DAO bd = new DAO();
        GestionArchivo archivo = new GestionArchivo("Archivos/Int.txt");
        int opcion = 0;
        int num = 0;
        while(true){
            opcion = a.menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese dato");
                    num = dato.nextInt();
                    bd.añadirEntero(num);
                    break;
                case 2:
                    System.out.println("Guardar");
                    try{
                    archivo.guardar(bd.getBd());
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Cargando");
                    ArrayList<Integer> respaldo = null;
                    try {
                        respaldo = archivo.cargar();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    bd.setBd(respaldo);
                    
                    break;
                case 4:
                    System.out.println("Lista:");
                    a.listar(bd.getBd());
                    break;
                case 5:
                    System.out.println("¿Qué posicion modificar?");
                    int pos = dato.nextInt();
                    System.out.println("¿Qué numero poner?");
                    int numero = dato.nextInt();
                    bd.modificar(pos, numero);
                    break;
                default:
                    break;
            
            }
    }
    }
}
    

