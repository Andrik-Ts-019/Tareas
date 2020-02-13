/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.SortedSet;

/**
 *
 * @author salvador
 */
public class Datos {
    //Singleton
    private Datos(){
    }
    
    public static Datos memoria = new Datos();
    
    //Variables
    private String nombre = new String();
    private String matricula = new String();
    private static ArrayList<Character> alfabeto = new ArrayList<Character>();
    
    //Metodos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void addElement(char elemento){
        this.alfabeto.add(elemento);
    }
    
    public ArrayList<Character> getAlfabeto(){
        return this.alfabeto;
    }

}
