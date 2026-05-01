package org.java.collections;

public class Ciclabile {

    private int[] interi;
    private int i = 0;


    public Ciclabile(int[] interi){
        this.interi = interi;

    };

    public Ciclabile(){
        this.interi = new int[0];
    };

    void addElemento(int elemento){
        int[] arrayTransizione = new int [this.interi.length + 1];

        for(int i=0; i < this.interi.length; i++){
                arrayTransizione[i] = this.interi[i];
        }

        arrayTransizione[arrayTransizione.length - 1] = elemento;
        this.interi = arrayTransizione;
 
    }

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
