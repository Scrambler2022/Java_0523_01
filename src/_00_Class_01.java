public class _00_Class_01 {
    public static void main(String[] args) {



        Deck d = new Deck();//Deck 기본생성자를 호출하였다.
        //출력

        //d.c[0].kind;
//        System.out.printf("%s,%d \n",d.c[0].kind,d.c[0].number);
//        System.out.printf("%s,%d \n",d.c[51].kind,d.c[51].number);

//        System.out.println(d.c[0].kind);
//        System.out.println(d.c[0].number);
        for (int i=0; i<52; i++){
            System.out.printf("%s,%d \n",d.c[i].kind,d.c[i].number);
            // 13번째 요소마다 줄을 바꿉니다.
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
//        int a=0;
//        System.out.println(a);
//
//        int[] arr={1,2,3,4,5,};
//        for (int i=0; i<arr.length; i++) {
//            System.out.print("배열을 출력합니다.");
//            System.out.print(arr[i]);
//    }
//        int[] aa = new int[10];
//        int[] bb = new int[10];
//        int[][] cc = new int[9][9];
//        int num = 0;
//        int count =0;
//        for (int i=2; i< aa.length; i++) {
//            System.out.println((i+1)+"번째 구구비둘구단");
//            for (int j=1; j< bb.length; i++) {
//                System.out.print([i]*[j] = );
//            }//for2
//        }//for1





    }
}
