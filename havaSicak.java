/* 
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

ÖDEV
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/

package Java.ikinciKonu.egzersizler;

import java.util.Scanner;

public class havaSicak {
    public static void main(String[] args){
        int sicaklik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sıcaklık derecesi giriniz: ");
        sicaklik = scan.nextInt();

        if (sicaklik <= 5){

            System.out.print("Kayak yapmak için uygun bir hava.");

        }

        else if (sicaklik >= 5 && sicaklik <= 15){

            System.out.print("Sinema'ya gidebilirsiniz.");

        }

        else if (sicaklik >= 15 && sicaklik <= 25){

            System.out.print("Piknik yapmak için harika bir hava.");

        }

        else{

            System.out.print("Yüzmeye gidebilirsiniz.");

        }





    }
}
