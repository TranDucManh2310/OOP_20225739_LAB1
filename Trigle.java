import java.util.Scanner;
public class Trigle{
public static void main(String[] args){
    Scanner a= new Scanner(System.in);
    System.out.print("Nhap n: ");
    a.close();
    int n=a.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    System.exit(0);
}
}