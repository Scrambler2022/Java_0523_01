public class _00_Class_02 {

    public static void main(String[] args) {
        Deck d= new Deck();//생성자를 호출하고 있다.
        //Space. Heart, Diamond, Clover//52장에 모양을 넣어 출력하시오.
        d.shuffle();
        //카드뽑기 메소드 = d.pick(번호)//d.pick(5);
        //System.out.printf("%s, %d \n", d.pick(51).kind,d.pick(51).number);
        //출력하시오
        for (int i=0; i<52; i++) {
            System.out.printf("%s,%s \n", d.c[i]);
        }//for
    }//main
}//class
