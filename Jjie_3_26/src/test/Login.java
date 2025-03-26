package test;

public class Login {
    private String name="Jjie0707";
    private String password="20060822";

    public void logIn(String name,String password) throws NameErrorException,PasswordErrorException{
        if(!this.name.equals(name)){
            throw new NameErrorException("帐号错误，登录失败");
        }else if(!this.password.equals(password)){
            throw new PasswordErrorException("密码错误，登录失败");
        }
        System.out.println("登录成功");
    }
}
