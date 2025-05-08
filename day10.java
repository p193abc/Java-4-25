 class student{
    int age;
    student(int age){
        this.age=age;
    }
    void printt(){
        System.out.println(age);
    }

}
class vehicle{
     void run(){
        System.out.println(" chalti hai ");
     }
}
class bike extends vehicle{
    void run(){
        System.out.println("broom broom");
    }
}
public class day10 {

    public static void main(String[] args) {
        student obj=new student(16);
        obj.printt();
        vehicle car=new bike();
        car.run();
    }
    
}

