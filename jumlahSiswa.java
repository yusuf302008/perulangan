import java.util.Scanner;
public class jumlahSiswa {
    public static void main(String[] args){
    int jumlahSiswa;
    int nilaiSiswa;
    int absensiSiswa;
    double totalSemuaNilai=0;
    double rata_rataSiswa;

    Scanner s = new Scanner(System.in);
    System.out.println("Jumlah Siswa");
    jumlahSiswa=s.nextInt();
    System.out.println("");
    for(absensiSiswa=1; absensiSiswa<=jumlahSiswa;absensiSiswa++){
        System.out.println("masukkan nilai ke-"+ absensiSiswa +",");
        nilaiSiswa = s.nextInt();
        totalSemuaNilai += nilaiSiswa;
    }
    System.out.println("");
    rata_rataSiswa = totalSemuaNilai/jumlahSiswa;
    System.out.println("rata rata nilai"+jumlahSiswa+"siswa"+rata_rataSiswa);

    }
    
    


    
}