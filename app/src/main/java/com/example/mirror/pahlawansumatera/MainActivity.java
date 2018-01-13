package com.example.mirror.pahlawansumatera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent intent;
    ListView list1;

    String[] text = {"Prof. Mohammad Yamin, S.H.", "Sultan Mahmud Badaruddin II", "Dr.G.S.S.J.Ratulangi", "Prof. Dr. Hazairin, SH", "Sultan Thaha Syaifuddin", "Raden Inten II", "Silas Papare", "H. Adam Malik", "Prof. Dr. Buya Hamka", "Prof. Dr. Buya Hamka", "K.H. AGUS SALIM", "Dr. H. Mohammad Hatta", "Tuanku Imam Bonjol"};
    Integer[] imgicon = {R.mipmap.aad, R.mipmap.bshf, R.mipmap.csd, R.mipmap.dfsf, R.mipmap.ffsf, R.mipmap.gsfds, R.mipmap.hsdfs, R.mipmap.isdfs, R.mipmap.jsdfs, R.mipmap.ksfs, R.mipmap.lsdfs, R.mipmap.msdf, R.mipmap.nsdfs};
    String[] descriptionitem = {"Aceh", "Bengkulu", "Padang", "Lampung", "Medan", "Palembang", "Aceh", "Bengkulu", "Padang", "Lampung", "Medan", "Palembang", "Indonesia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Main2Activity adapter = new Main2Activity(this, text, imgicon, descriptionitem);
        list1 = (ListView) findViewById(R.id.list1);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(this);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int adapter, long l) {
        switch (adapter){
            case 0:
                Toast.makeText(this, "Prof. Mohammad Yamin, S.H.,", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("judulnya","Prof. Mohammad Yamin, S.H.");
                intent.putExtra("text","Tanggal Lahir : 24 Agustus 1903\n" +
                        "Tempat Lahir : Sawahlunto, Sumatera Barat, Hindia Belanda\n" +
                        "Zodiac : Virgo\n" +
                        "Meninggal : Jakarta, 17 Oktober 1962 (umur 59)\n" +
                        "Makam : Talawi, Kabupaten Sawahlunto, Sumatera Barat.\n" +
                        "Agama : Islam\n" +
                        "Ayah : Tuanku Oesman Gelar Baginda Khatib\n" +
                        "Ibu: Siti Saadah\n\n Mohammad Yamin merupakan pahlawan yang memperjuangakan persatuan dan kesatuan pemuda melalui Sumpah Pemuda tahun 28 Oktober 1928. Beliau adalah seorang sastrawan, politikus dan ahli hukum yang disegani sebagai Pahlawan nasional Indonesia. Beliau Lahir di Sawah Lunto Sumatera Barat pada tanggal 24 Agustus 1903. Biografi Mohammad Yamin dimulai dari Riwayat pendidikan Mohammad Yamin di awali dengan pendidikan dasar d Palembang, kemudian ia melanjutkan sekolahnya di Yogyakarta yaitu Sekolah AMS. Disana ia juga mempelajari sejarah purbakala dan beberapa bahasa di dunia seperti latin, kael dan Yunani. Setelah itu ia melanjutkan pendidikan hukum di Batavia. Ia memperoleh gelar M");
                intent.putExtra("gambar", R.drawable.aad);
                startActivity(intent);
                break;
            case 1:
                Toast.makeText(this, "Sultan Mahmud Badaruddin II", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                intent.putExtra("judulnya","Sultan Mahmud Badaruddin II");
                intent.putExtra("text","Lahir di  : Palembang, \n" +
                        "23 Nov 1767\n" +
                        "Wafat di : Ternate, Maluku  Utara,\n" +
                        " 26 September 1852\n Sultan Mahmud Badaruddin II \n" +
                        "Nama aslinya : Raden Hasan Pangeran Ratu\n" +
                        "Usia saat meninggal : 84 tahun \n" +
                        "Lokasi Makam : \n" +
                        "Pekuburan Islam Kelurahan Makassar Barat, Kec.Ternate Tengah, Kota Ternate, Maluku Utara, Indonesia.\n\n Beliau adalah seorang Raja terbesar di Kesultanan Palembang Darussalam (memerintah tahun 1803-1813 dan 1818-1821). Memimpin pertempuran melawan Penjajah Inggris dan Belanda, salah satu peperangan terbesar adalah Perang Menteng (dari kata Muntinghe) 11-15 Juni 1819 yang dimenangkan pasukan Sultan Mahmud Badaruddin II. Pada Pertempuran terakhir 22 Mei - 24 Juni 1821, Belanda berhasil mengalahkan Kesultanan Palembang. Tanggal 13 Juli 1821, sultan beserta sebagian keluarganya diasingkan ke Pulau Ternate, Maluku Utara. Selama 31 tahun beliau diasingkan di Ternate,");

                intent.putExtra("gambar", R.drawable.bshf);
                startActivity(intent);
                break;
            case 2:
                Toast.makeText(this, "Dr.G.S.S.J.Ratulangi", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                intent.putExtra("judulnya","Dr.G.S.S.J.Ratulangi");
                intent.putExtra("text","lahir di Tondano, Sulawesi Utara, 5 November 1890\n" +
                        "Meninggal di Jakarta,10 Juni 1949\n" +
                        "dimakamkan di Tondano\n" +
                        "pada umur 58 tahun \n" +
                        "Beliau sering disebut-sebut sebagai tokoh multidimensional. Ia dikenal dengan filsafatnya: \"Si tou timou tumou tou\" yang artinya: manusia baru dapat disebut sebagai manusia, jika sudah dapat memanusiakan manusia. Ia meninggal di Jakarta dalam kedudukan sebagai tawanan musuh..\n" +
                        "Pendidikan\n" +
                        "di Sekolah Dasar Belanda (Europesche Lagere School) di Tondano, di Hoofden School (Sekolah Raja:setingkat SMP), Tondano dan menyelesaikan Sekolah Teknik Koninginlijke Wilhelmina School (saat ini bernama SMK Negeri 1 Jakarta Budi Utomo) bagian mesin, Jakarta pada tahun 1908. Pada tahun 1915, Sam Ratulangi berhasil memperoleh ijazah guru ilmu pasti (Middelbare Acte Wiskunde en Paedagogiek) di Universitas Amsterdam (Universiteit van Amsterdam), Belanda. Pada tahun yang sama, ia melanjutkan studi ke Swiss dan mend\n");
                intent.putExtra("gambar", R.drawable.csd);
                startActivity(intent);
                break;
            case 3:
                Toast.makeText(this, "Prof. Dr. Hazairin, SH", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                intent.putExtra("judulnya","Prof. Dr. Hazairin, SH");
                intent.putExtra("text","Prof. Dr. Hazairin, SH lahir di Bukittinggi, Sumatera Barat, pada 28 November 1906 di tengah-tengah keluarga taat beragama. Ayahnya, Zainul Bahari (Bengkulu) adalah seorang guru dan kakeknya, Ahmad Bakar, adalah seorang ulama. Sedangkan Istrinya, Aminah berdarah Bengkulu. Dari orang tuanya, Hazairin mendapat dasar pelajaran ilmu agama dan bahasa Arab.\n" +
                        "\n" +
                        "Pada tahun 1935, ia menyelesaikan kuliah di Rerchtkundige Hoogeschool (RHS; Sekolah Tinggi Hukum) di Jakarta. Setahun kemudian, ia berhasil mempertahankan desertasinya berjudul “De Redjang” yang menghantarkannya sebagai Pakar Hukum Adat dan satu-satunya doktor pribumi lulusan Sekolah Tinggi Hukum Batavia.\n" +
                        "\n" +
                        "Setelah menyelesaikan kuliahnya, antara tahun 1938 hingga 1945, Hazairin bekerja sebagai Kepala Pengadilan Negeri Tapanuli Selatan. Sesudah Indonesia merdeka, ia memegang jabatan sebagai Asisten Residen Tapanuli dan setahun kemudian tepatnya pada April 1946 sebagai Residen Bengkulu.\n" +
                        "\n" +
                        "Sebagai seorang Residen Bengkulu pada masa Perang Kemerdekaan, Hazairin meng\n");
                intent.putExtra("gambar", R.drawable.dfsf);
                startActivity(intent);
                break;
            case 4:
                Toast.makeText(this, "Sultan Thaha Syaifuddin", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                intent.putExtra("judulnya","Sultan Thaha Syaifuddin");
                intent.putExtra("text","Sultan Thaha Syaifuddin (Jambi, 1816 - Betung, 26 April 1904) adalah sultan terakhir dari Kesultanan Jambi. merupakan pahlawan nasional asal Jambi yang dilahirkan pada pertengahan tahun 1816 di Keraton Tanah Pilih Jambi.\n" +
                        "\n" +
                        "Ia merupakan putra dari Sultan M. Fachrudin dengan gelar sultan Kramat. Nama asli Sultan Thaha adalah Sultan Raden Toha Jayadiningrat. Ketika kecil ia biasa dipanggil Raden Thaha Ningrat.\n" +
                        "\n" +
                        "Meskipun ia terlahir dari kalangan bangsawan, ia memiliki sikap yang rendah hati, senang bergaul dengan masyarakat dan sangat membenci Belanda. Aktivitas melawan Belanda makin gencar sejak ia naik tahta menjadi Raja Jambi pada tahun 1855. Usahanya melawan Belanda dilakukan dengan mengalang kekuatan masyarakat dan berkerjasama dengan raja Sisingamangaraja.\n" +
                        "\n" +
                        "Tahun 1841 ia diangkat sebagai Pangeran Ratu (semacam perdana menteri) di bawah pemerintahan Sultan Abdurrahman. Sejak itu, ia memperlihatkan sikap menentang Belanda. Ketika sebuah kapal dagang Amerika berlabuh di pelabuhan Jambi, ia berusaha mengadakan\n");
                intent.putExtra("gambar", R.drawable.ffsf);
                startActivity(intent);
                break;
            case 5:
                Toast.makeText(this, "Raden Inten II", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                intent.putExtra("judulnya","Raden Inten II");
                intent.putExtra("text","Bergelar : Kesuma Ratu\n" +
                        "Lahir di : Negara Ratu (Lampung),1834\n" +
                        " Wafat di : Negara Ratu Lampung,5 Oktober  1856\n" +
                        " Pada saat wafat usia beliau masih  22 tahun dan\n" +
                        "Dimakamkan di : Desa Gedung Harta,Kel.Cempaka, Penengahan,Lampung Selatan\n Beliau Raja di Negara Ratu (sekarang Provinsi Lampung), beliau selalu memperjuangkan kemakmuran rakyat Lampung dan memimpin perlawan Penjajahan Belanda dan masih ada garis keturunan Fatahillah (Sunan Gunung Jati)");
                intent.putExtra("gambar", R.drawable.gsfds);
                startActivity(intent);
                break;
            case 6:
                Toast.makeText(this, "Silas Papare", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 7:
                Toast.makeText(this, "H. Adam Malik", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 8:
                Toast.makeText(this, "Prof. Dr. Buya Hamka", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 9:
                Toast.makeText(this, "Prof. Dr. Buya Hamka", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 10:
                Toast.makeText(this, "UKM TEC", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 11:
                Toast.makeText(this, "K.H. AGUS SALIM", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 12:
                Toast.makeText(this, "Dr. H. Mohammad Hatta", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
            case 13:
                Toast.makeText(this, "Tuanku Imam Bonjol", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Main2Activity.class);
                break;
        }

    }

}