package test;

public class Derived extends Base{
    int a; // 与⽗类中成员a同名，且类型相同
    String b; // 与⽗类中成员b同名，但类型不同

    public void method() {
        a = 100; // 访问⽗类继承的a，还是⼦类⾃⼰新增的a？
                 // 访问⽗类继承的b，还是⼦类⾃⼰新增的b?
//        c = 102; // ⼦类没有c，访问的肯定是从⽗类继承下来的c
//        d = 103; // 编译失败，因为⽗类和⼦类都没有定义成员变量b
    }
}
