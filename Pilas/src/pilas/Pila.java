/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author ivanu
 */
public class Pila {

    int[] pila;
    int cima = 0;
    int fondo = 0;

    public Pila(int[] pila) {
        this.pila = pila;
    }

    public void insertar(int dato) {
        pila[cima] = dato;
        cima++;
    }

    public void retirar() {
        pila[cima - 1] = 0;
        cima--;
    }

    void mostrarPila() {
        for (int i = pila.length; i > 0; i--) {
            if (pila[i - 1] != 0) {
                System.out.println(pila[i - 1]);
            }
        }
    }

    public int cima() {
        System.out.println("la cima de la pila es: " + pila[cima - 1]);
        return pila[cima - 1];
    }

    public int fondo() {
        System.out.println("el fondo de la pila es: " + pila[fondo]);
        return pila[fondo];
    }
    public boolean esVacia(){
        boolean vacia = false;
        for (int i = 0; i < pila.length; i++) {
            if (pila[i] ==  0){
                vacia =true;
            }else{
                vacia = false;
            }
        }
        return vacia;
    }
    public boolean esLlena(){
        boolean llena = false;
        if(pila[pila.length - 1] != 0) {
            llena = true;
        } else {
        llena = false;        
        }
        return llena;
    }
    
    public int tamaño(){
        return cima;
    }
    public void limpiarPila(){
        for (int i = 0; i < pila.length; i++) {
            pila[i] = 0;
        }
    }
    
}
