public class Remduplnk {

	public static void main(String[] args) {
		ListNode listnode = new ListNode(1);
		ListNode listnode2= new ListNode(1);
		listnode.next =listnode2;
		ListNode listnode3= new ListNode(2);
		listnode2.next =listnode3;
		ListNode listnode4= new ListNode(2);
		listnode3.next =listnode4;
		ListNode listnode5= new ListNode(2);
		listnode4.next =listnode5;
		ListNode deleted = deleteDuplicates(listnode);
		
		

	}
	
	public static ListNode deleteDuplicates(ListNode a) {
		
		ListNode firstNode = a;
	    while(a != null && a.next != null) {
	    	ListNode next = a.next;
	    	int nextVal = next.val;
	    	if(a.val == nextVal) {
	    		a.next = a.next.next;
	    	}else {
	    		a = a.next;
	    	}
	    }
	    
	    return firstNode;
	}

}
