package easy;

public class Merge2List {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = new ListNode(0);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
            if (list2 != null) cur.next = list2;
            else cur.next = list1;

        return head.next;
    }
    public static void main(String[] args) {
        Merge2List merge2List = new Merge2List();
     merge2List.mergeTwoLists(new ListNode(0), new ListNode());
    }
}