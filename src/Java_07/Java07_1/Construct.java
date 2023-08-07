package Java_07.Java07_1;
//  Practice
//  다음 클래스 직접 만든 후 객체 생성
//  클래스명: Animal
//  특성: 이름, 무게, 분류
//  기능: 먹기, 잠자기, 걷기, 뛰기

class Animal{
    private final String name;
    private final double weight;
    private final String group;
    Animal(String name, double weight, String group){

        this.name = name;
        this.weight =weight;
        this.group = group;
    }
    public void print(){
        System.out.println("이름 =" + name);
        System.out.println("무게 =" + weight);
        System.out.println("분류 =" + group);
    }
    public void eat(){
        System.out.println("먹기");
    }
    public void walking(){
        System.out.println("걷기");
    }
    public void run(){
        System.out.println("뛰기");
    }
}
public class Construct {
    public static void main(String[] args) {
        // Test code
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.print();
        animal2.print();
    }
}
