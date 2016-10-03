/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */

package Chapter_2.Question2_2;

import Chapter_2.Question2_1.LinkedListNode;

public class ReturnKthToLast {
    public static LinkedListNode returnKthToList(LinkedListNode node, int k) {
        LinkedListNode p1 = node;
        LinkedListNode p2 = node;

        // Move p2 k nodes in
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null; // Out of bounds
            p1 = p1.next;
        }

        // Move the two pointers at the same time until p1 hits the end
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
