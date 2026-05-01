package org.java.collections;

public class Main {
    public static void main(String[] args) throws Exception {

        Ciclabile gruppo1 = new Ciclabile(new int[] { 1, 6, 3, 10, 8 });

        while(gruppo1.hasAncoraElementi()){
            System.out.println(gruppo1.getElementoSuccessivo());
        }

        Ciclabile gruppo2 = new Ciclabile();
        gruppo2.addElemento(3);
        System.out.println(gruppo2.getElementoSuccessivo());
        gruppo2.addElemento(7);
        gruppo2.addElemento(9);
        gruppo2.addElemento(2);
        gruppo2.addElemento(60);
          while(gruppo2.hasAncoraElementi()){
            System.out.println(gruppo2.getElementoSuccessivo());
        }


    }        
}
