import java.io.IOException;

public class No11654 {
    public static void main(String[] args) throws IOException{
        int a = System.in.read();
        System.out.println(a);
    }
}
//반드시 예외처리를 해야함. IOException 혹은 Exception 으로 처리
//System.in 은 byte 값으로 문자 하나를 읽으며 해당 문자에 대응하는 아스키코드 값을 저장