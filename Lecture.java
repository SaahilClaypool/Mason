/**
 * Created by Saahil on 12/6/2015.
 */
public class Lecture {
    int time;
    String ID;
    public Lecture (int time, String ID){
        this.time = time;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lecture)) return false;

        Lecture lecture = (Lecture) o;

        if (time != lecture.time) return false;
        return !(ID != null ? !ID.equals(lecture.ID) : lecture.ID != null);

    }

    @Override
    public int hashCode() {
        int result = time;
        result = 31 * result + (ID != null ? ID.hashCode() : 0);
        return result;
    }
}
