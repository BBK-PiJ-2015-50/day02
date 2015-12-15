/**
 * Created by chris on 12/14/15.
 * Originally a Day 2 Groovy question
 * Now redone in Java (trying out Intellij)
 */
public class NumberPyramid {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
