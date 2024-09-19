package _09lifo;

public class PilaT<T> {

    private NodoT<T> top;
    private Integer size;

    public PilaT() {
        this.size = 0;
        this.top = null;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public Integer size() {
        return this.size;
    }

    public T top() {
        return top.getElemento();
    }

    public T pop() {
        T aux = top.getElemento();
        this.top = top.getSiguiente();
        size--;
        return aux;
    }

    public void push(T elemento) {
        NodoT<T> nuevo = new NodoT<>(elemento, top);
        this.top = nuevo;
        size++;
    }

    @Override
    public String toString() {
        return "PilaT [top=" + top + ", size=" + size + "]";
    }

}
