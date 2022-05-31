package tests.MOJO;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class AddTwoNumbers {

    // O(max(l1.size, l2.size))
    private  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, head = null;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;

            int value  = sum%10;
            carry = sum/10;
            ListNode node = new ListNode(value);
            if(result == null) {
                result  = node;
                head = node;
            } else {
                result.next = node;
                result = result.next;
            }
        }
        if(carry > 0) {
            result.next = new ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(7);
        l1.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(8);

        ListNode result = addTwoNumbers(l1, l2);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
