package org.java.collections;

public class Main {
    public static void main(String[] args) throws Exception {

        Ciclabile gruppo1 = new Ciclabile(new int[] { 1, 6, 3, 10, 8 });

        while(gruppo1.hasAncoraElementi()){
            System.out.println(gruppo1.getElementoSuccessivo());
        }


    }        
}
