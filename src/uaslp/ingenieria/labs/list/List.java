package uaslp.ingenieria.labs.list;

public class List {
    private Node first;
    private Node last;
    private int size;

    /**
     * Insertar al final de la lista
     * @param fact dato a insertar uwu
     */
    public void add(int fact){
        Node newNode = new Node(fact);
        newNode.previous = last;

        last = newNode;

        if(first == null)
        {
            first = newNode;
        }

        size++;
    }

    /*public int get(int index){
        Node currentNode =first;
        int currentIndex = 0;

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("El indice");

        }

        while(currentNode != null && currentIndex != index){
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        return currentNode.getFact();
    }*/
}
