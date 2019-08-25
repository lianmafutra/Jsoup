package com.sunflower.jsoup;

import java.io.IOException;
import java.lang.reflect.Array;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoup {

    public static void main(String[] args) throws IOException {


        try {
            String url = "http://iku.menlhk.go.id/aqms/";

            Document document = Jsoup.connect(url).get();

            Elements stasiun = document.getElementsByClass("namastasiun");
            Elements tanggal = document.getElementsByClass("isitanggal");

            String[] stasiunarray = new String[stasiun.size()];
            String[] tanggalarray = new String[tanggal.size()];
            int b = 0;
            for (int i = 0; i < stasiun.size(); i++) {
                stasiunarray[i] = stasiun.get(i).text();
            }
            for (int i = 0; i < tanggal.size(); i++) {
                tanggalarray[i] = tanggal.get(i).text();
            }
            System.out.println(
                    "STASIUN = " + stasiunarray[46] +
                            "\n" + "KRITERIA = " + stasiunarray[47] +
                            "\n" + "TANGGAL = " + tanggalarray[24]);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
