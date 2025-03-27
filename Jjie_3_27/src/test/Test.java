package test;

import java.util.Scanner;


public class Test {
    public static void main2(String[] args) {
        String s=new Scanner(System.in).nextLine();
        if(new StringBuilder(s).reverse().toString().equals(s)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
    public static int[] func(int n){
        int[] arr=new int[7];
        for(int i=6;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        return arr;
    }
    public static String toString(int[] arr){
        char[] ch={'佰','拾','万','仟','佰','拾','元'};
        char[] ch1={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        String str="";
        for (int i = 0; i < arr.length; i++) {
            str=str+ch1[arr[i]]+ch[i];
        }
        return str;
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(true){
            n=sc.nextInt();
            if(n<0 || n>9999999){
                System.out.println("非法金额，重新输入：");
            }else{
                break;
            }
        }
        System.out.println(toString(func(n)));
    }

    public static String reverse(String s){
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        char[] ch1=new char[ch.length];
        while(left<right){
            char tem=ch[left];
            ch[left]=ch[right];
            ch[right]=tem;
            left++;
            right--;
        }
        for (int i = 0; i < ch.length; i++) {
            ch1[i]=ch[i];
        }
        String str=new String(ch1);
        return str;
    }
    public static String reverse1(String s){
        int length=s.length()-1;
        String str="";
        for(int i=length;i>=0;i--){
            str=str+s.charAt(i);
        }
        return str;
    }

    public static void main0(String[] args) {
        String s="abcd";
        String s1=reverse1(s);
        System.out.println(s1);
        String reverse = reverse(s);
        System.out.println(reverse);

    }

}
