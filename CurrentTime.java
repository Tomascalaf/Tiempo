public class CurrentTime extends Thread{
    public void run(){
        while(true) {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sec += 0.001;
            if(sec == 60.000) {
                min++;
                sec = 0.0;
            }
        }
    }

    public Time getTime(){
        return new Time(min, sec);
    }

    int min = 0;
    double sec = 0.0;
}
