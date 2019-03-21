package day08.day08_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> WZ = new ArrayList<>();
        WZ.add("《教父》");
        WZ.add("《肖申克的救赎》");
        WZ.add("《辛德勒的名单》");
        WZ.add("《公民凯恩》");
        WZ.add("《卡萨布兰卡》 ");
        WZ.add("《教父续集》");
        WZ.add("《七武士》");
        WZ.add("《星球大战》");
        WZ.add("《美国美人》");
        WZ.add("《飞跃疯人院》");

        ArrayList<String> HY= new ArrayList<>();
       HY.add("《《霸王别姬》");
       HY.add("《大闹天宫》");
       HY.add("《鬼子来了》");
       HY.add("《大话西游》");
       HY.add("《活着》》");
       HY.add("《饮食男女》");
       HY.add("《无间道》");
       HY.add("《天书奇谭》");
       HY.add("《哪吒脑海》");
       HY.add(" 《春光乍泄》");

//        打印全球影片排行榜中的前三甲影片名
        Stream<String> stream1 = WZ.stream();
        stream1.limit(3).forEach(System.out::println);
        System.out.println("===========================");
//        2）打印华人影片排行榜中倒数5名的影片名
        Stream<String> stream2 = HY.stream();
        Stream<String> skip = stream2.skip(5);
       skip.forEach(System.out::println);
        System.out.println("================================");
//        3）将两个排行榜中的前5名挑出来共同存入新的集合
        Stream<String> limit = WZ.stream().limit(5);
        Stream<String> limit1 = HY.stream().limit(5);
        Stream<String> concat = Stream.concat(limit, limit1);
        concat.forEach(System.out::println);
//        4）定义电影Film类，以影片名为name创建Film对象并保存至集合
        System.out.println("=================================");
        List<Film> collect = Stream.concat(WZ.stream(), HY.stream()).map(Film::new).collect(Collectors.toList());
        for (Film film : collect) {
            System.out.println(film);
        }

    }
}

