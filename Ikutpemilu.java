import java.util.Scanner;

public class Ikutpemilu {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Umur");
    int umur = input.nextInt();
    if (umur >= 17){
        System.out.println("Boleh Mengikuti Pemilu");
    }
    else{
        System.out.println("Bocil Gk diajak");
    }
}
}
