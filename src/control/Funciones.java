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
    public void alfabeto(){
        boolean equals = false;
        
        char[] matricula = Datos.memoria.getMatricula().toCharArray();
        for(char x: matricula){
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
    }
    
    public boolean minus(char[] nombre){
        for(char x: nombre){
            if(x >= 97 && x <=122){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public boolean number(char[] matricula){
        for(char x: matricula){
            if(x >= 48 && x <= 57){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
}
