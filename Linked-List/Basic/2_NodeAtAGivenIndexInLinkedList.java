//Node at a given index in linked list

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{

    static int countNode(Node node) {

        int count = 0;
        while(node != null) {

            count++;
            node = node.next;
        }
        return count;
    }
    public static int getNth(Node node, int ind)
    {
        int count = countNode(node);
        if(ind < 0 || ind > count + 1) {

            return -1;
        } else {

            if(ind == 1) {

                return node.data;
            } else if(ind == count + 1) {

                while(node.next != null) {

                    node = node.next;
                }
                return node.data;
            } else {

                while(0 != ind - 2) {

                    node = node.next;
                    ind--;
                }
                return node.next.data;
            }
        }
    }
}
