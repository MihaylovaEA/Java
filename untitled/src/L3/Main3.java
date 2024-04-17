package src.L3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    /*
    РљР°С‚Р°Р»РѕРі С‚РѕРІР°СЂРѕРІ РєРЅРёР¶РЅРѕРіРѕ РјР°РіР°Р·РёРЅР° СЃРѕС…СЂР°РЅРµРЅ РІ РІРёРґРµ РґРІСѓРјРµСЂРЅРѕРіРѕ СЃРїРёСЃРєР° List<ArrayList<String>> С‚Р°Рє,
    С‡С‚Рѕ РЅР° 0Р№ РїРѕР·РёС†РёРё РєР°Р¶РґРѕРіРѕ РІРЅСѓС‚СЂРµРЅРЅРµРіРѕ СЃРїРёСЃРєР° СЃРѕРґРµСЂР¶РёС‚СЃСЏ РЅР°Р·РІР°РЅРёРµ Р¶Р°РЅСЂР°, Р° РЅР° РѕСЃС‚Р°Р»СЊРЅС‹С… РїРѕР·РёС†РёСЏС… - РЅР°Р·РІР°РЅРёСЏ РєРЅРёРі.
    РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ РґР»СЏ Р·Р°РїРѕР»РЅРµРЅРёСЏ РґР°РЅРЅРѕР№ СЃС‚СЂСѓРєС‚СѓСЂС‹.

    [
    [СЃРєР°Р·РєРё, РєРѕР»РѕР±РѕРє, РєСѓСЂРѕС‡РєР° СЂСЏР±Р°, Р·РѕР»РѕС‚РѕР№ РїРµС‚СѓС€РѕРє],
    [С„Р°РЅС‚Р°СЃС‚РёРєР°, РіР°СЂСЂРё РїРѕС‚С‚РµСЂ, РЅРѕС‡РЅРѕР№ РґРѕР·РѕСЂ],
    [СЂРѕРјР°РЅ, РІРѕР№РЅР° Рё РјРёСЂ, СЂРѕРјРµРѕ Рё РґР¶СѓР»СЊРµС‚С‚Р°]
    ]
     */
    static List<List<String>> shopBook = new ArrayList<>();

    public static void main(String[] args) {
        addBook("СЃРєР°Р·РєРё", "РєРѕР»РѕР±РѕРє");
        addBook("С„Р°РЅС‚Р°СЃС‚РёРєР°", "РіР°СЂСЂРё РїРѕС‚С‚РµСЂ");
        addBook("С„Р°РЅС‚Р°СЃС‚РёРєР°", "РіР°СЂСЂРё РїРѕС‚С‚РµСЂ");
        addBook("СЃРєР°Р·РєРё", "РєСѓСЂРѕС‡РєР° СЂСЏР±Р°");
        addBook("СЂРѕРјР°РЅ", "СЂРѕРјРµРѕ Рё РґР¶СѓР»СЊРµС‚С‚Р°");
        addBook("Р РѕРјР°РЅ", "РІРѕР№РЅР° Рё РјРёСЂ");
        addBook("С„Р°РЅС‚Р°СЃС‚РёРєР°", "РЅРѕС‡РЅРѕР№ РґРѕР·РѕСЂ");
        addBook("СЃРєР°Р·РєРё", "Р·РѕР»РѕС‚РѕР№ РїРµС‚СѓС€РѕРє");

        System.out.println(shopBook);
    }

    static void addBook(String genreBook, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            //РєРЅРёР¶РЅР°СЏ РїРѕР»РєР°
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)){
                if (!genreList.contains(nameBook)) {
                    genreList.add(nameBook);
                }
                return;
            }
        }

        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        shopBook.add(list);
    }
}