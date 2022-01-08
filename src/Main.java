import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy;
        double kg;
        double vucutKitleIndeksi;
        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : " );
        boy=input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : " );
        kg=input.nextDouble();

        vucutKitleIndeksi= kg / (boy*boy);
        System.out.print("Vucut kitle indeksiniz : " +vucutKitleIndeksi);




    }
}
