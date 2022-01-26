package Readers;

public class Stops {
    public String stop_name;
    public int stop_id;
    public double stop_lat;
    public double stop_lon;

    public Stops(String stop_name, int stop_id, double stop_lat, double stop_lon){
        setStop_name(stop_name);
        setStop_id(stop_id);
        setStop_lat(stop_lat);
        setStop_lon(stop_lon);
    }

    public Stops(int stop_id) {
        setStop_id(stop_id);
    }

    public int getStop_id() {
        return stop_id;
    }

    public void setStop_id(int stop_id) {
        this.stop_id = stop_id;
    }

    public double getStop_lat() {
        return stop_lat;
    }

    public void setStop_lat(double stop_lat) {
        this.stop_lat = stop_lat;
    }

    public double getStop_lon() {
        return stop_lon;
    }

    public void setStop_lon(double stop_lon) {
        this.stop_lon = stop_lon;
    }

    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }
}
