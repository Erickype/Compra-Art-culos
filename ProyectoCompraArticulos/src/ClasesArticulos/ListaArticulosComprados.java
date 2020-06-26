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
public class ListaArticulosComprados extends Lista {

    double totalPagar() {
        Nodo aux = this.primero;
        double total = 0;

        while (aux != null) {
            total += ((ArticuloComprado) (aux.dato)).producto.precio
                    * ((ArticuloComprado) (aux.dato)).cantidad;
            aux = aux.siguiente;

        }
        return total;
    }

    boolean visualizarSolicitud() {
        int i = 1;

        if (this.primero == null) {
            return false;
        }

        try {

            Nodo aux = this.primero;
            System.out.println("Articulos Comprados");
            if (aux.siguiente == null) {
                System.out.println("ID: " + i);
                System.out.println("Nombre: " + ((ArticuloComprado) (aux.dato)).producto.desc + "\n"
                        + "Precio: " + ((ArticuloComprado) (aux.dato)).producto.precio + "\n"
                        + "Cantidad: " + ((ArticuloComprado) (aux.dato)).cantidad + "\n");
                i++;
                return true;
            }

            while (aux.siguiente != null) {
                System.out.println("ID: " + i);
                System.out.println("Nombre: " + ((ArticuloComprado) (aux.dato)).producto.desc + "\n"
                        + "Precio: " + ((ArticuloComprado) (aux.dato)).producto.precio + "\n"
                        + "Cantidad: " + ((ArticuloComprado) (aux.dato)).cantidad + "\n");

                aux = aux.siguiente;

                i++;
            }
            return true;

        } catch (Exception e) {
        }
        return false;
    }

}
