package ListaPersona;

/**
 *
 * @author Aldo
 */
public class Lista {

    //hacemos una referencia a la cabeza de la lista
    private Nodo cabeza = null; //a traves de ella podemos ir recorriendo la lista
    //la cabeza puede tener un valor nulo si la lista esta vacia

    //estara compuesto de una estructura interna llamada Nodo
    private class Nodo {

        public Persona persona; //tendra una referencia asociada a la persona
        public Nodo siguiente = null; //y tambien tendra una referencia al siguiente nodo en la lista
        //lo dejamos en nulo porque no sabemos a que apunta

        public Nodo(Persona persona) { //al mismo nodo le pasamos de referencia la persona 
            this.persona = persona;

        }

    }

    //realizaremos distintas operaciones
    public void insertarPrincipio(Persona persona) {
        Nodo nodo = new Nodo(persona); //creo mi nuevo nodo apartir de la persona que estemos ingresando
        nodo.siguiente = cabeza;
        cabeza = nodo;//ahora mi nuevo nodo que instancie sera la cabeza 

    }

    public void insertarFinal(Persona persona) {
        Nodo nodo = new Nodo(persona);//creamos nuevo nodo 
        if (cabeza == null) { //si la lista esta vacia entonces en la cabeza insertaremos el nodo
            cabeza = nodo;
        } else {
            //necesitaremos ir recorriendo la lista,mediante un puntero tons lo creamos
            Nodo puntero = cabeza; //y que comience al inicio de la lista en la cabeza
            while (puntero.siguiente != null) { //mientras puntero siguiente apunte a algo
                puntero = puntero.siguiente; //seguira avanzando hasta que encuentre uno vacio

            }//saliendo del ciclo
            puntero.siguiente = nodo;//a ese puntero que esta vacio le asignamos el nodo
        }

    }

    //-------------------
    //insertar nodo despues de el numero "n"
    public void insertarDespues(int n, Persona persona) {
        Nodo nodo = new Nodo(persona);
        if (cabeza == null) {//si la lista esta vacia agrego mi nodo al inicio
            cabeza = nodo;
        } else { //y si no ,busco el libro n ,recorriendo la lista mediante un contador 

            Nodo puntero = cabeza; //y que comience al inicio de la lista en la cabeza
            int contador = 0; //indicara que numero de libro es el que hay ahora mismo en el puntero

            while (contador < n && puntero.siguiente != null) { //mientras puntero siguiente apunte a algo 
                puntero = puntero.siguiente; //seguira avanzando hasta que encuentre uno vacio
                contador++;
            }//saliendo del ciclo
            nodo.siguiente = puntero.siguiente; //conectamos por la derecha 
            puntero.siguiente = nodo; //luego conectamos por la izquierda
        }

    }

    public void insertarAntes(int n, Persona persona) {
        Nodo nodo = new Nodo(persona);
        if (cabeza == null) {//si la lista esta vacia agrego mi nodo al inicio
            cabeza = nodo;
        } else { //y si no ,busco el libro n ,recorriendo la lista mediante un contador 

            Nodo puntero = cabeza; //y que comience al inicio de la lista en la cabeza
            int contador = 0; //indicara que numero de libro es el que hay ahora mismo en el punte
            while (contador < n && puntero.siguiente != null) { //mientras puntero siguiente apunte a algo 
                puntero = puntero.siguiente; //seguira avanzando hasta que encuentre uno vacio
                contador++;
            }//saliendo del ciclo
            nodo.siguiente = puntero.siguiente; //conectamos por la derecha 
            puntero.siguiente = nodo; //luego conectamos por la izquierda
        }
    }

    public String obtener(int n) { //obtener info de persona "n"
        if (cabeza == null) {//si la  lista esta vacia  
            return null;//nos devolvera que no tiene nada
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) { //esto es en caso de haber dado un numero n y no este en la lista
                return null;
            } else {
                return puntero.persona.toString(); //y si no ,se devuelve la info de la persona en "n"

            }

        }

    }

    public void eliminarPrincipio() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
        }

    }

    public void eliminarUltimo() {
        if (cabeza != null) {
            if (cabeza.siguiente == null) { //si solo hay un elemento..
                cabeza = null;//lo eliminamos
            } else {
                Nodo puntero = cabeza; //comenzamos nuestro puntero en la cabeza
                while (puntero.siguiente.siguiente != null) {//mientras el penultimo nodo su siguiente este ocupado
                    puntero = puntero.siguiente;//asigrnarle lazo al puntero
                }

            }
        }
    }

    public void eliminarPersona(int n) {
        if (cabeza != null) { //comprobar que la cabeza apunte a algo
            if (n == 0) {              //caso especial,pedir eliminar el primero libro
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;

            } else {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                puntero.siguiente = temp.siguiente; //el anterior puntara al siguiente
                temp.siguiente = null;
            }
        }
    }

}
