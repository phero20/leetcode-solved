class MyCircularDeque {
private:
    vector<int> arr;
    int front, rear, count, capacity;

public:
    MyCircularDeque(int k) {
        capacity = k;
        arr.resize(k);
        front = 0;
        rear = -1;
        count = 0;
    }

    bool insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        count++;
        if (count == 1) rear = front;
        return true;
    }

    bool insertLast(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;
        if (count == 1) front = rear;
        return true;
    }

    bool deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    bool deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        count--;
        return true;
    }

    int getFront() {
        return isEmpty() ? -1 : arr[front];
    }

    int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }

    bool isEmpty() {
        return count == 0;
    }

    bool isFull() {
        return count == capacity;
    }
};

