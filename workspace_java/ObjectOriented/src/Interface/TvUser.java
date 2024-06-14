package Interface;

public class TvUser {
    public static void main(String[] args) {

    Tv tv = new LgTv();
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();

        SamsungTv tv1 = new SamsungTv();
        LgTv tv2 = new LgTv();
        Tv tv3 = new SamsungTv();
        Tv tv4 = new LgTv();
    }
}
