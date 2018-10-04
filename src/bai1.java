import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        float width,height,S;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập giá trị chiều dài ");
        width=sc.nextFloat();
        System.out.println("nhập giá trị chiều rộng");
        height= sc.nextFloat();
        S=width*height;
        System.out.println("diện tích  :" + S);

    }
}
