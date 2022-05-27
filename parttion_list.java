/*****************************************************************

    Following is the class structure of the LinkedListNode class:
	
    class LinkedListNode {
	int data;
	LinkedListNode next;

	LinkedListNode(int data) {
		this.data = data;
		this.next = null;
	   }
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode partitionList(LinkedListNode head, int k) {
		// Write your code here.
        LinkedListNode less= new LinkedListNode(-1);
        LinkedListNode great= new LinkedListNode(-1);
        
        LinkedListNode n1=less;
        LinkedListNode n2=great;
        
        
        while(head!=null){
              
            if(head.data<k){
                
                less.next=head;
                less=less.next;
            }
            else{
                great.next=head;
                great=great.next;
            }
    
            head=head.next;
        }
        
        great.next=null;
        less.next=n2.next;
        
        return n1.next;
        
        
	}
}

