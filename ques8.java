class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ques8 {
    Node head;

    public static void main(String[] args) {
        Codechef list = new Codechef();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.head = reverseList(list.head);
        printList(list.head);
    }

    static Node reverseList(Node head) {
        if (head == null || head.next == null) return head;

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
