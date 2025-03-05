package demowaktu;
import java.util.Scanner;
class status_banjir
{
    public void check_status()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi banjir: ");
        int tinggi_banjir = scanner.nextInt();
        scanner.close();

        System.out.println("program status banjir");
        if(tinggi_banjir>=0&&tinggi_banjir<=25)
        {
            System.out.println("aman");
        }
        else if(tinggi_banjir>=26&&tinggi_banjir<=50)
        {
            System.out.println("siaga 1");
        }
        else if(tinggi_banjir>=51&&tinggi_banjir<=100)
        {
            System.out.println("awas");
        }
    }
}
public class demoBanjir {
    public static void main(String[] args) {
        status_banjir objaku = new status_banjir();
        objaku.check_status();
    }
}
