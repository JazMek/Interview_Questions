package java_Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reverse_LinkedList {
    /*
    Given a linked list of N nodes. The task is to reverse in place this list.
    Example 1:
    Input:
    LinkedList: 1->2->3->4->5->6
    Output: 6 5 4 3 2 1
    Explanation: After reversing the list,
    elements are 6->5->4->3->2->1.
     */

    public static LinkedList<Integer> MyLinkedList =new LinkedList<>();

    public static void main(String[] args) {
        MyLinkedList.add(1);
        MyLinkedList.add(2);
        MyLinkedList.add(3);
        MyLinkedList.add(4);
        MyLinkedList.add(5);
        MyLinkedList.add(6);
        MyLinkedList.add(33);
        MyLinkedList.add(12);
        MyLinkedList.add(14);
        MyLinkedList.add(24);
        MyLinkedList.add(60);
        MyLinkedList.add(-2);
        System.out.println(MyLinkedList);
//        System.out.println(reverseList(MyLinkedList));
        System.out.println(reverseLenkedList(MyLinkedList));

    }
    public static LinkedList<Integer> reverseLenkedList(LinkedList<Integer> MyLinkedList){
        int size =MyLinkedList.size();
        int tump,tump1,i,j;
            for(i=0 ,j=size-1;i<size/2;i++ ,j--){
                tump=MyLinkedList.get(i);
                tump1=MyLinkedList.get(j);
                MyLinkedList.remove(i);
//                MyLinkedList.remove(j-1);
                MyLinkedList.add(i,tump1);
                MyLinkedList.remove(j);
                MyLinkedList.add(j,tump);
            }
        return MyLinkedList;
    }

    public static List<Object> reverse(List<Integer> linkelist){
        int i,j,a;
        Object[] array= linkelist.toArray();
        for(i=0,j=array.length-1;i<= array.length/2;i++,j--){
            a= (int) array[i];
            array[i]=array[j];
            array[j]=a;
        }
// List<Integer> mylist=new LinkedList<Integer>();
        List<Object> mylist = Arrays.asList(array);
        return mylist;
    }
    //second method
    public static void reverse2(List<Integer> linkelist){
// [10,20,30,40,50,60]
        List<Integer> linkedlist2=new LinkedList<>();
        int i;
        for (i=linkelist.size();i>0;i--) {
            linkedlist2.addAll(linkelist.subList(i-1,i));
        }
        System.out.println(linkedlist2);
    }
}
