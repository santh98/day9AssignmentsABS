package com.bridgelabzlinkedlist;

public class SortedLinkedList<T extends  Comparable<T>> {
    Node <T> head;
    Node <T> tail;
    public void add(T data) {
        Node<T> newNode= new Node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void sort(){
        Node<T> temp1 = head;
        Node<T> temp2 = head;
        T temp3;

        if(head != null) {
            while(temp1 != null){
                temp2 = temp1.next;
                while (temp2 != null){
                    if((temp1.data.compareTo(temp2.data))>0){
                        temp3= temp1.data;
                        temp1.data= temp2.data;
                        temp2.data= temp3;
                    }
                    temp2= temp2.next;
                }
                temp1= temp1.next;
            }
        }
    }
    public void show() {
        Node<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data + "-> ");
            temp= temp.next;
        }
    }
}


