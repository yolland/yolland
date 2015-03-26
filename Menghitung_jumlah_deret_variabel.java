/**
 * Created by Yolland on 3/25/2015.
 */
public class Menghitung_jumlah_deret_variabel {
        public static void main(String[] args) {
            System.out.printf("Menghitung jumlah deret variabel pertama dan terakhir : ");
            int batas=10;
            int ang=1;
            System.out.print("Angka yang muncul akan di batasi "+ang+" sampai "+batas+" : ");
            for (;ang<=batas;ang++){
                System.out.print(ang);
                if (ang<batas) {
                    System.out.print(",");
                }
            }
        }
    }
