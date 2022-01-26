package Readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StopsReader {
    static List<Stops> stopsList = new ArrayList();

    public static void readData(String path){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String newLine;
            //read header
            String [] header = reader.readLine().split(",");
            int indexStopId = findIndexInArray("stop_id",header);
            int indexStopName = findIndexInArray("stop_name",header);
            int indexStopLat = findIndexInArray("stop_lat",header);
            int indexStopLon= findIndexInArray("stop_lon",header);
                //System.out.println(indexDirectionId);
                // read body
            int lineCounter = 1;

            while((newLine = reader.readLine())!=null){

                    String [] strArray = newLine.split(",");
                    int iD = Integer.parseInt (strArray[indexStopId]);
                    Stops stop = new Stops(iD);
                    //System.out.println("test + " + trip.getRoute_id());
                    stop.setStop_name(strArray[indexStopName]);
                    stop.setStop_lon(Integer.parseInt (strArray[indexStopLon]));
                    stop.setStop_lat(Integer.parseInt (strArray[indexStopLat]));

                    stopsList.add(stop);

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
