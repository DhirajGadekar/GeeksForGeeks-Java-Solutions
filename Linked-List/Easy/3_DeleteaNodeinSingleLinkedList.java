/* Linklist node structure
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
/*You are required to complete below method*/
class GfG {
    
    static int countNode(Node head) {
        
        int count = 0;
        while(head != null) {
            
            count++;
            head = head.next;
        }
        return count;
    }
    Node deleteNode(Node head, int x) {
		
        int count = countNode(head);
        if(x < 0 || x > count) {
			return null;
        } else {
			
			if(x == 1) {
				head = head.next;
		        return head;
	        } else if(count == x) {
		        
		        Node temp = head;
		        while(temp.next.next != null) {
		            temp = temp.next;
		        }
		        temp.next = null;
		        return head;
	        } else {
		        
		        Node temp = head;
		        while(0 != x - 2) {
		            
		            temp = temp.next;
		            x--;
	            }
		        temp.next = temp.next.next;		        
		        return head;
	        }
	    }
    }
}

