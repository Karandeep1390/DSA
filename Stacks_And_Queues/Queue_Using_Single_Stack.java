package Stacks_And_Queues;

import java.util.Stack;

public class Queue_Using_Single_Stack {
    Stack<Integer> st = new Stack<>();

    public void enqueue(int data){
        st.push(data);
    }

    public int dequeue() throws Exception{
        if(st.isEmpty()){
            throw new Exception("Queue is Empty");
        }

        if(st.size() == 1){
            return st.pop();
        }

        int data = st.pop();
        int retVal = dequeue();
        enqueue(data);

        return retVal;
    }

    public static void main(String[] args) throws Exception {
        Queue_Using_Single_Stack q = new Queue_Using_Single_Stack();
        q.enqueue(10);
        q.enqueue(40);
        q.enqueue(80);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
