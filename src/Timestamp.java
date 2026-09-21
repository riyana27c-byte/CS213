public class Timestamp implements Comparable <Timestamp> {
    private Date date;
    private byte hour;
    private byte minute;

    public Timestamp(Date date, byte hour, byte minute){
        this.date = date;
        this.hour = hour;
        this.minute = minute;
    }
    @Override
    public int compareTo(Timestamp o) {
        if (date.compareTo(o.date) < 0){
            return -1;
        }
        if(date.compareTo(o.date) > 0){
            return 1;
        }
        if(hour > o.hour){
            return 1;
        }
        if(hour < o.hour){
            return -1;
        }
        if(minute > o.minute){
            return 1;
        }
        if(minute < o.minute){
            return -1;
        }
        return 0;
    }


    @Override
    public String toString() {
        result = "";
        result += date.toString();
        result += " " + hour + ":" + minute;
        return result;
    }
}
    void main() {
    }

