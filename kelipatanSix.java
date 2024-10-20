import java.util.Scanner;
public class kelipatanSix {
    public static void main (String []args) {
        int bilanganAwal=6;
        int bilanganAkhir=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan awal");
        bilanganAwal=input.nextInt();
        System.out.println("Masukkah bilangan akhir");
        bilanganAkhir=input.nextInt();
        

        while (bilanganAwal<=bilanganAkhir) {
            System.out.println(bilanganAwal+",");
            bilanganAwal+=6;
        }
        }

    }