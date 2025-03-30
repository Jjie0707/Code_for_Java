package test1;

public class NomalUser extends User{

    public NomalUser(String name, String id) {
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

    public void borrowBook(String bookName){
        System.out.println(this.getName()+"借走了"+bookName);
    }
}
