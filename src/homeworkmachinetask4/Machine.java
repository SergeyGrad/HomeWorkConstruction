package homeworkmachinetask4;

public class Machine {
    private double speed;
    private int weight,year;
    private String color;

    public Machine(){

    }
    public Machine(int year){
    this.year = year;
    }
    public Machine(int year,double speed){
    this.year = year;
    this.speed = speed;
    }
    public Machine(int year,double speed,int weight){
    this.year = year;
    this.speed = speed;
    this.weight = weight;
    }
    public Machine(int year,double speed,int weight,String color){
    this(year,speed,weight);
    this.color = color;
    }
}
