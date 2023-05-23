public class Deck {

    Card[] c= new Card[52]; // 4종류 * 13 =52장
    //배열에 대한 선언이다 객체선언이 아니다.

    Deck() { //기본생성자 // 실제 실행만 되고 종료가되는 존재.
        //kind = null, number=0; //space,1 space,2 space,3 clover 13;
        //space : 13,heart : 13,diamond : 13,clover : 13,
        for (int i=0; i<52; i++) {
            c[i] = new Card(); // 객체선언
            c[i].kind = c[i].shape[i/13]; // 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,...13*(i/13)+i%13
            c[i].number = (i%13)+1; // //1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,,,,,,,,
        }//for
    }//deck
    //카드뽑기
    Card pick(int index) { // 0-51
        return c[index];
    }
    void shuffle() {
        for (int i=0; i<10000;i++) {
            int random = (int) (Math.random() * 51);
            Card temp = null;
            temp = c[0];
            c[0] = c[random];
            c[random] = temp;
        }//void for
    }//void//void//void//void//void//void//void
}//class
//        for (int i=0; i<c.length;i++) { //13,26,39,52
//            c[i] = new Card();

