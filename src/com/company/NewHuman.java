package com.company;

public class NewHuman {

    private String name;
    private int age;
    private int height;
    private int weight;
    //private으로 클래스 내에서만 사용 가능한 객체를 생성 => 다른 클래스에서 이 객체를 사용하려면 이 클래스의 허용이 있어야 함

    NewHuman(String n, int a, int h, int w) {
        name = n;
        age = a;
        height = h;
        weight = w;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    int getHeight() {
        return height;
    }

    int getWeight() {
        return weight;
    }

    void addheight(int h) {
        height += h;
    }//addheight(키가 커짐) 라는 매서드를 생성

    void addweight(int w) {
        weight -= w;
    }//addweight(몸무게가 감소)라는 메서드를 생성
    void addage(int a){
        age+=a;
        System.out.println("메소드 출력 나이 :"+age);
    }
}

    class Hucls {
        public static void main(String[] args) {
            NewHuman human1 = new NewHuman("박종현",26,180,88);
            human1.addheight(5);
            human1.addweight(3);
            human1.addage(2);
            System.out.println("이름 :"+human1.getName());
            System.out.println("나이 :"+human1.getAge());
            System.out.println("  키 :"+human1.getHeight());
            System.out.println("몸무게:"+human1.getWeight());
        }
    }
//초기화와 관련된 위험성 :
// 인스턴스의 각 필드에 설정하는 것을 까먹은 경우 에러가 발생할 위험이 있으므로
//초기화 해야 할 필드는 초기화를 강제로 해야한다.
//데이터 보호와 관련된 위험성:
// 기본적으로 public 혹은 pravate 혹은 protected등을 설정하지 않은 객체는 기본타입이
/*public으로 설정되기 때문에 다른 클래스에서 해당 값을 변경할수 있다.class 따라서
클래스 내부에서만 사용할 객체는 private등을 설정해 주면 좀 더 안전한 코드가 된다.*/

//카멜기법 -> 대문자로 구분지어주는 것이
// 스네이크 기법 -> 언더 바로 _ 구분지어주는 것


