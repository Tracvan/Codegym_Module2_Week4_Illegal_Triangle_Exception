import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài cạnh a: ");
        int a = 0;
        try{
             a = scanner.nextInt();
             scanner.nextLine();
        }
        catch (InputMismatchException e){
            scanner.nextLine();
            System.err.println("Độ dài không hợp lệ");
        }

        System.out.println("Độ dài cạnh b: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Độ dài cạnh c: ");
        int c = scanner.nextInt();
        scanner.nextLine();

        TriangleExample triangleExample = new TriangleExample();
        triangleExample.triangleCheck(a,b,c);
    }
    private void triangleCheck( int a,int b,int c) {
        try {
            if(a + b <c || a + c < b || c + b < a){
                throw new IllegalTriangleException("Độ dài 3 cạnh không hợp lệ");
            }
            int chuVi = a + b + c;
            System.out.println("Chu vi hình tam giác: " + chuVi);
        } catch (IllegalTriangleException e) {
            System.err.println("Độ dài 3 cạnh không hợp lệ");
        }
    }
}
