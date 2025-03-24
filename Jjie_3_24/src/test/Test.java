package test;

public class Test {
    public static void main(String[] args) {
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
