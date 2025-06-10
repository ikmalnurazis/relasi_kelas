public class KartuDebit {
    private String noKartu;
    private String namaPemilik;
    private String pin;

    public KartuDebit(String noKartu, String namaPemilik, String pin) {
        this.noKartu = noKartu;
        this.namaPemilik = namaPemilik;
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNoKartu() {
        return noKartu;
    }
}