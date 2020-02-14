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
    String endOf = "." + Datos.memoria.getMatricula();
    
    public Automata(String cadena){
        this.cadena = cadena;
    }
    
    public boolean validacion(){        
        return startsWithSymbol() && insideAlfabeto() && endsWithMatricula() && dotsContinous();
    }
    
    private boolean startsWithSymbol(){
        if(this.cadena.toCharArray()[0] >= 48 && this.cadena.toCharArray()[0] <= 57){
            return true;
        }
        return false;
    }
    
    private boolean insideAlfabeto(){
        for(char x: this.cadena.toCharArray()){
            if(!Datos.memoria.getAlfabeto().contains(x)){
                return false;
            }
        }
        return true;
    }
    
    private boolean endsWithMatricula(){
        if(this.cadena.endsWith(this.endOf)){
            return true;
        }
        return false;
    }
    
    private boolean dotsContinous(){
        if(this.cadena.contains("..")){
            return false;
        }
        return true;
    }
}
