package linkedlistproject;

import java.net.SocketOption;

public class Main {
    public static void main (String[]args){
        LinkedList list = new LinkedList();
         list.insert(10);
         list.insert(15);
         list.insert(20);
         list.insert(25);
         list.insert(30);

         System.out.println("Linked List " + list.toString());
        System.out.println("Has" + list.Have(15));
        System.out.println("Has" + list.Have(50 ));

    }
}
