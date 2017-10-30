/**
 * Created by siweiwang on 2017-10-28.
 */
public class DeleteDuplicates {
    public ListNode deleteDupicates (ListNode head){
        ListNode p = head;
        if (head == null) { return head; }
        int current = head.val ;
        ListNode last = null;
        while (p.next != null){
            if ( p.next.val == current ) {
                ListNode tmp = p.next;
                p.next = p.next.next;
                tmp = null;
            }else {
                current = p.next.val;
                p = p.next;
            }
        }
        return head;
    }

    public static void main(String[] arg){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        DeleteDuplicates d = new DeleteDuplicates();
        ListNode p = d.deleteDupicates(l1);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
