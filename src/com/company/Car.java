package com.company;
import java.util.Scanner;

public class Car {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("차량정보를 입력해주세요");
        System.out.println("차종");
        String name = sc.nextLine();
        System.out.println("차량 번호");
        String num = sc.nextLine();
        System.out.println("차량 길이");
       String width = sc.nextLine();
        System.out.println("차량 높이");
        String height = sc.nextLine();
        System.out.println("연료 탱크 용량");
        String tank  = sc.nextLine();
        System.out.println("현재 남은 연료량");
        String fuel  = sc.nextLine();
        System.out.println("연비");
        String echofuel = sc.nextLine();




        Car myCar = new Car (name, num, width, height, tank, fuel, echofuel);


    }
}
