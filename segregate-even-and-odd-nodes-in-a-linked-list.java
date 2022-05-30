/****************************************************************

    Following is the class structure of the Node class:
https://www.codingninjas.com/codestudio/problems/segregate-even-and-odd-nodes-in-a-linked-list_1116100?leftPanelTab=0
    class Node
    {
        public int data;
        public Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution
{
    public static Node segregateEvenOdd(Node head)
    {
        Node odd= new Node(-1);
        Node even= new Node(-1);
        
        Node oddTail=odd;
        Node evenTail=even;
        
        Node curr=head;
        
        while(curr!=null){
            if((curr.data & 1) != 0){
                oddTail.next=curr;
                oddTail=oddTail.next;
            }
            else{
                evenTail.next=curr;
                evenTail=evenTail.next;
            }
        
        curr=curr.next;
   
         }
        evenTail.next=odd.next;
        oddTail.next=null;
    
        return even.next;
}   
    
}  
            
            
        
        
        
        
