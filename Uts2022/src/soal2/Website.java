package soal2;

public class Website {
    private int index = 0;
    private String [] usernames = new String[99];
    private String [] password = new String[99];

    public Website() {
    }
    public Account addAccount(String username, String password){
        boolean isNama = false;
        for (int i = 0; i < index; i++) {
            if (this.usernames[i] == username){
                isNama = true;
            }
        }
        if (isNama == false) {
            this.usernames[index] = username;
            this.password[index] = password;
            index += 1;
            System.out.println("Akun Berhasil Dibuat!");
            return new Account(username, password);
        } else {
            System.out.println("Mohon Maaf Username Telah Digunakan");
            return new Account();
        }
    }
    public void login(String username, String password){
        boolean isAccount = false;
        for (int i = 0; i < index; i++) {
            if (this.usernames[i] == username && this.password[i] == password){
                isAccount = true;
            }
        }
        if (isAccount == true){
            System.out.println("Anda Berhasil Login!");
        } else {
            System.out.println("Akun Tidak Ditemukan");
        }
    }
}
