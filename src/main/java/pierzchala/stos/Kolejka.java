package pierzchala.stos;

/* kolejka */
public class Kolejka {

    private Elem first;
    private Elem last;

    public Kolejka() {
        first = last = null;
    }

    public Elem getFirst() {
        return first;
    }

    public Elem getLast() {
        return last;
    }

    public void setLast(Elem e) {
        last = e;
    }

    public void setFirst(Elem e) {
        first = e;
    }

    /* dodaje element na koniec kolejki */
    public void add(int x) {

        Elem temp = new Elem(x);
        if (first == null) {
            first = last = temp;
        } else {
            last.setNext(temp);
//temp.setNext(last);
            last = temp;
        }
    }

    /* sciaga z kolejki element na 1 miejscu */
    public void delete(){
        if(first!=null){
            if(first.getNext()==null){
                last=null;
            }

            first = first.getNext();
        }
        else System.out.println("kolejka jest pusta");
    }

    /* wyswietla zawartosc kolejki */
    public void show(){
        if(first!=null){
            System.out.println("Wyświetlam zawartość kolejki:");
            Elem temp = first;
            while(temp!=null){
                System.out.print(temp.getWartosc() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("kolejka jest pusta");
        }
    }

    /* zlicza liczbe elemenetow na kolejce */
    public int zlicz(){
        if(first!=null){
            int licznik=0;
            Elem temp = first;
            while(temp!=null){
                licznik++;
                temp=temp.getNext();
            }
            return licznik;
        }
        return 0;
    }

    /* kopiuje cala kolejke1 do kolejki k2
     * (kolejka 1 zostaje bez zmian
     */

    public void copy(Kolejka kolejka2){
        Elem temp = first;
        if(temp!=null){
            while(temp!=null){
                kolejka2.add(temp.getWartosc());
                temp=temp.getNext();
            }
        } else {
            System.out.println("kolejka jest pusta");
        }
    }

    /* scala 2 kolejki
     * wynik znajduje sie w kolejce 1
     * kolejka 2 jest pusta
     */

    public void scal(Kolejka kolejka2){
        if(first==null){
            first = kolejka2.getFirst();
            last = kolejka2.getLast();
        } else if(first!= null && kolejka2.getFirst()!=null){
            last.setNext(kolejka2.getFirst());
            last = kolejka2.getLast();
        }
        kolejka2.setLast(null);
        kolejka2.setFirst(null);
    }

    /* menu */
    public static void menu(){
        System.out.println("(0) MENU\n(1) ADD\n(2) DELETE\n(3) SHOW");
        System.out.println("(4) ZLICZ\n(5) COPY\n(6) SCAL\n(7) EXIT");
    }
}
