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
public class Funciones {
    private Funciones(){
        
    }
    
    public static Funciones control = new Funciones();
    
    public void alfabeto(){
        boolean equals = false;
        
        char[] matricula = Datos.memoria.getMatricula().toCharArray();
        for(char x: matricula){
            if(x == ' '){
                continue;
            }
            equals = false;
            for(char y: Datos.memoria.getAlfabeto()){
                if(x == y){
                    equals = true;
                    break;
                }
            }
            if(equals == false){
                Datos.memoria.addElement(x);
            }
        }
        
        equals = false;
        
        char[] nombre = Datos.memoria.getNombre().toCharArray();
        for(char x: nombre){
            if(x == ' '){
                continue;
            }
            equals = false;
            for(char y: Datos.memoria.getAlfabeto()){
                if(x == y){
                    equals = true;
                    break;
                }
            }
            if(equals == false){
                Datos.memoria.addElement(x);
            }
        }
        Datos.memoria.addElement('.');
    }
    
    public boolean minus(){
        for(char x: Datos.memoria.getNombre().toCharArray()){
            if(x >= 97 && x <=122){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public boolean number(){
        for(char x: Datos.memoria.getMatricula().toCharArray()){
            if(x >= 48 && x <= 57){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public void sortAlfabeto(){
        char aux;
        for(int i = 0; i < Datos.memoria.getAlfabeto().size() - 1; i++){
            for(int j = i + 1; j < Datos.memoria.getAlfabeto().size(); j++){
                if(Datos.memoria.getAlfabeto().get(i) > Datos.memoria.getAlfabeto().get(j)){
                    aux = Datos.memoria.getAlfabeto().get(i);
                    Datos.memoria.getAlfabeto().set(i, Datos.memoria.getAlfabeto().get(j));
                    Datos.memoria.getAlfabeto().set(j, aux);
                }
            }
        }
    }
    
    public void resetData(){
        Datos.memoria.getAlfabeto().clear();
        Datos.memoria.setNombre("");
        Datos.memoria.setMatricula("");
    }
}
