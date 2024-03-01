import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu nedir? : ");//kullanıcıdan dizi boyutu için değer al
        int diziBoy = scanner.nextInt();

        int[] number = new int[diziBoy];//define array

        for (int i = 0; i < diziBoy; i++) {//dizi boyutu kadar döndür
            System.out.print(i + 1 + ".Eleman: ");
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number); // Dizinin sıralanması
        System.out.println("Sıralama : " + Arrays.toString(number));
    }
}

