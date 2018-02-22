package Basics;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal implements Iterable<String> {

    private ArrayList<String> animal = new ArrayList<>();

    public Animal(ArrayList<String> animal){
        this.animal = animal;
    }

    public ArrayList<String> getAnimal() {
        return animal;
    }

    @Override
    public Iterator<String> iterator() {
        return new AnimalIterator(this);
    }
}
