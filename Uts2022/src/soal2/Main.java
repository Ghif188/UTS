package soal2;

public class Main {
    public static void main(String[] args){
        Website website = new Website();
        Account a = website.addAccount("Ghifari", "hji");
        Account b = website.addAccount("Ghifari", "gila");
        System.out.println(a);
        System.out.println(b);
        website.login("Ghifari", "klo");
        website.login("Ghifari", "hji");
    }
}
