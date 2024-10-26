package LinkedList;

public class Main {
    public static ListNode arrayToListNode(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode list1 = arrayToListNode(new int[]{1, 2, 4});
        ListNode list2 = arrayToListNode(new int[]{1, 3, 4});
        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        System.out.print("Example 1 Output: ");
        printListNode(mergedList1);

        // Example 2
        ListNode list3 = arrayToListNode(new int[]{});
        ListNode list4 = arrayToListNode(new int[]{});
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        System.out.print("Example 2 Output: ");
        printListNode(mergedList2);

        // Example 3
        ListNode list5 = arrayToListNode(new int[]{});
        ListNode list6 = arrayToListNode(new int[]{0});
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        System.out.print("Example 3 Output: ");
        printListNode(mergedList3);
    }
}
