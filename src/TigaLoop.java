import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println("===== SATU DERET, TIGA LOOP =====");
        System.out.print("For     :");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("While     : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        System.out.print("do-while : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();
        int kurang = 0;
        for (int i = 1; i < n; i++){
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++){
            kurangSama++;
        }
        System.out.println("i < n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");
        System.out.print("Disaring : ");
        int hitungPrintln = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0) continue;
            if (i > 7)break;
            System.out.print(i + " ");
            hitungPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println : " + hitungPrintln + " kali");
        System.out.print("\nBatas deter (n) : ");
        int n2 = input.nextInt();

        System.out.println("===== SATU DERET, TIGA LOOP =====");
        System.out.print("for        : ");
        for (int i = 1; i <= n2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print ("while     : ");
        int j2 = 1;
        while (j2 <= n2) {
            System.out.print(j2 + " ");
            j2++;
        }
        System.out.println();
        System.out.print("do - while  : ");
        int k2 = 1;
        do {
            System.out.print(k2 + " ");
            k2++;
        } while (k2 <= n2);
        System.out.println();

        input.close();




    }
}