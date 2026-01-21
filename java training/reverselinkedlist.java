public class reverselinkedlist{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        Node head;
        LinkedList(){
            this.head = null;
        }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void printList(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
        public void reverse(){
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.println("Original List:");
        list.printList(); // Output: 30 -> 20 -> 10 -> null
        list.reverse();
        System.out.println("Reversed List:");
        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}