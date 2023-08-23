//Finding middle element in a linked list


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 1; i <= (count / 2); i++) {

            temp = temp.next;
        }
        return temp.data;
    }
}
