import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    Node(T val, Node<T> next){
        this.data = val;
        this.next = next;
    }
}

class SList<T> {
    Node<T> head;
    
    private static SListIterator iterator(Node head){
        SListIterator iter = new SListIterator(head);
        return iter;
    }

    public static void main(String args[]){

        SList sList = new SList();
        sList.head = new Node("Head",null);
        SListIterator iter = iterator(sList.head);

        while(true){
            System.out.println("Press 1 to add a new Node");
            System.out.println("Press 2 to remove the last Node");
            System.out.println("Press 3 to iterate and print the list");
            System.out.println("Press -1 to exit");

            Scanner scan = new Scanner(System.in);
            int response = scan.nextInt();

            if(response == 1){
                System.out.println("Enter data to insert: ");
                iter.insert(scan.next());
            }
            else if(response == 2){
                iter.remove();
            }
            else if(response == 3){
                iter.iterate();
            }
            else if(response == -1){
                break;
            }
            else{
                System.out.println("Invalid response");
            }
        }

    }

}

class SListIterator<T>{

    Node<T> head;
    Node<T> current;
    Node<T> previous;
    Node<T> prePrevious;

    public SListIterator(Node<T> head) {
        this.head = head;
        current = head;
    }

    void insert(T val){
        Node<T> node = new Node<T>(val,null);
        current.next = node;
        previous = current;
        current = node;
    }

    void remove(){
        Node<T> curr = head;
        if(head.next == null){
            System.out.println("Slist is empty, Cannot Remove any node");
        }
        else {
            while (curr.next != null) {
                prePrevious = previous;
                previous = curr;
                curr = curr.next;
            }
            current = previous;
            current.next = null;
            previous = prePrevious;
        }
    }

    void iterate(){
        Node<T> cur=head;
        while(cur!=null){
            if(cur!=head){
                System.out.print(" -> ");
            }
            System.out.print(cur.data);
            cur=cur.next;
        }
        System.out.println("");
    }

}