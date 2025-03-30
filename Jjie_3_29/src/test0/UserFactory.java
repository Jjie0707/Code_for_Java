package test0;

public class UserFactory {
    public UserFactory() {
    }

    public User buildUser(String name,String id){
        User user=new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
}
