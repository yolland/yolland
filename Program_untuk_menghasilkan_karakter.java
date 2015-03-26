/**
 * Created by Yolland on 3/25/2015.
 */
public class Program_untuk_menghasilkan_karakter {
        public static void main(String[] args) {
            System.out.printf("Program untuk menghasilkan gambar kotak menggunakan karakter # input berupa panjang dan lebar kotak....");
            int panjang=4;
            int lebar=10;
            for (int i=1;i<=lebar;i++){
                if (i%2==0){
                    System.out.print(" ");
                }
                for (int j=1;j<=panjang;j++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
        }
    }
