package Compuertas_Logicas;

import java.util.Iterator;

/**
 * Se crea la lista enlazada
 *
 */
public class Lista_Enlazada<T> implements Iterator<T> {
    private Node<T> head;
    private int length;

    /**
     * Constructor
     */

    public Lista_Enlazada() {
        this.head = null;
        this.length = 0;
    }

    /**
     * Este método verifica si la lista se encuentra vacía
     *
     * @return True en caso de que se encuentre vacía, false en caso contrario
     */

    public boolean isEmpty() {

        if (head == null) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Método que agrega un nodo a la lista, se comporta igual que addLast
     * @param object
     */

    public void add(Object object){
        addLast(object);
    }


    /**
     * Método que agrega un nodo a la primera posición de la lista
     *
     * @param object Object added
     */

    
	public void addFirst(Object object) {

        if (head == null) {
            head = new Node(object);
        } else {
            Node temp = head;
			Node newNodo = new Node(object);
            newNodo.next = temp;
            head = newNodo;
        }
        length++;
    }


    /**
     * Este método agega un nodo a la última posición de la lista
     * @param object
     */

    public void addLast(Object object){
        if(head==null){
            head = new Node(object);
        }else{
            Node Node = head;
            while(Node.next != null){
                Node = Node.next;
            }
            Node.next  = new Node(object);
        }
        length++;
    }

    /**
     * Este método retorna el tamaño de la lista
     *
     * @return lenth
     */
    public int size() {
        return length;
    }


    /**
     * Este método obtiene el objeto que se encuentra en la posición especificada
     *
     * @param index índice
     * @return El objeto de la posición
     */
    public T getElement(int index) {
        int cont = 0;
        Node Node = head;
        while (cont < index) {
            Node = Node.next;
            cont++;
        }
        return (T) Node.value;
    }


    /**
     * Este método remueve el nodo de la posición especificada
     */
    public void remove(int index) {
        if (length == 1) {
            head = null;
            length = 0;
        } else if (index == 0) {
            head = head.next;
            length -=1;
        } else {
            int i = 0;
            Node current = head;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            current.next = current.next.next;
            length -=1;
        }
    }
    /**
     * Este método muestra toda los elementos de la lista
     */
    public void showData(){
        Node Node = head;
        while (Node != null){
            System.out.println(Node.value);
            Node = Node.next;
        }
    }

    public T getLast(){
        Node Node = head;
        while(Node.next != null){
            Node = Node.next;
        }
        return (T) Node.value;
    }
    public void removeAll(){
        head = null;
        length = 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
