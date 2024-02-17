package arraysInJava;

public class Example3 {
    public static void main(String[]args){
        int i=0, j=0;
        int A[][]={
                {2,4,6},{5,3,2},{7,8,9}
        };
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
            System.out.print(A[i][j]+"");
            System.out.println();
            }
        }
    }
}
