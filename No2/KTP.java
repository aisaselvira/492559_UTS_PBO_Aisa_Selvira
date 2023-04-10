package No2;

import No1.Subject;

public class KTP {
    private double[] no_telp ;
    private String[] tgl_lahir;
    private String name;

    public KTP(String name) {
        this.name = name;
    }

    public void setNo_telp(double no_telp){
        no_telp = new double[12];
        this.no_telp = no_telp;
    }



    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

}















//public class Website{
//    private int index = 0;
//    private String[] usernames;
//    private String[] passwords;
//
//    public Website() {
//        this.usernames = new String[99];
//        this.passwords = new String[99];
//    }
//
//    public void addAccount(Account A){
//        Boolean istrue = true;
//        for(int i = 0; i<index; i++) {
//            if (A.getUsername() == usernames[i]){
//                istrue = false;
//            }
//        }
//        if(istrue == true){
//            usernames[index] = A.getUsername();
//            passwords[index] = A.getPassword();
//            index+=1;
//            System.out.println("akun berhasil di tambahkan");
//        }else{
//            System.out.println("mohon maaf username telah di gunakan");
//        }
//    }
//
//    public void login(String username, String password){
//        for(int i = 0; i<index; i++) {
//            if (username == usernames[i] && password == passwords[i]) {
//                System.out.println("Login berhasil");
//            }else{
//                System.out.println("akun tidak di temukan");
//            }
//        }
//    }
////        public void encrypt(String n){
////        String tmp
////            System.out.println();
//
//}
