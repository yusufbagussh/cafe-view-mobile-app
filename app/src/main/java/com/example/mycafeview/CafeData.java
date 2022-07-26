package com.example.mycafeview;

import java.util.ArrayList;
import java.util.List;

public class CafeData {
    public  static List<Cafe> getCafeList(){
        Cafe cafe1 = new Cafe("Gade Coffee", "Di Buka Tanggal 11 Juli 2018, Kedai kopi ini Berdiri berdampingan Dengan Kantor Pegadaian Purwotomo (Purwosari solo),berada di tengah kota solo. Kalau kamu beruntung Bisa Lihat Kereta Api lewat depan kedai kopi ini.Kedai Kopi ini Berharap bisa menambah kenyamanan Nasabah dalam bertransaksi di pegadaian atau mungkin Sekalian ngopi dan ngobrol investasi, ngomong bisnis dll, Free wifi dan tersedia LED monitor yang bisa di pakai Untuk Umum.","https://i.ibb.co/KqnzLKH/Gade-2.png","Jl. Slamet Riyadi No.357, Purwosari, Kec. Laweyan, Kota Surakarta, Jawa Tengah 57141","4.6");
        Cafe cafe2 = new Cafe("Pixel Coffee", "Tempat ngumpul berkerja, santai menikmati waktu, dengan berbagai pilihan ruangan AC non smoking, Smoking AC dan Smoking Outdoor","https://i.ibb.co/Tr6wFPF/pixel-5.png","Jl. Satrio Wibowo No.35, Purwosari, Kec. Laweyan, Kota Surakarta, Jawa Tengah 57142","4.6");
        Cafe cafe3 = new Cafe("Sandaran Coffee","Sandaran Kopi Solo merupakan tempat ngopi alias coffee shop terbaru di Solo yang menyajikan nuansa coffee shop semi outdoor yang kekinian dan nyaman di tengah Kota Solo dekat SMA N 7 Solo .Sandaran Kopi Solo ini tampil dalam bentuk memanfaatkan bangunan rumah kampung di tengah kota yang cukup luas lalu merevitalisasinya menjadi coffee shop yang nyaman untuk menjadi rekomendasi tempat ngopi atau hangout di Solo.","https://i.ibb.co/0YBs3ps/sandaran-1.png","Jl. Pulanggeni No.7, Tipes, Kec. Serengan, Kota Surakarta, Jawa Tengah 57154","4.8");
        Cafe cafe4 = new Cafe( "Sekutu Kopi","Kafe ini memiliki konsep interior yang sesuai dengan selera anak muda yang menampilkan kesan estetik. Sekutu Kopi memiliki tiga lantai. Di lantai 1 terdapat meja barista dan coffee bar yang sekaligus menjadi tempat untuk memesan menu.\n" +
                "Untuk lantai 2 memiliki ruang yang lebih luas daripada lantai 1. Desain interior di lantai 2 kebanyakan menggunakan bahan dari kayu dan dibuat semenarik mungkin. Sedangkan di lantai 3 adalah ruang yang diperbolehkan untuk merokok.","https://i.ibb.co/NWLhHMC/sekutu-1.png","Jl. Slamet Riyadi No.116, Keprabon, Kec. Banjarsari, Kota Surakarta, Jawa Tengah 57151","4.6");
        Cafe cafe5 = new Cafe( "Solo Kopi","Solo Kopi adalah salah satu tempat ngopi atau Coffe Shop di Solo.terdapat 2 lantai di coffeshop ini dan pastinya cocok banget buat kalian yang pengen nongkrong sama temen temen kalian pastinya.","https://i.ibb.co/gzh7SHp/solo-2.png","Jl. Adi Sucipto No.31A, Kenaiban, Blulukan, Kec. Colomadu, Kabupaten Karanganyar, Jawa Tengah 57174","4.5");
        Cafe cafe6 = new Cafe( "Kelana Kopi","Kelana memiliki konsep kedai kopi dan restoran keluarga dengan dua pilihan tempat, yakni smoking area dan non smoking area. Kawasan smoking area meliputi area depan dengan konsep outdoor dan semi-outdoor hingga area bar. Sedangkan non-smoking area meliputi area indoor dan taman belakang yang didesain dengan konsep lesehan menggunakan bean bag dan lebih santai. Konsep ini dipilih dengan menyesuaikan tempat yang ada dengan bangunan serta taman depan yang luas yang dapat difungsikan. ak sekadar kedai kopi semata, Kelana juga rutin mengadakan kelas yoga yang biasa diadakan setiap bulan, tepatnya di minggu terakhir dalam satu bulan.","https://i.ibb.co/dGSnF2N/Kelana-Kopi.jpg","Jl. Adi Sucipto No.31A, Kenaiban, Blulukan, Kec. Colomadu, Kabupaten Karanganyar, Jawa Tengah 57174","4.4");
        Cafe cafe7 = new Cafe("Almamater Coffee & Eatery Cozy", "Konsep yang di terapkan di Cafe Almamater Coffee & Eatery Cozy adalah konsep yang bisa Anda dapatkan pada bagian indoor yaitu dimana tempat ini memang didesain senyaman mungkin untuk kerja atau mengerjakan tugas dengan berbagai fasilitas yang sudah tersedia. Jika bosan mengerjakan tugas dikost dan inspirasi tak kunjung dateng, tempat ini mungkin bisa menjadi solusi mendapatkan inspirasi baru dan nyaman untuk mengerjakan tugas.\n" +
                "Untuk Area Outdoor mempunyai konsep hangout tepatnya ada di bagian belakang tempat ini yang bisa membuat Anda semakin betah untuk stay nongkrong ditempat ini karena untuk area belakang ini Anda akan mendapakan area yang cukup luas. Tidak hanya itu jika Anda yang suka dan mempunyai hobi foto tempat ini.","https://i.ibb.co/DkGN9kk/Almamater-1.png","Jl. Ir. Sutami No.32, Jebres, Kec. Jebres, Kota Surakarta, Jawa Tengah 57126","4.6");
        Cafe cafe8 = new Cafe("Heika Kopi", "Tempat ngopi yang berada dikeramain dengan nuansa yang tenang dan nyaman untuk kalian singgahi","https://i.ibb.co/LYt2qxL/Heika-3.png","Jl. Kartini No.45, Timuran, Kec. Banjarsari, Kota Surakarta, Jawa Tengah 57131","4.7");
        Cafe cafe9 = new Cafe("Cold n Brew","Solo Kopi adalah salah satu tempat ngopi atau Coffe Shop di Solo.terdapat 2 lantai di coffeshop ini dan pastinya cocok banget buat kalian yang pengen nongkrong sama temen temen kalian pastinya.","https://i.ibb.co/DRZKGwK/Cold-n-Brew.png","Jl. Adi Sucipto No.31A, Kenaiban, Blulukan, Kec. Colomadu, Kabupaten Karanganyar, Jawa Tengah 57174","4.5");
        Cafe cafe10 = new Cafe("Seperdua Kopi", "Seperdua Kopi adalah tempat ngopi alias coffee shop di Solo tepatnya Jebres Kota Solo yang menyajikan nuansa coffee shop gaya urban modern kekinian di Jalan Surya dekat SMA N 3 Solo yang selalu ramai. Seperdua Kopi ini lengkap aneka menu kopi , thai tea dan cemilan hingga rice bowl dengan citarasa lezat.","https://i.ibb.co/vDp6h5y/Seperdua-1.png","Jl. Surya, Jagalan, Kec. Jebres, Kota Surakarta, Jawa Tengah 57124","4.7");

        List<Cafe> list = new ArrayList<>();
        list.add(cafe1);
        list.add(cafe2);
        list.add(cafe3);
        list.add(cafe4);
        list.add(cafe5);
        list.add(cafe6);
        list.add(cafe7);
        list.add(cafe8);
        list.add(cafe9);
        list.add(cafe10);
        return list;

    }
}
