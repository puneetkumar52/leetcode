// Last updated: 6/16/2026, 8:52:46 AM
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

    // Minimal deserialization for testing
    public static ListNode deserialize(String s) {
        if (s.equals("[]")) return null;
        String[] vals = s.replaceAll("\\[|\\]", "").split(",");
        ListNode dummy = new ListNode(0), curr = dummy;
        for (String v : vals) curr = curr.next = new ListNode(Integer.parseInt(v));
        return dummy.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (ListNode n = this; n != null; n = n.next)
            sb.append(n.val).append(n.next != null ? "," : "");
        return sb.append("]").toString();
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}
