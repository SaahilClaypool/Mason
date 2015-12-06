/**
 * Created by Saahil on 12/6/2015.
 */
public interface ASchedule {
    Lecture getClass(int time);
    boolean inClass(Lecture l);
}
