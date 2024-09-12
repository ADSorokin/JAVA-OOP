import java.util.concurrent.atomic.AtomicLong;

public class Helper {
    static long helper(){
        AtomicLong counter = new AtomicLong();
        long numericID = counter.getAndIncrement();
        return numericID;
    }
}
