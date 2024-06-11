package class_basic.member;

public class Member2_18 {
    private String name;
    private String id;
    private int password;

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setPassword(int password){
        this.password = password;
    }

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getPassword(){
        return password;
    }

    public void displayInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
    }

}
