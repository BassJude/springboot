package pierzchala.stos;

/* jeden wezel */
public class Elem {

    private int wartosc;
    private Elem next;

    public Elem(int x) {
        wartosc = x;
        next = null;
    }

    public void setNext(Elem e) {
        next = e;
    }

    public Elem getNext() {
        return next;
    }

    public int getWartosc() {
        return wartosc;
    }

}
