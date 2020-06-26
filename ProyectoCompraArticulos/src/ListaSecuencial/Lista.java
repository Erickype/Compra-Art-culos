package ListaSecuencial;

/**
 *
 * @author Erick
 */
public class Lista {

    public Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public boolean insertar(Object dato) {

        try {
            if (this.primero == null) {
                this.primero = new Nodo(dato);
                return true;
            }

            Nodo aux = this.primero;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = new Nodo(dato);
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean insertarPorPrimero(Object dato) {

        if (this.primero == null) {
            this.primero = new Nodo(dato);
            return true;
        }

        Nodo aux = new Nodo(dato);
        aux.siguiente = this.primero;
        this.primero = aux;

        return false;
    }

    public boolean insertarPorPosicion(Object dato, int pos) {

        int posAct = 1;
        Nodo aux;

        if (pos == 1) {
            return insertarPorPrimero(dato);
        }
        aux = this.primero;
        while (posAct != pos - 1 && aux.siguiente != null) {
            aux = aux.siguiente;
            posAct++;
        }

        if (posAct == pos - 1) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
            return true;
        }

        return false;
    }

    public Object buscar(int pos) {
        int posAct = 1;
        Nodo aux = this.primero;

        while (posAct != pos) {
            if (aux == null) {
                return null;
            }
            aux = aux.siguiente;
            posAct++;
        }

        return (aux == null) ? null : aux.dato;
    }

    public boolean borrar(int pos) {
        int posAct = 1;
        Nodo aux;

        if (pos < 1 || this.primero == null) {
            return false;
        }

        if (pos == 1) {
            this.primero = this.primero.siguiente;
            return true;
        }

        aux = this.primero;
        while (posAct != pos - 1 && aux.siguiente != null) {
            aux = aux.siguiente;
            posAct++;
        }

        if (aux.siguiente != null) {
            aux.siguiente = aux.siguiente.siguiente;
            return true;
        }

        return false;
    }

    public boolean borrarSecuencial(Object dato) {
        Nodo aux;

        if (this.primero == null) {
            return false;
        }

        aux = this.primero;
        while (aux.siguiente != null) {

            if (aux.siguiente.dato.equals(dato)) {
                do {
                    aux.siguiente = aux.siguiente.siguiente;
                    if (aux.siguiente == null) {
                        return true;
                    }
                } while (aux.siguiente.dato.equals(dato));
            }
            aux = aux.siguiente;
        }

        return false;
    }

    public boolean borrar(Object dato) {
        Nodo aux;

        if (this.primero == null) {
            return false;
        }

        if (this.primero.dato.equals(dato)) {
            this.primero = this.primero.siguiente;
            return true;
        }

        aux = this.primero;
        while (aux.siguiente != null) {

            if (aux.siguiente.dato.equals(dato)) {
                aux.siguiente = aux.siguiente.siguiente;
                return true;
            }
            aux = aux.siguiente;
        }
        return false;
    }

    public boolean eliminarBorrar(int pos ) {
         if (this.primero == null) {
            System.out.println("ERROR: ***** No existen datos que eliminar en la lista *** ");
        }
        if (this.primero == null || pos < 0) {
            return false;
        }
        if (pos == 0) {
            this.primero = this.primero.siguiente;
            return true;
        }
        int posActual = 1;
        Nodo aux = this.primero;
        while (posActual < pos && aux != null) {
            aux = aux.siguiente;
            posActual++;
        }
        if (aux != null && aux.siguiente != null) {
            aux.siguiente = aux.siguiente.siguiente;
            return true;
        } else {
            return false;
        }
    }

    public void modificar(String dato, String cambio) {
        if (this.primero == null) {
            System.out.println("vacio");
        } else {

            if (this.primero.dato == dato) {
                this.primero.dato = cambio;

            } else {
                Nodo aux = this.primero;
                while (aux.siguiente != null) {
                    if (aux.siguiente.dato == dato) {
                        aux.siguiente.dato = cambio;
                    }
                    aux = aux.siguiente;
                }
            }
        }
    }

    public void listar() {
        if (this.primero == null) {
            System.out.println("ERROR: *** No existen datos en la lista *** ");
        }

        if (this.primero != null) {
            Nodo aux = this.primero;
            do {
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            } while (aux.siguiente != null);

            if (aux.siguiente == null) {
                System.out.println(aux.dato.toString());
            }
        }
    }

}
