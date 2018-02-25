package Basics.Stack;

public class Stack {
    private int capacity;
    public Node top, bottom;
    public  int size = 0;

    public Stack(int capacity){
        this.capacity = capacity;
    }

    public boolean isFull(){
        return capacity == size;
    }

    public void join(Node above, Node below){
        if(below != null){
            below.above = above;
        }

        if(above != null){
            above.below = below;
        }
    }

    public boolean push(int v){
        if(size >= capacity){
            return false;
        }

        size++;
        Node n = new Node(v);
        join(n, top);
        top = n;
        return true;
    }

    public int pop(){
        Node t = top;
        top = top.below;
        size--;
        return t.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int removeBottom(){
        Node b = bottom;
        bottom = bottom.above;
        if(bottom != null){
            bottom.below = null;
        }
        size--;
        return b.data;
    }

    public int peek(){
        return top.data;
    }
}

class Node {
    int data;
    Node above, below;

    public Node(int data){
        this.data = data;
    }
}
