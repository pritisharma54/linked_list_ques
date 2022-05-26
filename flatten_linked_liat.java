/*******************************************************
https://www.codingninjas.com/codestudio/problems/flatten-the-multi-level-linked-list_839810?leftPanelTab=0
	Following is the Node class structure

	class Node {
	    int data;
	    Node next;
	    Node child;
	    
	    public Node(int data) {
	        this.data = data;
	    }
	}

*******************************************************/

public class Solution {
    
    public static Node flattenMultiLinkedList(Node head) {
        // Write you code here.
        
        Node tail=head,curr=head,temp=null;
        
        while(tail.next!=null){
            tail=tail.next;
        }
        
        while(curr!=null){
            if(curr.child!=null){
                tail.next=curr.child;
                temp=curr.child;
                
                while(temp.next!=null){
                    temp=temp.next;
                }
                
                tail=temp;
                
            }
            curr=curr.next;
        }
        return head;
    }

}
