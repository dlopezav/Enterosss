/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class GestionArchivo {
    private String ruta;

    public GestionArchivo(String ruta) {
        this.ruta = ruta;
    }
    
    public boolean guardar(ArrayList<Integer> bd) throws FileNotFoundException, IOException{
        File bb = new File(this.ruta);
        if(!bb.exists()){
            bb.createNewFile();
        }
        PrintStream archivo = new PrintStream(bb);
        for(int b: bd){
            archivo.print(b+" ");
        }
        archivo.flush();
        archivo.close();
        return true;
    }
    public ArrayList<Integer> cargar() throws FileNotFoundException{
        ArrayList<Integer> data = new ArrayList<>();
        Scanner lectura = new Scanner(new File(this.ruta));
        while(lectura.hasNextInt()){
            data.add(lectura.nextInt());
        }
        lectura.close();
        return data;
    }

    
   
    
}
