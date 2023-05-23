public class Student {
    private String[] title = {"이름", "국어", "영어", "수학", "총점", "평균", "등급"};
    static int count=1000;//클래스변수
    private int stuNo;// 20231010001
    private String name;
    private int kor ;
    private int eng;
    private int math;
    private int total;
    private double avg;
    int rank;
    {
        //초기화블럭 //count 넘버는 디비에서 사용된다.
        ++count; // 1001
        //stuNo = "2023101" + String.format("%04d",count); // 2023 101 1001
        stuNo = count;
    }
     // 기본생성자
    public Student() {}
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total=kor+eng+math;
        this.avg = this.total/3.0;
    }
//읽어오기
    public int getStuNo() {
        return stuNo;
    }
    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getAvg() {
        return avg;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}//class