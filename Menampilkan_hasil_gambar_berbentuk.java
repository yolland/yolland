/**
 * Created by Yolland on 3/25/2015.
 */
public class Menampilkan_hasil_gambar_berbentuk {
        public static void main(String[] args) {
            System.out.printf("Program untuk menghasilkan gambar kotak menggunakan karakter (#####) ");
            int panjang=9;

            for (int i=1;i<=panjang;i++){
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
