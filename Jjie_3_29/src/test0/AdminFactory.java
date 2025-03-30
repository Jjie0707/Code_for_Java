package test0;

public class AdminFactory {

    public AdminFactory() {
    }

    public Admin buildAdmin(String name,String id){
        Admin admin=new Admin();
        admin.setId(id);
        admin.setName(name);
        return admin;
    }
}
