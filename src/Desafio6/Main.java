package Desafio6;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.print();
        lista.remove(3);
        lista.removeFirst();
        lista.sortByAge();
        lista.print();
        lista.addFirst(new Ninja("Kakashi", 30, "Konoha"));
        lista.add(new Ninja("Jiraya", 50, "Konoha"), 1);
        lista.print();
        lista.removeAll();
        lista.print();
        lista.add(new Ninja("Kisame", 25, "Akatsuki"));
        lista.add(new Ninja("Itachi", 21, "Akatsuki"));
        lista.add(new Ninja("Deidara", 19, "Akatsuki"));
        lista.sortByName();
        lista.print();
        lista.addFirst(new Ninja("Kakuzu", 91, "Akatsuki"));
        lista.add(new Ninja("Hidan", 91, "Akatsuki"), 2);
        lista.print();
        System.out.println(lista.findByName("Kakuzu"));
    }

}
