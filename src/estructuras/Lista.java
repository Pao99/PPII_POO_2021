package estructuras;

import excepciones.ObjectNotInListException;
import excepciones.OutOfBoundsException;

public class Lista<T>{

  private Nodo<T> inicio = null;
  private Nodo<T> cola = null;
  private int size = 0;

  public void setInicio(Nodo<T> inicio) {
    this.inicio = inicio;
  }

  public Nodo<T> getInicio() {
    return inicio;
  }

  public void setCola(Nodo<T> cola) {
    this.cola = cola;
  }

  public Nodo<T> getCola() {
    return cola;
  }

  /**
   * Devuelve el tamaño de la lista
   */
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean contiene(T pObjeto) {
    Nodo<T> puntero = inicio;
    while (puntero != null) {
      if (puntero.getElementoNodo().equals(pObjeto)) {
        return true;
      }
      puntero = puntero.getSiguiente();
    }
    return false;
  }

  /**
   * Obtiene el objeto contenido una posición específica de la lista.
   * <p>
   * @param pPosicion Posición del objeto que desea buscarse en la lista comenzando en 0.
   * @return el objeto que está siendo buscado en una posición.
   * @throws OutOfBoundsException si la posición está fuera de los límites de la lista.
   */
  public T get(int pPosicion) throws OutOfBoundsException{
    Nodo<T> puntero = inicio;
    int indice = 0;
    if (pPosicion < 0 || pPosicion > size) {
      throw new OutOfBoundsException("El indice debe estar entre 0 y " + (size-1));
    } else {
      while (indice != pPosicion) {
        puntero = puntero.siguiente;
        indice++;
      }
      return puntero.getElementoNodo();
    }
  }

  /**
   * Ingresa un nuevo nodo al final de la lista
   * @param pElementoAgregar elemento que contendrá el nodo por ser creado
   */
  public void add(T pElementoAgregar) {
    Nodo<T> nuevoNodo = new Nodo<T>(pElementoAgregar);
    if (isEmpty()) {
      inicio = nuevoNodo;
      cola = nuevoNodo;
    } else {
      cola.setSiguiente(nuevoNodo);
      nuevoNodo.setAnterior(cola);
      setCola(nuevoNodo);
    }
    size++;
  }

  /**
   * Elimina el primer nodo de la lista
   */
  public void eliminarInicio() {
    Nodo<T> temp = inicio;
    inicio = inicio.getSiguiente();
    temp.setSiguiente(null);
  }

  /**
   * Elimina el ultimo nodo de la lista
   */
  public void eliminarCola() {
    Nodo<T> temp = cola;
    cola = cola.getAnterior();
    temp.setAnterior(null);
  }
  
  /**
   * Elimina de la lista el objeto ingresado
   * @param pObjetoEliminar objeto que será eliminado
   */
  public void eliminar(T pObjetoEliminar) throws ObjectNotInListException{
    if (contiene(pObjetoEliminar)) {
      Nodo<T> puntero = inicio;
      if (inicio.getElementoNodo().equals(pObjetoEliminar)) {
        eliminarInicio();
      } else if (cola.getElementoNodo().equals(pObjetoEliminar)) {
        eliminarCola();
      } else {
        while (puntero.hasNext()) {
          if (puntero.getElementoNodo().equals(pObjetoEliminar)) {
            Nodo<T> antPuntero = puntero.getAnterior();
            Nodo<T> sigPuntero = puntero.getSiguiente();
            antPuntero.siguiente = sigPuntero;
            sigPuntero.anterior = antPuntero;
            puntero = null;
            break;
          }
          puntero = puntero.getSiguiente();
        }
      }
      size--;
    } else {
      throw new ObjectNotInListException("El objeto que desea eliminar no existe en la lista");
    }
  }

  /**
   * Elimina el nodo en un determinado índice comenzando de 0.
   * @param pIndice indice del nodo que desea ser eliminado
   * @throws OutOfBoundsException
   */
  public void eliminar(int pIndice) throws OutOfBoundsException {
    if (pIndice > size-1) {
      throw new OutOfBoundsException("El índice está fuera de la lista");
    } else {
      
    }
  }

  /**
   * Elimina todos los datos de la lista.
   */
  public void clear() {
    inicio = null;
    cola = null;
    size = 0;
  }

  public void stringLista() {
    Nodo<T> puntero = inicio;
    while (puntero != null) {
      System.out.println(puntero.getElementoNodo());
      puntero = puntero.getSiguiente();
    }
  }

}
