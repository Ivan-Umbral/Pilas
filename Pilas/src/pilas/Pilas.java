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
        int pila[] = new int[10];
        Pila objPilaEnteros = new Pila(pila);

        String res = JOptionPane.showInputDialog(null, "seleccione una opcion", "1.- insertar  \n" + "2.- Retitar \n"
                + "3.- mostrar \n"
                + "4.-Cima \n"
                + "5.-fondo \n");
        switch (res) {
            case 1:
                objPilaEnteros.insertar(90);
                objPilaEnteros.insertar(56);
                objPilaEnteros.insertar(23);
                objPilaEnteros.insertar(12);
                break;
            case 2:
                objPilaEnteros.retirar();
                break;
            case 3:
                objPilaEnteros.mostrarPila();
                break;
            case 4:
                objPilaEnteros.cima();
                break;
            case 5:
                objPilaEnteros.fondo();
                break;

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
