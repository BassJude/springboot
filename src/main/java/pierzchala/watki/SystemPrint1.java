package pierzchala.watki;

import org.springframework.stereotype.Component;

@Component
public class SystemPrint1 {

    private int i=0;

    public void print() {
        System.out.println("Dzialam");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
