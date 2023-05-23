import java.util.Scanner;
public class StuMain {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Student title = new Student();
        StuMain stuMain = new StuMain();
        String searchName= ""; //학생이름검색
        int count = 0;//학생수
        String name = "";
        int choice =0;
        int kor=0,eng=0,math=0;
        Student[] s= new Student[5]; //배열선언 주소저장공간생성
        //s[0] = new Student();//객체선언
        while(true) {
            System.out.println("[ 학생성적 처리 프로그램] 1.성적입력 2.성적출력 0.프로그램 종료");
            System.out.println("---------------");
            System.out.println("원하는 번호를 입력하세요");
            choice = scan.nextInt();
            if (choice==0) {
                System.out.println("프로그램 종료합니다");
                System.out.println();
                break;
            }//if
            switch (choice) {
                case 1:
                    count = stuMain.stuInput(count,s); // 메소드 분리
                            break;//switch
                case 2://성적출력
                    stuOutput(count,s);
                    break;
                case 3://성적수정
                    System.out.println("수정할 학생 이름");
                    searchName = scan.next();
                    for (int i= 0; i<count; i++) {
                        if (s[i].getName().equals(searchName)) {// 이퀄스는 오브젝트꺼
                            System.out.println("[ 학생이 검색 되었다. ] \n 수정과를 마시겠나요?\n 1.국어 2.영어 3.수학");
                            System.out.println("---------------------------");
                            System.out.println("번호입력하세요");
                            choice = scan.nextInt();
                        }
                    }
//                        System.out.println("국어점수를 입력하세요");
//                        kor = scan.nextInt();
//                        System.out.println("영어점수를 입력하세요");
//                        eng = scan.nextInt();
//                        System.out.println("수학점수를 입력하세요");
//                        math = scan.nextInt();
//                        s[i] = new Student(name,kor,eng,math);
//                        count++;
                // }//for1//for1//for1//for1//for1//for1//for1
            }//switch//switch//switch//switch//switch//switch//switch
        }//while//while//while//while//while//while//while//while//while
    }//main
    // case2 : 학생성적출력
                        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
    Student.title[0],Student.title[1],Student.title[2], Student.title[3],
    Student.title[4],Student.title[5], Student.title[6],Student.title[7]);
                    System.out.println("-----------------------------------");
                    for (int i=0; i<count; i++) {
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
                s[i].getStuNo(),s[i].getName(),s[i].getKor(),
                s[i].getEng(),s[i].getMath(),
                s[i].getTotal(),s[i].getAvg(),
                s[i].getRank());
    }
    static void stuOutput (int count,Student[]);
    //다른 메소드 선언 - 리턴타입 메소드명(매개변수) {   }
    static int stuInput(int count, Student[] s){
        //학생입력
        int kor=0,eng=0,math=0;
        String name="";

        for (int i=count; i< s.length; i++) {
            System.out.println((i + 1) + "번째 이름을 입력하세요.(0.이전페이지 이동)");
            name = scan.next();
            //이전페이지 이동 확인
            if (name.equals("0")) {
                System.out.println("이전페이지로 이동합니다.");
                break;
            }
            System.out.println("국어점수를 입력하세요");
                        kor = scan.nextInt();
                        System.out.println("영어점수를 입력하세요");
                        eng = scan.nextInt();
                        System.out.println("수학점수를 입력하세요");
                        math = scan.nextInt();
                        s[i] = new Student(name,kor,eng,math);
                        count++;
        }
        return count;
    }
}//class