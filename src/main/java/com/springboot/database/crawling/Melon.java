package com.springboot.database.crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Melon {
    final String melonUrl = "https://www.melon.com/chart/index.htm";
    Connection conn = Jsoup.connect(melonUrl);

    public void crawl() {
        try {
            Document document = conn.get();
            Elements element = document.getElementsByClass("lst50");

            for (Element e : element) {
                String rank = e.select("div.wrap.t_center > span").text();
                String title = e.select("div.ellipsis.rank01 > span > a").text();
                String artist = e.select("div.ellipsis.rank02 > span > a").text();    //.attr("title");
                String src = e.select("a.image_typeAll > img").attr("src");
                System.out.println(rank+ "\n" + artist+ " - " + title);
                System.out.println("Image URL: " + src);
            }

            Elements element2 = document.getElementsByClass("lst100");

            for (Element e : element2) {
                String rank = e.select("div.wrap.t_center > span").text();
                String title = e.select("div.ellipsis.rank01 > span > a").text();
                String artist = e.select("div.ellipsis.rank02 > span > a").text();    //.attr("title");
                String src = e.select("a.image_typeAll > img").attr("src");
                System.out.println(rank+ "\n" + artist+ " - " + title);
                System.out.println("Image URL: " + src);
            }

            System.out.println("\n크롤링 완료!");




        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Melon melon= new Melon();
        melon.crawl();
    }
}
