/**
 * Created by Yolland on 3/25/2015.
 */
public class Menghitung_jumlah_deret_angka_pertama_akhir {
        public static void main(String[] args) {
            System.out.printf("Menghitung jumlah deret angka pertama sampai akhir 1 sampai 10:55");
            int batas=40;
            int jumlah=0;
            int awal=1;
            System.out.print(" jumlah angka dari "+awal+" sampai "+batas+" : ");
            for (;awal<=batas;awal++){
                jumlah = jumlah + awal;
            }
            System.out.println(jumlah);
        }
    }

