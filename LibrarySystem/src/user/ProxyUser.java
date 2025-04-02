package user;

import library.Library;
import utils.ScannerSingleton;

public class ProxyUser {
    public User realuser;

    public ProxyUser(User realuser) {
        this.realuser = realuser;
    }

    public void addbook(){
        if(realuser instanceof AdminUser){
            ((AdminUser) realuser).addBook();
        }else{
            System.out.println("普通用户没有权限上架书籍");
        }
    }
    
    public static int select(){
        System.out.println("请选择要登陆的账户:\n" +
                "1,管理员账户\n"+
                "2，普通用户1（张飞）"+
                "3，普通用户2（关羽）"+
                "4，退出系统。");
        while(true){
            int n= ScannerSingleton.sc.nextInt();
            if(1<=n && n<=3){
                return n;
            }else if(n==4){
                Library.library.storeBook();
                System.out.println("正在保存并退出系统");
                System.exit(0);
            }else{
                System.out.println("输入错误，请重新输入!");
            }
        }
    }
}
