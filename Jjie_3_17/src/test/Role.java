package test;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(int blood, String name) {
        this.blood = blood;
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void attack(Role role){
        Random r=new Random();
        int hurt=r.nextInt();
        role.blood-=hurt;
        System.out.println(this.name+"攻击了"+role.name+",造成了"+hurt+"点伤害,"+role.name+"还剩下"+);
    }
}
