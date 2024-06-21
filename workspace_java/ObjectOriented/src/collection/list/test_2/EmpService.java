package collection.list.test_2;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class EmpService {

    private List<Emp> empList;
    private Scanner sc;

    public EmpService(){
        empList = new ArrayList<>();
        sc = new Scanner(System.in);

        Emp e1 = new Emp(1001,"kim", "개발부", "1111-1111", 200);
        Emp e2 = new Emp(1002,"lee", "개발부", "1111-2222", 300);
        Emp e3 = new Emp(1003,"park", "영업부", "2222-3333", 400);
        Emp e4 = new Emp(1004,"choi", "영업부", "2222-4444", 250);
        Emp e5 = new Emp(1005,"hong", "인사부", "3333-5555", 350);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }

    // 1번
    public void login(){
        boolean isRunning = true; //while문 반복 변수
        boolean isFind = false;

        while (isRunning){
            System.out.print("사번 : ");
            int empNo = sc.nextInt();
            System.out.print("비밀번호(연락처의 마지막 4자리) : ");
            String pw = sc.next();

            //입력한 사번과 비밀번호 일치 여부 확인
            for (Emp e : empList){
                if (e.getEmpNo() == empNo && e.getPw().equals(pw)){
                    isRunning = false; // while문 벗어남
                    System.out.println("로그인 하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");
                    isFind = true;
                }
            }
            if (!isFind){ // '!' : 부정연산자
                System.out.println("사번 혹은 비번이 일치하지 않습니다.");
            }
        }
    }

    //2번
    public void printDeptMoney(){
        System.out.print("부서명 : ");
        String dept = sc.next();

        int sum = 0;
        int cnt = 0;
        System.out.println("=="+ dept +" 월급 현황==");
        for (int i = 0; i < empList.size(); i++){
            if (empList.get(i).getDept().equals(dept)){
                System.out.println(empList.get(i));
                sum = sum + empList.get(i).getMoney();
                cnt++;
            }
        }
        System.out.println(dept + "서의 월급 총액은 " +sum + "이며, 평균 급여는 " +(sum/(double)cnt) + "원입니다."  );
    }

    //3번
    public void increaseMoney(){
        System.out.print("부서명 : ");
        String dept = sc.next();

        System.out.print("인상급여 : ");
        int money = sc.nextInt();

        System.out.println(dept + " 각 사원의 급여가 각각 " + money + "원씩 인상됩니다.");
        System.out.println("==월급 인상 후 " + dept + " 월급 현황");

        // 찾은 부서 급여 인상코드
        for (Emp e : empList){
            if (e.getDept().equals(dept)){
                int result = e.getMoney() + money; //사원의 원래 월급 + 인상급액
                e.setMoney(result);
            }
        }
        // 인상된 사원 정보 출력
        for (Emp e : empList){
            if (e.getDept().equals(dept)){
                System.out.println(e);
            }
        }

    }
}
