/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP:
 * How would you solve this problem if a temporary buffer is not allowed?
 */

package Chapter_2.Question2_1;

import java.util.HashSet;

public class RemoveDups {
    public static void removeDuplicates(LinkedListNode node) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode prev = null;
        while (node != null) {
            if (set.contains(node.data)) {
                prev.next = node.next;
            } else {
                set.add(node.data);
                prev = node;
            }
            node = node.next;
        }
    }
}
