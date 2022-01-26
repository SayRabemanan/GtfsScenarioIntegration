package Readers;


public class Trips {
    private int route_id;
    private int service_id;
    private int direction_id;
    private int trip_id;

    public Trips(int route_id, int service_id, int direction_id, int trip_id){
        setDirection_id(direction_id);
        setRoute_id(route_id);
        setTrip_id(trip_id);
        setService_id(service_id);
    }

    public Trips(int route_id) {
        setRoute_id(route_id);
    }


    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public int getDirection_id() {
        return direction_id;
    }

    public void setDirection_id(int direction_id) {
        this.direction_id = direction_id;
    }



    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }
}
