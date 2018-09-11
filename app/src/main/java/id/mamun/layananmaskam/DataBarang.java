package id.mamun.layananmaskam;

import java.util.ArrayList;

public class DataBarang {
    public static String[][] data = new String[][]{
            {
                "Proyektor",
                "1",
                "2",
                "@drawable/proyektor_ico.xml",
                "@drawable/proyektor.png",
                "5000",
                "Fungsi proyektor adalah untuk menampilkan video, gambar, atau data dari komputer pada sebuah layar atau sesuatu dengan permukaan datar seperti infocus atau dinding. Dibandingkan dengan media yang lain seperti Plasma atau LCD Display, projector memiliki beberapa kelebihan seperti, dapat membuat tampilan yang sangat besar, dapat di bawa dengan mudah serta fleksibilitas yang tinggi."
            },
            {
                "Hijab",
                "2",
                "4",
                "@drawable/proyektor_ico.xml",
                "@drawable/hijab.png",
                "7000",
                "Istilah lain dari hijab adalah tabir pembatas. Fungsi dari hijab adalah sebagai dinding antara jama'ah laki-laki dan perempuan berupa kain setinggi dada orang dewasa atau lebih."
            },
            {
                "Handy Cam",
                "0",
                "1",
                "@drawable/handycam_ico.xml",
                "@drawable/handycam.png",
                "15000",
                "Handycam dirancang khusus untuk merekam video, seingga dari bentuk desainnya lebih mantap untuk merekam video dan hasilnyapun lebih stabil. Namun  ketika digunakan mengambil foto agak kurang nyaman."
            },
            {
                "Kamera DSRL",
                "1",
                "2",
                "@drawable/camera_ico.xml",
                "@drawable/camera.png",
                "15000",
                "Fungsi Kamera secara umum adalah untuk membuat atau menangkap suatu gambar dari objek, yang selanjutnya akan dibiaskan melalui lensa pada sensor CCD dan sensor BSI-CMOS kemudian direkam dan sisimpan dalam format digital."
            },
            {
                "Sound System",
                "1",
                "1",
                "@drawable/soundsystem_ico.xml",
                "@drawable/soundsystem.png",
                "10000",
                "Nama sound system sudah tak asing lagi bagi pendengaran kita dan sebuah istilah yang sudah umum dipakai dalam keseharian kita. Bila didefinisikan secara global makna sound system adalah perangkat untuk menguatkan suara agar jangkauan suaranya terdengar oleh pihak lain dalam jarak tertentu. Sekarang ini untuk menyampaikan sebuah informasi suara agar dapat didengar oleh orang lain dalam jangkauan dan lingkup tertentu. Agar informasi suara bisa terdengar oleh banyak orang maka dibutuhkan pengeras suara berupa sound system. Kebutuhan pemakaian sound system ini bisa diterapkan pada halaman terbuka (Outdoor) maupun di dalam ruangan (Indoor)."
            },
            {
                "Proyektor",
                "2",
                "4",
                "@drawable/proyektor_ico.xml",
                "@drawable/hijab.png",
                "5000",
                "Bukan hanya sebagai penutup lantai, sekaligus memberikan warna tersendiri di ruangan. Bahan karpet yang lembut dan bisa menciptakan kenyamanan sehingga menjadikan suasana rumah terasa kian akrab. Tinggal di kawasan beriklim tropis, tidak serta-merta membuat kita enggan menggunakan karpet saat ingin mendekorasi interior rumah. Debu selalu menjadi musuh terbesar buat karpet."
            }
    };

    public static ArrayList<Barang> getListData(){
        Barang barang = null;
        ArrayList<Barang> list = new ArrayList<>();
        for (int i= 0; i < data.length; i++){
            barang = new Barang();
            barang.setNamaBarang(data[i][0]);
            barang.setIcon(data[i][1]);
            barang.setTersedia(data[i][2]);
            barang.setTotalDefault(data[i][3]);

            list.add(barang);
        }
        return list;
    }
}