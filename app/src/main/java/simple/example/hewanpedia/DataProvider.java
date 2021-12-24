package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Semut;
import simple.example.hewanpedia.model.Ular;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Capung;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Capung> initDataCapung(Context ctx) {
        List<Capung> capungs = new ArrayList<>();
        capungs.add(new Capung("Brachydiplax chalybea", "India",
                "capung ini berukuran kecil hingga sedang, di mana jantan berwarna abu-abu putih kebiruan dengan perut yang lebar", R.drawable.brachydiplax_chalybea));
        capungs.add(new Capung("brachythemis contaminata", "Indonesia ",
                "Capung ini termasuk jenis capung berukuran sedang dengan rentang sayap belakang 20-24mm", R.drawable.brachythemis_contaminata));
        capungs.add(new Capung("crocothemis servilia", "Indonesia",
                "capung ini berukuran besar dengan rentang sayap belakang 31-33mm, habitat capung ini adalah area terbuka seperti lahan pertanian ", R.drawable.crocothemis_servilia));
        capungs.add(new Capung("orthetrum sabina", "asia",
                "capung ini dikenal sebagai species capung paling umum di asia", R.drawable.orthetrum_sabina));
        return capungs;
    }

    private static List<Semut> initDataSemut(Context ctx) {
        List<Semut> semuts = new ArrayList<>();
        semuts.add(new Semut("ochetellus", "laterille",
                "Semut ini berukuran 2,5 - 3 mm dengan warna hitam mengkilat dan sering kita jumpai di dapur atau kamar tidur", R.drawable.semut_ochetellus));
        semuts.add(new Semut("Solenopsis spp", "Amazon, amerika selatan ",
                "Semut ini berwarna coklat tembaga pada kepala dan tubuh, dengan warna lebih gelap, semut ini memili ratu yg memili panjang 5/8mm dan lain hal nya dengan pekerja nya yg memiliki panjang 1/8 - 1/4", R.drawable.semut_solenopsis_spp));
        semuts.add(new Semut("Tapinoma melanocephalum", "kanada, amerika utara",
                "kaki dan perut warna putih dengan panjang 1-16mm, ratu semut jenis ini berpoligami untuk menghasilkan telur ", R.drawable.semut_tapinoma_melanocephalum));
        semuts.add(new Semut("Tapinoma sesile", "afrika",
                "Semut ini memiliki kaki 6 dengan antena 12 segmen dan tidak di akhiri dengan sebuah titik, memakan makanan manis seperti gula dan permen", R.drawable.semut_tapinoma_sessile));
        semuts.add(new Semut("Monomorium pharaonis", "Jerman",
                "Jenis semut ini tertarik pada makanan yg memiliki protein tinggi seperti daging, lemak, serangga mati dll.", R.drawable.semut_monomorium_pharaonis));
        semuts.add(new Semut("Camponotus Pennsylvanicus", "Jepang",
                "Semut ini kerap kali dijumpai pada kayu lembab dan juga kayu kering, jenis semut ini memakan cairan manis, sisa tanaman, dan sisa serangga ", R.drawable.semut_componotus_pennsylvanicus));
        return semuts;
    }
    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular("ular_sanca", "Afrika",
                "Ular tersebar luas di afrika subsahara,nepal,india,sri langka,myanmar,tiongkok selatan,asia tenggara,indonesia ", R.drawable.ular_sanca));
        ulars.add(new Ular("ular_kobra", "indonesia",
                "jenis ular ini memiliki kemampuan memipihkan lehernya hingga membentuk seperti sendok atau tudung", R.drawable.ular_kobra));
        ulars.add(new Ular("ular_welang", "Asia tenggara",
                "ular ini adalah salah satu ular yang sangat mematikan,selain mematikan ular ini memiliki dua warna seperti cincin di tubuhnya", R.drawable.ular_welang));
        ulars.add(new Ular("ular_pucuk", "asia selatan",
                "ular ini sering di jumpai di pohon bertubuh kecil dan ramping", R.drawable.ular_pucuk));
        return ulars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataCapung(ctx));
        hewans.addAll(initDataSemut(ctx));
        hewans.addAll(initDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
