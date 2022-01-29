package Readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TripsReader {
    static List<Trips> tripsList = new ArrayList();

        public static List<Trips> readData(String path){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String newLine;
                //read header
                String [] header = reader.readLine().split(",");
                int indexRouteId = findIndexInArray("route_id",header);
                int indexServiceId = findIndexInArray("service_id",header);
                int indexDirectionId = findIndexInArray("direction_id",header);
                int indexTripId = findIndexInArray("trip_id",header);
                //System.out.println(indexDirectionId);
                // read body
                int lineCounter = 1;

                while((newLine = reader.readLine())!=null){

                    String [] strArray = newLine.split(",");
                    int test = Integer.parseInt (strArray[indexRouteId]);
                    Trips trip = new Trips(test);
                    //System.out.println("test + " + trip.getRoute_id());
                    trip.setTrip_id(Integer.parseInt (strArray[indexTripId]));
                    trip.setDirection_id(Integer.parseInt (strArray[indexDirectionId]));
                    trip.setService_id(Integer.parseInt (strArray[indexServiceId]));

                    tripsList.add(trip);

                    lineCounter++;

                }

            } catch (FileNotFoundException e) {
                System.out.println("Trip File not found!");
            } catch (IOException e) {
                System.out.println("IO Exception at " + path);
            }
            return tripsList;
        }

        private static int findIndexInArray(String columnName, String[] header) {
            int position = -1;
            for (int a =0; a<header.length;a++){
                if(header[a].equalsIgnoreCase(columnName)){
                    position = a;
                    //System.out.println(position);
                }
            }

            if (position == -1){
                throw new RuntimeException("Could not find column called: " + columnName);
            }
            return position;
        }
    }


