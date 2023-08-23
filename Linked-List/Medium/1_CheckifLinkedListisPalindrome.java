//Check if Linked List is Palindrome

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node temp = head;
        int count = 0;
        while(temp != null) {
            
            count++;
            temp = temp.next;
        }
        
        int flag = 0;
        int data = 0;
        for(int i = 1; i <= count / 2; i++) {
            
            temp = head;
            if(temp.next == null) {
                
                data = temp.data;
            } else {
                while(temp.next.next != null) {
                
                    temp = temp.next;
                }
                data = temp.next.data;
            }
            if(data == head.data) {
                
                flag = 1;
            } else {
                
                return false;
            }
            head = head.next;
            temp.next = null;
        }
        
        return true;
    }    
}
