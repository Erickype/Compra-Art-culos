/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompraarticulos;

import GestorArticulos.GestorArticulos;

/**
 *
 * @author Erick
 */
public class CompraArticulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorArticulos gestor=new GestorArticulos();
        Menu.menuGeneral(gestor);
    }
    
}
