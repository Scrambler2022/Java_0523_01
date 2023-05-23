import java.util.Scanner;
public class _00_Class_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //상수는 대문자로 사용한다 ex) final을 참고할것
        Card c= new Card("Space",1);
        Card c2= null;
        Deck d1 = new Deck();
        //c2= d1; // 타입이 다르기에 넣을 수 없다.
        int a= 5;
        String str= null;
        Object o=null;
        o= d1;// 조상과 자손이라는 관계가 맺어져서 가능함.
        c2= c; // 같은 타입이면 넣을 수 있음
        System.out.println(c);
//        for (int i=0; i<52; i++) {
//            System.out.println((13*(i/13)));
//        }
        int num =5;
        num=10;
        final int number=1;

    }//main
    static void add() {
        //오버로딩은 똑같이 사용하여야 한다.
    }
    static void add(int x) { //오버로딩 : 다른메소드가 됨.
        //우리는 잘 사용하지 않는다.
    }
}//class
//자식클래스를 상속받을 경우 그위에 부모클래스의 설정값들이 전부 들어오고
//거기에 누적하여 오버라이드 하여 클래스를 사용할 수 있다.
