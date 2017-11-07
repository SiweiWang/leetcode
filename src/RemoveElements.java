public class RemoveElements {
    public ListNode removeElements(ListNode head, int val){
        ListNode tmp = new ListNode(-1);
        ListNode pre = tmp;
        tmp.next = head;
        while(pre.next != null){
            ListNode current = pre.next;
            if(current.val == val) {
                pre.next = current.next;
                current.next = null;
                current = null;
            }else{
                pre = pre.next;
            }
        }
        return tmp.next;
    }

    public static void main (String [] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        RemoveElements r = new RemoveElements();
        System.out.print(r.removeElements(a, 1).val);

    }
}
