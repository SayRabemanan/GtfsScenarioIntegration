package Readers;

public class Run {
    public static void main(String[] args) {
        TripsReader.readData("C:/Users/msm/Documents/Uni/Project Seminar/Data/GTFS/smallerLatest/trips.txt");
        System.out.println(TripsReader.tripsList.get(2530).getRoute_id());
    }
}
