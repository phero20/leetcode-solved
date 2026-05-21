public class MyCircularDeque {
    private int[] arr;
    private int front, rear, count, capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        arr = new int[k];
        front = 0;
        rear = -1;
        count = 0;
    }

    public bool InsertFront(int value) {
        if (IsFull()) return false;
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        count++;
        if (count == 1) rear = front;
        return true;
    }

    public bool InsertLast(int value) {
        if (IsFull()) return false;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;
        if (count == 1) front = rear;
        return true;
    }

    public bool DeleteFront() {
        if (IsEmpty()) return false;
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    public bool DeleteLast() {
        if (IsEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        count--;
        return true;
    }

    public int GetFront() {
        return IsEmpty() ? -1 : arr[front];
    }

    public int GetRear() {
        return IsEmpty() ? -1 : arr[rear];
    }

    public bool IsEmpty() {
        return count == 0;
    }

    public bool IsFull() {
        return count == capacity;
    }
}

