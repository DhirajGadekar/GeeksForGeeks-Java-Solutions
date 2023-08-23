//Count nodes of linked list
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int count = 0;
        while(head != null) {
            
            count++;
            head = head.next;
        }
        return count;
    }
}
