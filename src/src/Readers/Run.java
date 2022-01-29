package Readers;

import java.util.List;

public class Run {
    static List<Trips> trips;
    static List<Stops> stops;
    static List<Stops> newStops;
    public static void main(String[] args) {
        trips = TripsReader.readData("C:/Users/msm/Documents/Uni/Project Seminar/Data/merged_gtfs/trips.txt");

        Trips newTrip = new Trips();
        setNewTripIdentifiers(newTrip);
        trips.add(newTrip);
        newStops = StopsReader.readData("C:/Users/msm/Documents/Uni/Project Seminar/Data/newLine1.txt");
        stops = StopsReader.readData("C:/Users/msm/Documents/Uni/Project Seminar/Data/merged_gtfs/stops_corrected.txt");

        System.out.println("New Line Stop list size " + newStops.get(stops.size()-1));
        System.out.println("Total number of stops existing already " + stops.size());

        for (Stops stopOld: stops){
            int index = 1;
            for(Stops stopNew:newStops){
                double lat1 = stopNew.getStop_lat();
                double lon1 = stopNew.getStop_lon();
                double lat2 = stopOld.getStop_lat();
                double lon2 = stopOld.getStop_lon();
                double dist = getDistanceFromLatLonInKm(lat1,lon1,lat2,lon2);
                //if distance between points smaller than 150m beeline
                if (dist<1.15){
                    System.out.println("new stop is same as an old.Distance is " +dist);
                   newStops.get(index).setStop_name(stopOld.getStop_name());
                   newStops.get(index).setStop_id(stopOld.getStop_id());
                   newStops.get(index).setStop_lat(stopOld.getStop_lat());
                   newStops.get(index).setStop_lon(stopOld.getStop_lon());
                }


            }index++;
        }
        //List<Stops> newStopList;
        //Stops newStop1 = new Stops("lineG12_1",99999,)
    }

    public static void setNewTripIdentifiers(Trips newTrip){
        Trips lastTrip = new Trips();
        if (trips.size()>=1){
            lastTrip = trips.get(trips.size()-1);
            newTrip.setRoute_id(lastTrip.getRoute_id()+1);
            int maxTripId =1;
            for (Trips singleTrip :trips){
                if(maxTripId < singleTrip.getTrip_id()){
                    maxTripId =singleTrip.getTrip_id();
                }
            }
            newTrip.setTrip_id(maxTripId+1);
            newTrip.setService_id(999);
            newTrip.setDirection_id(0);
        }

    }
    public static double getDistanceFromLatLonInKm(double lat1, double lon1, double lat2, double lon2) {
        int R = 6371; // Radius of the earth in km
        double dLat = deg2rad(lat2-lat1);  // deg2rad below
        double dLon = deg2rad(lon2-lon1);
        double a =
                Math.sin(dLat/2) * Math.sin(dLat/2) +
                        Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) *
                                Math.sin(dLon/2) * Math.sin(dLon/2)
                ;
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = R * c; // Distance in km
        return d;
    }

    public static double deg2rad(double deg) {
        return deg * (Math.PI/180);
    }
}
