package uaslp.ingenieria.labs.list;

class Node {
    Node previous;
    Node next;
    int fact;

    public Node(int fact){
        this.fact = fact;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }
}
