import java.text.DecimalFormat;

public class Time {

    public Time(int min, double sec){
        this.min = min;
        this.sec = sec;
    }

    // t1 < t2
    public Time(Time t1, Time t2){
        min = t2.min - t1.min;
        sec = t2.sec - t1.sec;

        while(sec < 0.0){
            min++;
            sec += 60.0;
        }
    }

    protected static final DecimalFormat df = new DecimalFormat("00.000");
    protected int min;
    protected double sec;

    // Getters
    public int getMin(){
        return min;
    }

    public double getSec(){
        return sec;
    }



    public String toString(){
        return min + ":" + df.format(sec);
    }

    public boolean isLess(Time t){
        if(t == null) return true;
        else if(min < t.getMin()) return true;
        else if(min == t.getMin() && sec < t.getSec()) return true;
        return false;
    }

    public boolean isEqual(Time t){
        if(t == null) return false;
        if(min == t.getMin() && sec == t.getSec()) return true;
        return false;
    }
}
