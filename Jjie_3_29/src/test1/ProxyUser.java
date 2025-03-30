package test1;

public class ProxyUser {
    private User realuser;

    public ProxyUser(User realuser) {
        this.realuser = realuser;
    }

    public User getRealuser() {
        return realuser;
    }

    public void addBook(String bookName){
        if(this.realuser instanceof AdminUser){
            //此处要进行向下转型
            ((AdminUser) this.realuser).addBook(bookName);
        }else{
            System.out.println("当前用户无此权限！切换管理员帐号操作。");
        }
    }
    public void borrowBook(String bookName){
        if(this.realuser instanceof NomalUser){
            ((NomalUser) this.realuser).borrowBook(bookName);
        }else{
            System.out.println("权限限制。请切换普通用户帐号操作。");
        }
    }
}
