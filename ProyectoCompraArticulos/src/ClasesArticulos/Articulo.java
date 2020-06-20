/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesArticulos;

import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Articulo {

    String desc;
    double precio;

    public Articulo(String desc, double precio) {
        this.desc = desc;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Articulo) {
            Articulo otro = (Articulo) obj;

            return (this.desc == null ? otro.desc == null : this.desc.equals(otro.desc)) && this.precio == otro.precio;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.desc);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

}
