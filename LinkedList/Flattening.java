/* 61. Flattening
flattening a multilevel linked list.

Each node has:

next → points to the next list.
bottom → points to a sorted linked list.
Example
5 → 10 → 19 → 28
|    |     |     |
7    20    22    35
|          |     |
8          50    40
|                |
30               45

Using bottom pointers, the lists are:

5 → 7 → 8 → 30
10 → 20
19 → 22 → 50
28 → 35 → 40 → 45

After flattening:

5 → 7 → 8 → 10 → 19 → 20 → 22 → 28 → 30 → 35 → 40 → 45 → 50

*/
class Flattening {

    Node merge(Node a, Node b) {

        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null;

        return result;
    }

    Node flatten(Node root) {

        if (root == null || root.next == null)
            return root;

        root.next = flatten(root.next);

        return merge(root, root.next);
    }
}