package multiplication_label;

public class MutiplicationLabel {
    public static void main(String[] args){
        for(int x=1; x<=9; x++){
            for(int y=1; y<=x; y++){
                int sum = x * y;
                String fs = String.format("%d * %d = %d", y, x, sum);
                System.out.print(fs + '\t');
            }
            System.out.print('\n');
        }
    }
}
