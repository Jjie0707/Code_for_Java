package test0;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.size());
        list.add(1,2);
        list.add(3);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1) {
                System.out.print(list.get(i));
                System.out.print(", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.println("]");

    }
}
