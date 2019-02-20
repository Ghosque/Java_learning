package small_project;
import java.math.*;
import java.util.Scanner;

// 判断是否为回文字符串
public class PalindromeJudge {
    public String getContent(){
        System.out.print("请输入一串字符串：");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static void main(String[] args){
        PalindromeJudge pj = new PalindromeJudge();
        String content = pj.getContent();

        int len = content.length();
        if (len % 2 == 0){
            Boolean sameOrNot = true;
            for (int i=0; i<len/2-1; i++){
                char head = content.charAt(i);
                char tail = content.charAt(len-1-i);
                if (head != tail) {
                    System.out.println("该字符串不是回文字符串");
                    sameOrNot = false;
                    break;
                }
            }
            if (sameOrNot == true){
                System.out.println("该字符串是回文字符串");
            }
        }
        else {
            Boolean sameOrNot = true;
            for (int i=0; i<Math.floor(len/2)-1; i++){
                char head = content.charAt(i);
                char tail = content.charAt(len-1-i);
                if (head != tail) {
                    System.out.println("该字符串不是回文字符串");
                    sameOrNot = false;
                    break;
                }
            }
            if (sameOrNot == true){
                System.out.println("该字符串是回文字符串");
            }
        }
    }
}
