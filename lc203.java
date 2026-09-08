
while(head.val == val && head != null) {
    head = head.next;
}
Node cur = head;
while(cur != null && cur.next != null) {
    if(cur.next.val == val) {
        cur.next = cur.next.next;
    } else {
        cur = cur.next;
    }
}