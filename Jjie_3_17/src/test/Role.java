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
        int hurt=r.nextInt(25)+1;
        int remain=role.getBlood();
        remain-=hurt;
        role.setBlood(remain<=0?0:remain);
        System.out.println(this.getName()+"攻击了"+role.getName()+",造成了"+hurt+"点伤害,"+role.getName()+"还剩下"+role.getBlood()+"点血量");
    }
}
