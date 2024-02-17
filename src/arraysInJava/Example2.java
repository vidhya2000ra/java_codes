package arraysInJava;
import java.util.*;

public class Example2 {
    public static void main(String[]args){
        int i=0, j=0;
        int A[][]={
                {1,2,3},{4,5,6},{7,8,9}
        };
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(A[i][j]+"");
                System.out.println();
            }
        }
    }
}
