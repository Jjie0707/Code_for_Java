package test;

public class Test {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1);
        System.out.println(s2);

        String s3=new String("abc");
        System.out.println(s3);

        char[] ch={'a','b','c'};
        String s4=new String(ch);
        System.out.println(s4);

        byte[] ch1={97,98,99};
        String s5=new String(ch1);
        System.out.println(s5);
    }
    public static void main0(String[] args) {
        System.out.println("Before");
        int[] arr= {1, 2, 3};
        try{
            arr=null;
            System.out.println(arr[100]);
            System.out.println("After");
        }catch (IndexOutOfBoundsException e){
            System.out.println("in");
        }catch(NullPointerException e){
            System.out.println("Null");
        }finally{
            System.out.println("123");
        }
        System.out.println("nice");
    }
}
