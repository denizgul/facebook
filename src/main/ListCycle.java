
public class ListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listnode = new ListNode(1);
		ListNode listnode2= new ListNode(2);
		listnode.next =listnode2;
		ListNode listnode3= new ListNode(3);
		listnode2.next =listnode3;
		ListNode listnode4= new ListNode(4);
		listnode3.next =listnode4;
		listnode4.next=listnode3;
		
		System.out.println(detectCycle(listnode).val);
		
	}
	
	public static ListNode detectCycle(ListNode a) {
	    ListNode before = null;
	    while(a!= null && a.next != null) {
	        ListNode next = a.next;
	        if(before != null && before == next ){
	            return before;
	        }else{
	            before=a;
	            a = a.next;
	        }
	    }
	    return null;
	}

}
