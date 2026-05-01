package org.java.collections;

public class Ciclabile {

    private int[] interi;
    private int i = 0;


    public Ciclabile(int[] interi){
        this.interi = interi;

    };

    int getElementoSuccessivo(){
        int elementoCorrente = interi[i];
        i++;
        return elementoCorrente;
    };
    
    boolean hasAncoraElementi(){
        if(interi.length != i){
            return true;
        } else{
            return false;
        }
    };


    
}
