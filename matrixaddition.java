import java.util.Scanner;
class matrixaddition{
    public static void main (String args[]){
    int row,col;
        Scanner reader =new Scanner(System.in);
        System.out.print("enter the value of rows and columns :");
        row =reader.nextInt();
        col=reader.nextInt();
        int a[][] = new int [row][col];
        System.out.println("enter the elements of first matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=reader.nextInt();
                
            }
        }
        int b[][] = new int [row][col];
        System.out.println("enter the elements of second matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=reader.nextInt();
            }
        }
        int c[][] = new int [row][col];
        System.out.println("enter the elements of first matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        System.out.println("sum of matrixes :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(+c[i][j] + "  ");
            }
        System.out.println(" ");
        
        }
    }
}
