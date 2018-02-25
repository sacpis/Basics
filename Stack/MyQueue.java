package Basics.Stack;

public class MyQueue {
    Stack stackNewest, stackOldest;

    public MyQueue(){
        stackNewest = new Stack(10);
        stackOldest = new Stack(10);
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void add(int v){
        stackNewest.push(v);
    }

    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }

    public int remove(){
        shiftStacks();
        return stackOldest.pop();
    }
}
