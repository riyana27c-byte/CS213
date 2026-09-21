public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;
    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;
    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUARTERCENTENNIAL = 400;

    public Date(){
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month =month;
        this.day = day;
    }
    private boolean isLeap(){
        if (year % QUADRENNIAL == 0){
            if(year % CENTENNIAL == 0){
                if(year % QUARTERCENTENNIAL == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isValid() {
        if(month < MIN_MONTH){
            return false;
        }
        if(month > MAX_MONTH){
            return false;
        }
        if(day < 1){
            return false;
        }
        if()
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if(!(obj.getClass() == Date.class)){
            return false;
        }
        Date other = (Date)obj;
        if(year == other.year && month == other.month && day == other.day){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Date obj) {
            if(year < obj.year){
                return -1;
            }
            if(year > obj.year){
                return 1;
            }
            if(month < obj.month){
                return -1;
            }
            if(month > obj.month){
                return 1;
            }
            if(day < obj.day){
                return -1;
            }
            if(day > obj.day){
                return 1;
            }
            return 0;
    }
    @Override
    public String toString() {
        return (year + "-" + month + "-" + day);
    }
}
