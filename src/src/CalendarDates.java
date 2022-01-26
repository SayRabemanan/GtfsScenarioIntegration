public class CalendarDates {
    private int service_id;
    private int exception_type;
    private int date;

    public CalendarDates(int service_id, int exception_type, int date) {
        setService_id(service_id);
        setException_type(exception_type);
        setDate(date);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getException_type() {
        return exception_type;
    }

    public void setException_type(int exception_type) {
        this.exception_type = exception_type;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }
}
