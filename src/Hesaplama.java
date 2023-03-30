import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Yıl Giriniz:");
        age = input.nextInt();
        if (age % 100 == 0) {
            if (age%400==0){
                System.out.println(age + "Bir Artık Yıldır.");
            }else{
                System.out.println(age + "Bir Artık Yıl Değildir");
            }
        }else {
            if (age%4==0){
                System.out.println(age+ "Bir Artık Yıldır.");
            }else{
                System.out.println(age + "Bir Artık Yıl Değildir.");
            }
        }

    }
}
