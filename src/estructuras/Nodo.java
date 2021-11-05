package estructuras;

import java.util.Iterator;

public class Nodo<T> implements Iterator<T>{
  private T elementoNodo;
  public Nodo<T> anterior;
  public Nodo<T> siguiente;
  
  public Nodo(T pElemento) {
    elementoNodo = pElemento;
    anterior = null;
    siguiente = null;
    
  }

  public Nodo<T> getAnterior() {
    return anterior;
  }

  public void setAnterior(Nodo<T> anterior) {
    this.anterior = anterior;
  }

  public Nodo<T> getSiguiente() {
    return siguiente;
  }

  public void setSiguiente(Nodo<T> siguiente) {
    this.siguiente = siguiente;
  }

  public T getElementoNodo() {
    return elementoNodo;
  }

  public void setElementoNodo(T elementoNodo) {
    this.elementoNodo = elementoNodo;
  }

  /**
   * Revisa si el nodo tiene un nodo antes
   * @return true si el nodo anterior es diferente de null, false si no.
   */
  public boolean tieneAnterior() {
    return anterior != null;
  }

  /**
   * Revisa si el nodo tiene un nodo después
   * @return true si el nodo siguiente es diferente de null, false si no.
   */
  @Override
  public boolean hasNext() {
    return siguiente != null;
  }

  @Override
  public T next() {
    return siguiente.getElementoNodo();
  }

  @Override
  public String toString() {
    return elementoNodo.toString();
  }
}
