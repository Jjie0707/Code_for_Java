package test0;

public class Test {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.work();

        Tutor tutor = new Tutor();
        tutor.work();

        Maintainer maintainer = new Maintainer();
        maintainer.work();

        Buyer buyer = new Buyer();
        buyer.work();


    }
}
