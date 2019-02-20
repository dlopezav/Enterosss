/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Interfaz {
    public int menu(){
        
        System.out.println("1. Leer dato\n2. Guardar\n3. Cargar\n4. Listar\n5. Modificar");
        Scanner num = new Scanner(System.in);
        int opcion = num.nextInt();
        return opcion;
        
    }
    
    public void listar(ArrayList<Integer> data){
        for(int a: data){
        System.out.println(a+"\n");
        }
    }
}
