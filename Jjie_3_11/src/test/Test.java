package test;

import java.util.Scanner;

public class Test {

    public static void main1(String[] args) {
        Derived d=new Derived();
        d.method();
        System.out.println(d.a);
        System.out.println(d.b);

    }
    public static void main0(String[] args) {
//        System.out.println(Student.name);
//        Student s1=new Student();
//        System.out.println(s1.age);
//        System.out.println(s1.name);
//        System.out.println(Student.name);
        Student s1=new Student();
        s1.name="Jjie";
        s1.age=18;
        s1.method();

        s1.eat();
    }


        public static void main2(String[] args) {
            Scanner scanner = new Scanner(System.in);

                int x = scanner.nextInt();
                int y = scanner.nextInt();
                Data data = new Data(x, y);
                System.out.println(data.getX() + data.getY());
        }
    static class Data {

        private int x;
        private int y;

        private Data(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int getX() {
            return x;
        }

        private int getY() {
            return y;
        }

    }
    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }
}

