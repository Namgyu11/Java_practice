package Java_07.Java07_2;

// Java 프로그래밍 - 클래스와 객체_2

import Java_07.Java07_2_01.Car2;

class Car {
    String name;
    String type;

    Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 오버로딩 구현

    public void printCarInfo(String date) {
        this.printCarInfo();
        System.out.println("date = " + date);
    }

    public void printCarInfo(int number) {
        this.printCarInfo();
        System.out.println("number = " + number);
    }

    public void printCarInfo(String date, int number) {
        this.printCarInfo();
        System.out.println("date = " + date);
        System.out.println("number = " + number);
    }
}


class Car3 {
    // 스태틱 변수
    static String name = "None";
    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 스태틱 메소드
    public static void getName(){
        System.out.println("Car name : " + name);
    }

}


public class Main {

    public static void main(String[] args) {
        Car myCar1 = new Car("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022", 1234);


//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car2 mycar2 = new Car2("a", "b", "c", "d");
        System.out.println(mycar2.name1);
//        System.out.println(mycar2.name2);
//        System.out.println(mycar2.name3);
//        System.out.println(mycar2.name4);

//      3. Static
        System.out.println("=== Static ===");
        Car3.getName();

        Car3 mycar3_1 = new Car3("a", "seden");
        Car3 mycar3_2 = new Car3("b", "suv");
        Car3 mycar3_3 = new Car3("c", "rv");
        mycar3_1.printCarInfo();
        mycar3_2.printCarInfo();
        mycar3_3.printCarInfo();


    }

}