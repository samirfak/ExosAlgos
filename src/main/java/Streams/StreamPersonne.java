package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPersonne {

    public static void main (String [] args) {
        List<Personne> pers = new ArrayList<Personne>();
        Personne p1 = new Personne("Samir", 22);
        Personne p2 = new Personne("Lionel", 23);
        Personne p3 = new Personne("Anto", 20);
        Personne p4 = new Personne("Benni", 22);
        pers.add(p1);
        pers.add(p2);
        pers.add(p3);
        pers.add(p4);

        List<Personne> pers1 = pers.stream().sorted(c1).collect(Collectors.toList());
        for (Personne p:
             pers1) {
            System.out.println(p.getNom() + ": " + p.getAge() + "\n");

        }

        List<Personne> pers2 = pers.stream().sorted(c2).collect(Collectors.toList());
        for (Personne p:
                pers2) {
            System.out.println(p.getNom() + ": " + p.getAge() + "\n");

        }
    }

    static Comparator<Personne> c1 = new Comparator<Personne>() {
        public int compare(Personne p1, Personne p2) {
            if (p1.getAge() < p2.getAge()) {
                return -1;
            } else if (p1.getAge() > p2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    static Comparator<Personne> c2 = new Comparator<Personne>() {
        public int compare(Personne p1, Personne p2) {
            if (p1.getAge() < p2.getAge()) {
                return -1;
            } else if (p1.getAge() > p2.getAge()) {
                return 1;
            } else {
                return p1.getNom().compareTo(p2.getNom());
            }
        }
    };
}

