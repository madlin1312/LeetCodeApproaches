*Insert node*

void insert(int pos, int ele){
    Node temp = new Node(data);
    if(pos==1){
        temp.next = head;
        head = temp;
        return;
    }
    Node cur = head;
    for(int i=1; i<pos-1 && cur!=null; i++)
    {
        cur = cur.next;
    }

    if(cur!=null)
    {
        temp.next = cur.next;
        cur.next=temp;
    }
    else{
        System.out.println("Invalid Position");
    }
}