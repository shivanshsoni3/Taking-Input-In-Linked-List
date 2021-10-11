package com.company;

import java.util.Scanner;

class LinkedListUse
{
    public static Node createList()
    {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null;
        while(data!=-1){
            Node currentNode = new Node(data);
            if(head==null)
            {
                head = currentNode;
            }
            else
            {
                Node tail = head;
                while(tail.next!=null)
                {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void printList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
       Node head = createList();
       printList(head);
    }
}