package leetcode;

public class AddLinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode pl = l3;
        int rem = 0;

        while(l1 != null || l2 != null){
            int val1 = 0;
            int val2 = 0;


            if(l1 != null) {
                val1 = l1.val;
            }
            if(l2 != null) {
                val2 = l2.val;
            }

            int total = val1+val2+rem;
            pl.val = total%10;
            if(total > 9){
                rem = 1;
            }else{
                rem = 0;
            }


            if(l1 != null){
                l1=l1.next;
            }
            if(l2 != null){
                l2=l2.next;
            }
            if(l1 != null || l2 != null){
                pl.next = new ListNode(0);
                pl = pl.next;
            }
        }

        if(rem == 1){
            pl.next = new ListNode(rem);
        }

        return l3;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

