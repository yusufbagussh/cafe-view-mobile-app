package com.example.mycafeview;

import java.util.ArrayList;
import java.util.List;

public class CoffeeData {
    public static List<Coffee> getListCoffee(){
        Coffee coffee1 = new Coffee(R.drawable.ic_coffee, "Almamater Coffee & Eatery Cozy", -7.559812509324213, 110.8489110396445, "Jl. Ir. Sutami No.32, Jebres, Kec. Jebres, Kota Surakarta, Jawa Tengah 57126");
        Coffee coffee2 = new Coffee(R.drawable.ic_coffee, "Cold n Brew", -7.54523863986562, 110.77471048186591, "Jl. Adi Sucipto No.31A, Kenaiban, Blulukan, Kec. Colomadu, Kabupaten Karanganyar, Jawa Tengah 57174");
        Coffee coffee3 = new Coffee(R.drawable.ic_coffee, "Gade Coffe", -7.563922796307218, 110.80057763965397, "Jl. Slamet Riyadi No.357, Purwosari, Kec. Laweyan, Kota Surakarta, Jawa Tengah 57141");
        Coffee coffee4 = new Coffee(R.drawable.ic_coffee, "Heika Kopi", -7.567908664136723, 110.82035038212054, "Jl. Kartini No.45, Timuran, Kec. Banjarsari, Kota Surakarta, Jawa Tengah 57131");
        Coffee coffee5 = new Coffee(R.drawable.ic_coffee, "Kelana Kopi", -7.5541293560929095,110.80709444359664, "Jl. Adi Sucipto No.31A, Kenaiban, Blulukan, Kec. Colomadu, Kabupaten Karanganyar, Jawa Tengah 57174");
        Coffee coffee6 = new Coffee(R.drawable.ic_coffee, "Pixel Coffe", 7.565155210947302, 110.80220002604625, "Jl. Satrio Wibowo No.35, Purwosari, Kec. Laweyan, Kota Surakarta, Jawa Tengah 57142");
        Coffee coffee7 = new Coffee(R.drawable.ic_coffee, "Sandaran Coffe", -7.5758720371414485, 110.81118534139043, "Jl. Pulanggeni No.7, Tipes, Kec. Serengan, Kota Surakarta, Jawa Tengah 57154");
        Coffee coffee8 = new Coffee(R.drawable.ic_coffee, "Sekutu Coffe", -7.5700463706025225, 110.8226570818661, "Jl. Slamet Riyadi No.116, Keprabon, Kec. Banjarsari, Kota Surakarta, Jawa Tengah 57151");
        Coffee coffee9 = new Coffee(R.drawable.ic_coffee, "Seperdua Kopi", -7.56535495657173, 110.84342182604617, "Jl. Surya, Jagalan, Kec. Jebres, Kota Surakarta, Jawa Tengah 57124");
        Coffee coffee10 = new Coffee(R.drawable.ic_coffee, "Solo Kopi", -7.54523863986562, 110.77471048186591, "Jl. Adi Sucipto No.31A, Kenaiban, Blulukan, Kec. Colomadu, Kabupaten Karanganyar, Jawa Tengah 57174");

        List<Coffee> list = new ArrayList<>();
        list.add(coffee1);
        list.add(coffee2);
        list.add(coffee3);
        list.add(coffee4);
        list.add(coffee5);
        list.add(coffee6);
        list.add(coffee7);
        list.add(coffee8);
        list.add(coffee9);
        list.add(coffee10);

        return list;
    }
}
