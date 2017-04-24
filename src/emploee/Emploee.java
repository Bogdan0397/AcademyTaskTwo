package emploee;

/**
 * Created by koqfl on 24.04.2017.
 */
public class Emploee {
    private String name;
    private int rate;
    private int hours;

    public static int getTotalSum() {
        return totalSum;
    }

    private static int totalSum;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    Emploee(){

    }
    Emploee(String name, int rate)
    {
        this();
        setName(name);
        setRate(rate);
    }
    Emploee(String name, int rate,int hours){
        this(name,rate);
        setHours(hours);
        totalSum+=bonuses();
    }
    public int salary()
    {
        return rate*hours;
    }
    public void changeRate(int rate){
        totalSum-=bonuses();
        this.rate = rate;
        totalSum+=bonuses();
    }
    public double bonuses(){
        return salary()+salary()*0.1;
    }
    public String toString(){
        return name+" "+rate+" "+" "+hours;
    }


}
