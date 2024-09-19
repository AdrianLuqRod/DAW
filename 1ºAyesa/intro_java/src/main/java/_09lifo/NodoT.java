package _09lifo;

public class NodoT<T> {
    private T elemento;
    private NodoT<T> siguiente;

    public NodoT(T elemento, NodoT<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoT<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoT<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoT [elemento=" + elemento + ", siguiente=" + siguiente + "]";
    }

}
