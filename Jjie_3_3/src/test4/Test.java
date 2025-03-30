package test4;

public class Test {
    public static void main(String[] args){
        String s1 = "4816";
        String s2 = "77";
        int n1=0;
        int n2=0;
        for (int i = 0; i < s1.length(); i++) {
            n1*=10;
            n1+=(s1.charAt(i)-48);
        }
        for (int i = 0; i < s2.length(); i++) {
            n2*=10;
            n2+=(s2.charAt(i)-48);
        }
        System.out.println(s1);
        System.out.println(s2);
        int n3=n1*n2;
        StringBuilder sb=new StringBuilder("");
        while(n3>0){
            char c=(char)(n3%10+48);
            sb.append(c);
            n3/=10;
        }
        sb.reverse();
        String s3=sb.toString();
        System.out.println(s3);
    }

}
