class MyCircularDeque {
    private int[] arr;
    private int front,rear,count,capacity;
    public MyCircularDeque(int k) {
        arr = new int[k];
        front = 0;
        rear = -1;
        capacity = k;
        count = 0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        front = (front - 1 + capacity)%capacity;
        arr[front] = value;
        count++;
        if (count == 1) rear = front;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        rear = (rear + 1)% capacity;
        arr[rear] = value;
        count++;
        if (count == 1) front = rear;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        count--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        count--;
        return true;
    }
    
    public int getFront() {
        return isEmpty() ? -1 : arr[front];
    }
    
    public int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return capacity == count;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
