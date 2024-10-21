package src.ch11.sec04;

public class ErrExam {

    public static void main(String[] args) {

        try {
            int value = Integer.parseInt("1oo");    //에러
        }catch (NumberFormatException e) {
            System.out.println("에러 확인");
            System.err.println("[에러 내용]");          //에러 부터 먼저 표시 된다.
            System.err.println(e.getMessage());
        }
    }
}
