public class MesinATM {
    private KartuDebit kartu;

    public MesinATM(KartuDebit kartu) {
        this.kartu = kartu;
    }

    public void otentikasi(String pin) {
        if (kartu.getPin().equals(pin)) {
            System.out.println("Menu Utama");
        } else {
            System.out.println("No. PIN tidak sesuai");
        }
    }
}