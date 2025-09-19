package lab4;

public class Circular {
    private int capacity;
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    
    public Circular(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public Circular(){};
    
    public boolean isFull(){
        return size == capacity;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void enqueue(int value){
        if (isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        System.out.println("Enquequed: " + value);
    }
    
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front +1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }
    
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front+1];
    }
    
    public String display(){
        String display = "";
        for (int i = 0; i < size; i++){
            display += (arr[(front + i) % capacity] + " ");
        }
        return display;
    }
}
