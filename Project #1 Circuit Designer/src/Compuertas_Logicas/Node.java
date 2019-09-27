package Compuertas_Logicas;

public class Node<T> {
    public Node next;
    public T value;
    /**
     * Constructor
     */
    public Node(T object) {
        this.value = object;
        this.next = null;
    }

}

