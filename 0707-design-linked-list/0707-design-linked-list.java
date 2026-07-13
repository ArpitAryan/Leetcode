class MyLinkedList {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;

        length++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }

        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return;
        }

        if (index == 0) {
            head = head.next;
            length--;
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node temp = prev.next;
        prev.next = temp.next;

        if (temp == tail) {
            tail = prev;
        }

        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */