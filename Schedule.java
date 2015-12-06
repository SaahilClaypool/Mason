import java.util.ArrayList;

/**
 * Created by Saahil on 12/6/2015.
 */
public class Schedule implements ASchedule {
    ArrayList<Lecture> classes;
    public Schedule (ArrayList<Lecture> lectures){
        this.classes = lectures;
    }
    @Override
    public Lecture getClass(int time) {
        for(Lecture l: classes){
            if (l.time == time) {
                return l;
            }
        }

        return null;
    }

    @Override
    public boolean inClass(Lecture l) {
        for(Lecture myLec: classes){
            if(myLec.equals(l))
                return true;
        }
        return false;
    }
}
