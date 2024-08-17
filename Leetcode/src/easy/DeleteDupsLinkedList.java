package easy;


public class DeleteDupsLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        DeleteDupsLinkedList solution = new DeleteDupsLinkedList();
        ListNode result = solution.deleteDuplicates(head);

        // طباعة القائمة المرتبطة بعد إزالة العناصر المكررة
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}