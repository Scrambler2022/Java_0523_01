public class Time {
    private int hour;//참조변수명.변수명
    private int minute;
    private int second;
    Time() {}//기본생성자
    Time(int hour,int minute, int second) {
        this.hour = hour; // this - 인스턴스 변수
        this.minute = minute;
        this.second = second;
    }//time
    public int getHour() {//hour 의 변수값을 읽어오는 메소드
        return hour;
    }
    public void setHour(int hour) {//hour의 변수값을 저장하는 메소드
        if (hour<0 || hour > 23) {
            System.out.println("잘못 누르셨습니다.");
            return;
        }
        this.hour = hour;
    }
}//class
