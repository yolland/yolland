/**
 * Created by Yolland on 3/25/2015.
 */
public class Menampilkan_pagar_menggunakan_karakter {
        public static void main(String[] args) {
            System.out.printf("Menampilkan pagar menggunakan karakter (###) ");

            int akhir=10;

            for (int i=1;i<=akhir;i++){
                for (int j=1;j<=akhir;j++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
        }
    }

