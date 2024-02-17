package arraysInJava;

public class Example4 {
    public static void main(String[]args){
        int i=0,j=0;
        int A[][]={{33,55,66},{44,88,10},{50,90,20}
        };
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(A[i][j]+"Enter a value");
                System.out.println();
            }
        }
    }
}
