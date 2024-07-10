package member;

public class Member {
    private String name;
    private String id;
    private String pw;
    private int age;

    public void setInfo(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    public String showInfo() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", age=" + age +
                '}';
    }

//    public boolean isLogin(String id, String pw){
//        boolean result;
//        if(id.equals(id) && pw.equals(pw)){
//           result = true;
//        }
//        return result;
//    }
}
