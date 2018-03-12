package Basics.Queue;

import java.util.LinkedList;

public class AnimalQueue {

    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if(a instanceof Dog){
            dogs.addLast((Dog) a);
        }
        else if(a instanceof Cat){
            cats.addLast((Cat) a);
        }
    }

    public Animal deuqueAny(){
        if(dogs.size() == 0 && cats.size() != 0){
            return dequeueCats();
        }
        else if(cats.size() == 0 && dogs.size() != 0){
            return dequeueDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if(dog.isOlder(cat)){
            return dequeueDogs();
        }
        else {
            return dequeueCats();
        }
    }

    public Dog dequeueDogs(){
        return dogs.poll();
    }

    public Cat dequeueCats(){
        return cats.poll();
    }

}
