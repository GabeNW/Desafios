package Desafio6;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    List<Ninja> ninjas = new ArrayList<>();

    public LinkedList() {
        ninjas.add(new Ninja("Sakura", 17, "Konoha"));
        ninjas.add(new Ninja("Naruto", 17, "Konoha"));
        ninjas.add(new Ninja("Sasuke", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi", 30, "Konoha"));
        ninjas.add(new Ninja("Itachi", 21, "Akatsuki"));
        ninjas.add(new Ninja("Deidara", 19, "Akatsuki"));
        ninjas.add(new Ninja("Kisame", 25, "Akatsuki"));
    }

    public void add(Ninja ninja) {
        ninjas.add(ninja);
    }
    public void add(Ninja ninja, int index) {
        ninjas.add(index, ninja);
    }
    public void addFirst(Ninja ninja) {
        ninjas.add(0, ninja);
    }
    public void remove(int index) {
        ninjas.remove(index);
    }
    public void removeFirst() {
        ninjas.remove(0);
    }
    public void removeAll() {
        ninjas.clear();
    }
    public Ninja get(int index) {
        return ninjas.get(index);
    }
    public void print() {
        System.out.println("---------------- Ninjas ----------------");
        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println(ninjas.get(i).toString());
        }
        System.out.println("");
    }
    public void printList() {
        System.out.println(ninjas);
    }
    public void sortByName() {
        ninjas.sort((n1, n2) -> n1.getNome().compareTo(n2.getNome()));
    }
    public void sortByAge() {
        ninjas.sort((n1, n2) -> n1.getIdade() - n2.getIdade());
    }
    public void sortByVillage() {
        ninjas.sort((n1, n2) -> n1.getVila().compareTo(n2.getVila()));
    }
    public String findByName(String name) {
        sortByName();
        for (int i = 0; i < ninjas.size(); i++) {
            if (ninjas.get(i).getNome().equals(name)) {
                return ninjas.get(i).toString();
            }
        }
        return "Ninja não encontrado";
    }


}
