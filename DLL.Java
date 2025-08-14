public class DLL{
    int data;
    DLLNode;
    DLLNode;
    public DLLNode(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
public class DLLNode {
    DLLNode next;
    DLLNode prev;

    public DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public void insertAtEnd(int data) {
    DLLNode newNode = new DLLNode(data);
    if (head == null) {
        head = newNode;
        return;
    } newNode.next=head;
        head.prev = newNode;
}
        public void insertAtEnd(int data) {}
        public void display() {
            DLLNode current = head;
            while (temp!= null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(x:"Null");

        }
        public static void main(String[] args) {
            DLL dll = new DLL();
            dll.insert(data:1);
            dll.insertAtEnd(data:2);
            dll.insertAtEnd(data:3);
            dll.insertAtEnd(data:4);
            List.display();
         }
        //  ===============================================================

        