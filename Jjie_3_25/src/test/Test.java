package test;

public class Test {
    public static void main2(String[] args) {
        StringBuffer s=new StringBuffer("heorld");
        s.insert(2,"llo w");
        s.append("!");
        String s1=s.toString();
        System.out.println(s1);
        String s2=String.format("%s","hello world");
        System.out.println(s2);
    }
    public static void main1(String[] args) {
        String[] arr="123/456/789/123".split("/",3);
        for(String x:arr){
            System.out.print(x+"  ");
        }
    }
    public static void func(){
        int[] arr={1,2,3};
        try{
            arr=null;
            System.out.println(arr[100]);
            System.out.println(111);
        }catch(IndexOutOfBoundsException e){
            System.out.println(444);

        }catch(NullPointerException e){
            System.out.println(777);
        }catch(RuntimeException e){
            System. out.println(888);
        }finally{
            System.out.println("结束了");
        }
        System.out.println(666);
    }
    public static void main0(String[] args) {
        func();
    }
}
