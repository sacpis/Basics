package Basics;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalIterator implements Iterator<String> {

    private ArrayList<String> animal;
    private int position;

    public AnimalIterator(Animal animalBase){
        this.animal = animalBase.getAnimal();
    }

    @Override
    public boolean hasNext(){
        if(position < animal.size()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String next() {
        String aniObj = animal.get(position);
        position++;
        return aniObj;
    }

    @Override
    public void remove() {
        animal.remove(position);
    }
}
