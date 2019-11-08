/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanu
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] pila=new  int [10];
       Pila objctopilaenteros = new Pila (pila);
       int op=3;
       //agregamos (operacion push )elementos  a la pila de datos 
       //el fondo fr la pila seria 90 y la sima 12
    objctopilaenteros.insertar(90);
    objctopilaenteros.insertar(56);
    objctopilaenteros.insertar(23);
    objctopilaenteros.insertar(12);
    
    while (op!=6)
    {
        JOptionPane.showInputDialog("1.- insertar  \n"+"2.- Retitar \n"
                + "3.- mostrar \n"
                + "4.-Cima \n"
                + "5.-fondo \n");
        switch (op){
            case 1:
              objctopilaenteros.insertar(89);
                objctopilaenteros.insertar(20);
                break;
            case 2:
                objctopilaenteros.retirar();
                break;
            case 3:
                objctopilaenteros.mostrarPila();
                break;
            case 4:
                   objctopilaenteros.cima();
                break;
            case 5:
                objctopilaenteros.fondo();
                break;
            
                        
        
        
    
    
    
}


//        //agragamos(operacion push) Elementos a la pila de datos.
//        //el fondo de la pila seria 90 y la suma 12
//        objPilaEnteros.insertar(90);
//        objPilaEnteros.insertar(56);
//        objPilaEnteros.insertar(23);
//        objPilaEnteros.insertar(12);
//        //mostramos los elementos dentro de la pila
//        objPilaEnteros.mostrarPila();
//        objPilaEnteros.fondo();
//        objPilaEnteros.cima();
//        objPilaEnteros.retirar();
//        objPilaEnteros.insertar(34);   
//        objPilaEnteros.mostrarPila();
        }
    }
}
