package demowaktu;

class waktu
{
    public int Jam = 10;
    public int Menit = 40;
    public int Detik = 30;

    public int getJam()
    {
        if(Jam >0 && Jam <23)
        {
            return Jam;
        }
        else
        {
            return 0;
        }
    }
    public int getMenit()
    {
        if(Menit >0 && Menit <60)
        {
            return Menit;
        }
        else
        {
            return 0;
        }
    }
    public int getDetik()
    {
        if(Detik >0 && Detik <60)
        {
            return Detik;
        }
        else
        {
            return 0;
        }
    }
    public void cetakWaktu(){
        System.out.println("jam:"+getJam()+" Menit:"+getMenit()+ " Detik:"+getDetik());
    }
}

public class demoWaktu
{
    public static void main(String[] args)
    {
        waktu objWakTu = new waktu();
        objWakTu.cetakWaktu();
    }
}
