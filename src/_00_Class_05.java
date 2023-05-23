public class _00_Class_05 {
    public static void main(String[] args) {
        //12시 50분 52초를 입력하고
        System.out.println("시간을 입력하세요");
        Time t = new Time(12,50,52);
        System.out.println(t.getHour());
        //12시를 출력하시오.
        System.out.println("딩동댕");
        t.setHour(22);
        System.out.println(t.getHour());

    }//main
}//class
