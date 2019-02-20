package small_project;
import java.util.Scanner;

// 判断是否为水仙花数
public class NarcissisticNumber {
    public String getNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public boolean isNumeric(String s) {
        if (s != null && !"".equals(s.trim()))
            return s.matches("^[0-9]*$");
        else
            return false;
    }

    public static void main(String[] args){
        NarcissisticNumber nn = new NarcissisticNumber();
        String number = nn.getNumber();

        Boolean onlyNumOrNot = nn.isNumeric(number);
        if (onlyNumOrNot == true){
            int len = number.length();
            int sum = 0;
            for (int i=0; i<len; i++){
                char temp = number.charAt(i);
                int tempNum = temp - '0';
                sum += Math.pow(tempNum, 3);
            }
            int intNumber = Integer.parseInt(number);
            if (intNumber == sum){
                System.out.println("该数字为水仙花数。");
            }
            else {
                System.out.println("该数字不是水仙花数。");
            }
        }
        else {
            System.out.println("该字符串包含了除数字以外的其他字符类型。");
        }
    }
}
