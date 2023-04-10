public class KTP {
    private String nama, telefon;
    private String[] tgl_lhr;

    public KTP(String nama) {
        this.nama = nama;
        this.telefon = "088888888888";
        this.tgl_lhr = new String[]{"31", "12", "2012"};
    }

    public void setTelefon(String telefon) {
        if (TelefonValid(telefon)) {
            this.telefon = telefon;
            System.out.println("Pergantian No Telepon Berhasil");
        } else {
            System.out.println("Nomor Telepon tidak valid");
        }
    }

    public void setTgl_lhr(String[] tgl_lhr) {
        if (TglLhrValid(tgl_lhr)) {
            this.tgl_lhr = tgl_lhr;
            System.out.println("Pergantian Tanggal Lahir Berhasil!");
        } else {
            System.out.println("Tanggal Lahir tidak valid");
        }
    }


