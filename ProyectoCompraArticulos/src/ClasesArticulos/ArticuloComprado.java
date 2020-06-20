/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesArticulos;

import ListaSecuencial.Lista;
import ListaSecuencial.Nodo;


/**
 *
 * @author Erick
 */
public class ArticuloComprado extends Lista {

    boolean registrarProducto(String nombre, double precio) {
        return this.insertar(new Articulo(nombre, precio));
    }

    int visualizarProductos() {
        int i = 1;

        if (this.primero == null) {
            return i;
        }

        try {

            Nodo aux = this.primero;
            System.out.println("Lista de productos");

            while (aux.siguiente != null) {
                System.out.println("ID: " + i);
                System.out.println("Nombre: " + ((Articulo) (aux.dato)).desc + "\n"
                        + "Precio: " + ((Articulo) (aux.dato)).precio + "\n");

                aux = aux.siguiente;

                i++;
            }
            return i;

        } catch (Exception e) {
        }
        return i;
    }

}
