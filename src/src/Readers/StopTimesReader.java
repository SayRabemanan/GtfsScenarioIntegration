package Readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StopTimesReader {
    static List<Stoptimes> stoptimesList = new ArrayList();

    public static void readData(String path){
        try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String newLine;
                //read header
                String [] header = reader.readLine().split(",");
                int indexStopId = findIndexInArray("stop_id",header);
                int indexDepart = findIndexInArray("departure_time",header);
                int indexArrival = findIndexInArray("arrival_time",header);
                int indexStopSeq = findIndexInArray("stop_sequence",header);
                int indexTripId= findIndexInArray("trip_id",header);
                int indexPickUp= findIndexInArray("pickup_type",header);
                int indexDropoff = findIndexInArray("drop_off_type",header);
                //System.out.println(indexDirectionId);
                // read body
                int lineCounter = 1;

                while((newLine = reader.readLine())!=null){

                    String [] strArray = newLine.split(",");
                    int iD = Integer.parseInt (strArray[indexTripId]);
                    Stoptimes stoptimes = new Stoptimes(iD);
                    //System.out.println("test + " + trip.getRoute_id());
                    stoptimes.setStop_id(Integer.parseInt (strArray[indexStopId]));
                    stoptimes.setDeparture_time(strArray[indexDepart]);
                    stoptimes.setArrival_time(strArray[indexArrival]);
                    stoptimes.setDrop_off_type(Integer.parseInt (strArray[indexDropoff]));
                    stoptimes.setPickup_type(Integer.parseInt (strArray[indexPickUp]));
                    stoptimes.setStop_sequence(Integer.parseInt (strArray[indexStopSeq]));

                    stoptimesList.add(stoptimes);

                    lineCounter++;

                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            } catch (IOException e) {
                System.out.println("IO Exception at " + path);
            }
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


