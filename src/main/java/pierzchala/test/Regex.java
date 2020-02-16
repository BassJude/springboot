package pierzchala.test;

public class Regex {
    public static void main(String[] args) {
        String word = "NIP jest super, bo jest dobry.! Ale teraz już NIP nie jest potrzebny,";
        if (word.matches("[NIP]+[a-zA-Z\\s,\\.!ż]+[NIP]+[a-zA-Z\\s,\\.!ż]+")){
            System.out.println("Pasuje");
        }
    }
}
