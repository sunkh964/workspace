package test.Test2;

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

    public boolean isLogin(String id, String pw){
        boolean result;
        if(id.equals("java") && pw.equals("abcd1234")){
           result = true;
            System.out.println("로그인 가능");
        }
        else {
            result = false;
            System.out.println("로그인 불가능");
        }
        return result;
    }
}
