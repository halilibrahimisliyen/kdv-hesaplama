import java.util.Scanner;
public class kdv{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        /*Uygulamada kullanıcıdan istenen verinin tam sayımı yoksa küsüratlı bir sayı mı olduğu bilinemeyeceği için iki durumu da kapsayan double veri tipi kullanılacaktır */
        double a;
        System.out.println("Lütfen ürünün fiyatını giriniz:  ");
        a=input.nextDouble(); // kullanıcıdan veri bu aşamada alınır
        double b; // kdvli fiyat için yeni bir değişken
        b=a+a*18/100; //ürünün kdv'siz fiyatını kdv oranı ile çarpar ve yine kendisiyle toplarız
        double c=a*18/100; // sadece çarpım yapıldığında kdv ortaya çıkar
        System.out.println("Ürünün KDV'siz fiyatı: "+a);//string tipi değişlenlerde + ile metinler birleştirilebilir
        System.out.println("Ürünün KDV'li fiyatı: "+b);
        System.out.println("Ürünün KDV fiyatı:  "+c);




    }
}