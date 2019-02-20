/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteros;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class DAO {
    
    private ArrayList<Integer> bd;

    public DAO() {
        this.bd = new ArrayList<>();
    }

    public ArrayList<Integer> getBd() {
        return bd;
    }

    public void setBd(ArrayList<Integer> bd) {
        this.bd = bd;
    }
    
    public void añadirEntero(int data){
        this.bd.add(data);
    }
    
    public boolean modificar(int pos,int num){
        bd.remove(pos);
        bd.set(pos, num);
     return true;
    }
}
