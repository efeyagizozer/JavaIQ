package JavaInterviewQuestions.JavaCodeIQ.numericIQ;

public class IQ02_BinaryRepresentationOfN {


    public static void main(String[] args) {
        //System.out.println(binaryOfN(6));


        System.out.println(value(7));




        ////////////Cozum Aciklama\\\\\\\\\\\\\\\\\

        /*
         burda Stringe ekledigimiz n % 2 + StrBinary kismidna n % 2  bu kisim bir integer yani sayi degeri degil S
         tring degeri ilarka geliyor ama  n % 2 + StrBinary burada her ne kadar sayi oalrak gouksede bir toplama isleme degil
         ekleme islemi olarak kullalniliyor yani burda n%2 =1 oldugunda ve Str biunaty 1 oldugunda sonuv 2 degil 11 oluyor

         */

        /*

         Matematiksel Yöntem
Verilen sayıyı 2'ye bölerek kalanı alırsınız.
Bölüm 0 olana kadar bu işlemi tekrar edersiniz.
Kalanları ters sırayla yazdığınızda, ikili sayıyı elde edersiniz.
Örnek:

Sayımız: 13

13 ÷ 2 = 6, kalan = 1
6 ÷ 2 = 3, kalan = 0
3 ÷ 2 = 1, kalan = 1
1 ÷ 2 = 0, kalan = 1
Ters sırayla: 1101

Sonuç: 13 (10'luk sistem) = 1101 (2'lik sistem)
         */

    }

public static int value(int number){

        String binaryRep="";

        while(number>0) {

            binaryRep = number % 2 + binaryRep;
            number /= 2;

            // bunun sebebi biz elimizde remainder kalan her bir sayi aslinda string karakteri olarak degerlerini
            // toplamiyoruz dizi olarak diziye ekliyoruz
            // yani 1 den sonra geeln 1 11 seklinde gozukecek 2 degil

        }
        return binaryRep.replace("0", "").length();




        }


        /*
        Evet, bir sayının binary değeri, 2'ye bölümlerinden kalanların bir araya getirilmesiyle oluşur.
        Bu süreç, binary sistemin temelini oluşturur. Ancak burada dikkat edilmesi gereken nokta,
        2'ye bölümlerden kalanların sırasıdır: Kalanlar en sağdan başlayarak (en az anlamlı basamaktan) sıralanır.

Nasıl Çalışır?
Bir sayıyı binary'ye dönüştürmek için şunu yaparız:

Sayıyı 2'ye böleriz ve kalanı not ederiz. (Bu kalan, binary temsilindeki en sağdaki basamağı oluşturur.)
Sayıyı 2'ye bölmeye devam ederiz ve her seferinde yeni bir kalan buluruz.
Bu kalanları ters sırayla bir araya getiririz, çünkü en son kalan en soldaki binary basamağını ifade eder.
         */


    }

  /*  public static int binaryOfN(int n){ // 6 -> 3 -> 1 -> 0


        String StrBinary = ""; // 0 -> 10 -> 110

        while(n > 0){
            StrBinary = n % 2 + StrBinary;
            n /= 2;
        }

        return StrBinary.replace("0", "").length();
    }*/


    /*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */

