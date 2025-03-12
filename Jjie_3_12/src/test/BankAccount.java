package test;
//5. 设计BankAccount类，包含账号、余额属性，实现存款(deposit)和取款(withdraw)方法
public class BankAccount {
    public double surplus;
    public String account;

    public void deposit(float a){
        this.surplus+=a;
    }
    public void withdraw(float a){
        this.surplus-=a;
    }
}
