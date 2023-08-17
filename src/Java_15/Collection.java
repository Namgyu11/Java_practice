package Java_15;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

// Practice
// 로또 번호 만들기
public class Collection {
    public static void main(String[] args) {

        HashSet set = new HashSet(); //중복을 피하려고

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }

        LinkedList list = new LinkedList(set);
        Collections.sort(list);
        System.out.println("로또 번호 : " + list);


        LinkedList list2 = new LinkedList();

        for(int i = 0; list2.size() < 6; i++){
            int num2 = (int)(Math.random() * 45) + 1;
            list2.add(num2);
        }
        Collections.sort(list);
        System.out.println("로또 번호 : " + list);
    }

}
