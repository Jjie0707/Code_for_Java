package user;

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

}
