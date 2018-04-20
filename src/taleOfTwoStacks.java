import java.util.Scanner;
import java.util.Stack;

public class taleOfTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Add new element to thr end of the queue
            if(stackNewestOnTop.isEmpty()){
                stackNewestOnTop.push(value);
            }
            else{
                stackOldestOnTop.push(value);
            }
        }

        public T peek() { // Print
            return stackNewestOnTop.peek();
        }

        public T dequeue() { // Remove element from the front od the queue end return it
            T toReturn = stackNewestOnTop.pop();
            if(stackNewestOnTop.isEmpty()){
                while (!stackOldestOnTop.isEmpty()){
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
            }
            return toReturn;
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
