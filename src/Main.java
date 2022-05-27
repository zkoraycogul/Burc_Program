import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month,day;
        System.out.print("Doğduğunuz ay : ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = inp.nextInt();

        System.out.println(   month == 3  &&  day>20   || month == 4  &&  day<20 ? "Koç Burcu"     :
                              month == 4  &&  day>20   || month == 5  &&  day<21 ? "Boğa Burcu"    :
                              month == 5  &&  day>21   || month == 6  &&  day<22 ? "İkizler Burcu" :
                              month == 6  &&  day>22   || month == 7  &&  day<22 ? "Yengeç Burcu"  :
                              month == 7  &&  day>22   || month == 8  &&  day<22 ? "Aslan Burcu"   :
                              month == 8  &&  day>22   || month == 9  &&  day<22 ? "Basak Burcu"   :
                              month == 9  &&  day>22   || month == 10 &&  day<22 ? "Terazi Burcu"  :
                              month == 10 &&  day>22   || month == 11 &&  day<21 ? "Akrep Burcu"   :
                              month == 11 &&  day>21   || month == 12 &&  day<21 ? "Yay Burcu"     :
                              month == 12 &&  day>21   || month == 1  &&  day<21 ? "Oğlak Burcu"   :
                              month == 1  &&  day>21   || month == 2  &&  day<19 ? "Kova Burcu"    : "Balık Burcu");

    }
}
