/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author salvador
 */
public class Automata {
    String cadena;
    
    public Automata(String cadena){
        this.cadena = cadena;
    }
    
    public boolean validacion(){
        boolean startsWithSymbol = false;
        
        boolean insideAlfabeto = true;
        for(char x: cadena.toCharArray()){
            if(!Datos.memoria.getAlfabeto().contains(x)){
                insideAlfabeto = false;
                break;
            }
        }
        
        return insideAlfabeto;
    }
}
