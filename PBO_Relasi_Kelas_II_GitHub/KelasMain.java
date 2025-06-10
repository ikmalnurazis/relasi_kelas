import java.util.Scanner;

public class KelasMain {
    public static void main(String[] args) {
        KartuDebit kartu = new KartuDebit("123456789", "Budi", "123");
        MesinATM atm = new MesinATM(kartu);

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan PIN: ");
        String pin = input.nextLine();

        atm.otentikasi(pin);
    }
}