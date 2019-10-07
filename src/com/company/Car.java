package com.company;
import java.util.Scanner;

public class Car {

        private String name;
        private String number;
        private int width;
        private int height; //
        private double x; //현재 차량 위치의  x좌표
        private double y; //현재 차량 위치의 y좌표
        private double tank;//차량 연료 탱크
        private double fue1; //들어있는 연료량
        private double yb;//연비`

        // 생성자

        Car(String name, String number, int width, int height, double x, double y, double tank, double fue1, double yb){
            this.name = name;
            this.number = number;
            this.width = width;
            this.height = height;
            this.tank = tank;
            this.fue1 = (fue1 <= tank)? fue1 : tank;
            this.yb = yb;
            x=y=0.0;

        }
        double getx() {return x;} //현재 위치의 x 좌표 불러오기
        double gety() {return y;} //현재 위치의 y좌표 불러오기
        double getFue1() {return fue1;} //남은 연료 불러오기

    //사양 표시
    void putSpaec(){

        System.out.println("이름 :"+name);
        System.out.println("차번호 :"+number);
        System.out.println("차넓이 :"+width);
        System.out.println("차높이 :"+height);
        System.out.println("탱크 :"+tank);
        System.out.println("연비 :"+fue1);




    }
       boolean move(double dx, double dy){
            double dist = Math.sqrt(dx * dx + dy * dy); //이동거리
           double f = dist /yb; //이동에 필요한 연료
           if (f<fue1){
               return false;
           }else{
               fue1 -=f;
               x +=dx;
               y+= dy;
               return true; //이동완료
           }
       }
       //주유
        void refue1(double df){
            if(df >0){
                fue1 +=df;
                if(fue1 > tank){
                    fue1 = tank;
                }
            }
        }

    }
        class myCar{
            public static void main(String[] args) {
                Car k9 = new Car("k9","58가1004",1920,1080,40.0,35.0,50.0,40.0,12.0);
                k9.putSpaec();
                Car genesis = new Car("genesis", "77칠7777",2000,1000,30.0,20.0,40.0,25.0,15.0);
                genesis.putSpaec();

            }
        }
