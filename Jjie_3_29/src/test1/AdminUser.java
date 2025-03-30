package test1;

public class AdminUser extends User{
    public AdminUser(String name, String id) {
        super(name, id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }
    public void addBook(String bookName){
        System.out.println(this.getName()+"在书架中上架了"+bookName);
    }
}
