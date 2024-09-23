import java.util.*;
public class matrixsum {
    public static void main(String args[]){
    System.out.println("Enter row and column: ");
    Scanner g= new Scanner(System.in);
    int r = g.nextInt();
    int c =g.nextInt();
    int mat1[][]=new int[r][c];
    int i,j;
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            mat1[i][j]=g.nextInt();
        }
    }
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            System.out.print(mat1[i][j]+" ");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
    int mat2[][]=new int[r][c];
    System.out.println("Enter the elements of matrix 2:");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            mat2[i][j] =g.nextInt(); 
        }
    }
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            System.out.print(mat2[i][j]+" ");
        }
        System.out.print("\n");
    }
    int sum[][]=new int[r][c];
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            sum[i][j]=mat1[i][j]+mat2[i][j];

        }
    }
    System.out.println("the sum of matrix is: ");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.print("\n");
    }

    
    }
}
