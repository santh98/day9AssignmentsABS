package com.bridgelabzlinkedlist;

import org.w3c.dom.Node;

public class LinkedList <T> {
     Node<T> head;
    Node<T> tail;
    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteFirstElement(T deletedelement)
    {
        deletedelement= head.data;
        if (head==tail) {
            head=null;
        }
        if (head!=null){
            head=head.next;
        }
        System.out.println("Deleted element is "+deletedelement);
    }
    public void deleteLastElement(T deletedElement){
        Node<T> temp=head;
        deletedElement= tail.data;
        if (head==null){
            System.out.println("list is empty");
        }
        if (head == tail) {
            head = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println();
            System.out.println("Deleted element is " + deletedElement);
        }
    }
    public void search(T  search)
    {
        Node<T> temp =head;
        boolean check=false;
        while (temp!=null){
            if (temp.data==search){
                check=true;
            }
            temp=temp.next;
        }
        if (check)
            System.out.println("Element found");
        else
            System.out.println("Element Not Found");
    }
    public void insertAnyWhere(T insert, T search)
    {
        Node<T> newNode =new Node<>(insert);
        Node<T> temp = head;
        Node<T> temp2 = head;
        while (temp!=null & temp2!=null){
            if (temp.data==search){
                temp2=temp2.next;
                temp.next=newNode;
                newNode.next=temp2;
                System.out.println("Data inserted successfully!!");
            }
            temp=temp.next;
            temp2=temp2.next;
        }
    }
    public void getSize(){
        Node<T> temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("Size of the list is " +count);
    }

    public void deleteAnElement(T delete)
    {
        Node<T> temp = head;
        Node<T> temp2;
        temp2 = head;
        Node<T> temp3 =head;
        int count=0;
        while (temp!=null & temp2!=null & temp3!=null){
            count++;
            if (count>2){
                temp3=temp3.next;
            }
            if (temp.data==delete){
                temp2=temp2.next;
                temp3.next=temp2;
                System.out.println("Elements deleted successfully!!");
            }
            temp=temp.next;
            temp2=temp2.next;
        }
    }
}
