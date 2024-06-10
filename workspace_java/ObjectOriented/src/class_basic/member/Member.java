package class_basic.member;

public class Member {


    String name;
    String id;
    String password;
    int age;

//10.이름, 아이디, 비밀번호, 나이 4개의 변수 값을 모두 변경하는 메서드 1개
    public void setMemberInfo(String name1, String id1, String password1, int age1){
        name = name1;
        id = id1;
        password = password1;
        age = age1;
    }

    public void printMemberInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("나이 : " + age);
    }

    public void setName(String name2){
        name = name2;
    }
}
