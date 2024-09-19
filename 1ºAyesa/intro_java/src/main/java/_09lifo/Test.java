package _09lifo;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        PilaT<Integer> pilaInt = new PilaT<>();
        pilaInt.push(1);
        pilaInt.push(2);
        pilaInt.push(3);
        pilaInt.push(4);
        System.out.println(pilaInt.size());

        PilaT<String> pilaStr = new PilaT<>();
        pilaStr.push("Hola");
        pilaStr.push("Mundo");
        pilaStr.push("Java");
        System.out.println(pilaStr.top());
        pilaStr.pop();
        System.out.println("Nuevo elemento");
        System.out.println(pilaStr.top());

        // Lo mismo con la clase de Java

        Stack<Integer> pilaIntJava = new Stack<>();
        // Metodo push --> Mete un elemento en la pila
        pilaIntJava.push(11);
        pilaIntJava.push(12);
        pilaIntJava.push(13);
        pilaIntJava.push(14);
        // Metodo empty --> Mira si esta vacia la pila o no.
        System.out.println("Metodo empty --> Mira si esta vacia la pila o no.");
        System.out.println(pilaIntJava.empty());
        // Metodo pop --> Saca el elemento de la pila
        System.out.println("Metodo pop --> Saca el elemento de la pila");
        System.out.println(pilaIntJava.pop());
        // Metodo peek --> Mira el elemento que esta en la cima de la pila sin sacarlo
        System.out.println("Metodo peek --> Mira el elemento que esta en la cima de la pila sin sacarlo");
        System.out.println(pilaIntJava.peek());
        // Metodo search --> Busca un elemento en la pila y devuelve la posicion
        System.out.println("Metodo search --> Busca un elemento en la pila y devuelve la posicion");
        System.out.println(pilaIntJava.search(11));
    }
}
