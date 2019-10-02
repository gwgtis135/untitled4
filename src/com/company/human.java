package com.company;

public class human {


    public static void main(String[] args) {
        humanif aaa = new humanif();  //aaa 라는 새로운 객체를 생성
        humanif bbb = new humanif();
        aaa.name = "박종현";
        aaa.age = 20;
        aaa.height = 180;
        aaa.weight = 70;
        // 객체에 값을 저장

        bbb.name = "d";
        bbb.age = 12;


        System.out.println("이름은 "+aaa.name+"입니다.");
        System.out.println("나이는 "+aaa.age+"살 입니다.");
        System.out.println("키와 몸무게는 각각 "+aaa.height+"cm, "+aaa.weight+"kg입니다.");


        System.out.println("이름은 "+bbb.name+"입니다.");
        System.out.println("나이는 "+bbb.age+"살 입니다.");

    }

}
     class humanif{
         String name;
         int age;
         int height;
         int weight;
        }
