package Readers;

public class Stoptimes {
    private int trip_id;
    private String arrival_time;
    private String departure_time;
    private int stop_id;
    private int stop_sequence;
    private Integer pickup_type;
    private Integer drop_off_type;

    public Stoptimes(int trip_id, String arrival_time, String departure_time, int stop_id, int stop_sequence){
        setTrip_id(trip_id);
        setArrival_time(arrival_time);
        setDeparture_time(departure_time);
        setStop_id(stop_id);
        setStop_sequence(stop_sequence);
        setPickup_type(null);

    }

    public Stoptimes(int trip_id) {
        setTrip_id(trip_id);
    }

    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public int getStop_id() {
        return stop_id;
    }

    public void setStop_id(int stop_id) {
        this.stop_id = stop_id;
    }

    public int getStop_sequence() {
        return stop_sequence;
    }

    public void setStop_sequence(int stop_sequence) {
        this.stop_sequence = stop_sequence;
    }

    public int getPickup_type() {
        return pickup_type;
    }

    public void setPickup_type(Integer pickup_type) {
        this.pickup_type = pickup_type;
    }

    public int getDrop_off_type() {
        return drop_off_type;
    }

    public void setDrop_off_type(Integer drop_off_type) {
        this.drop_off_type = drop_off_type;
    }




}
