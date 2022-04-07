
/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        LinkedListNode<Integer> curr=head;
        int i=0;
        
        while(curr!=null || i<0){
            
            if(curr.data==n)
                return i;
            curr=curr.next;
            i++;
        }
        
        return -1;
	}
}
//check notes for insert delete
