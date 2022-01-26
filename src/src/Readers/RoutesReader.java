package Readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoutesReader {
        static List<Routes> routesList = new ArrayList();

        public static void readData(String path){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String newLine;
                //read header
                String [] header = reader.readLine().split(",");
                int indexRouteId = findIndexInArray("route_id",header);
                int indexRouteLonName = findIndexInArray("route_long_name",header);
                int indexRouteShortName = findIndexInArray("route_short_name",header);
                int indexRouteType= findIndexInArray("route_type",header);
                int indexAgencyId= findIndexInArray("agency_id",header);
                //System.out.println(indexDirectionId);
                // read body
                int lineCounter = 1;

                while((newLine = reader.readLine())!=null){

                    String [] strArray = newLine.split(",");
                    int iD = Integer.parseInt (strArray[indexRouteId]);
                    Routes route = new Routes(iD);
                    //System.out.println("test + " + trip.getRoute_id());
                    route.setRoute_long_name(Integer.parseInt (strArray[indexRouteLonName]));
                    route.setRoute_type(Integer.parseInt (strArray[indexRouteType]));
                    route.setAgency_id(Integer.parseInt (strArray[indexAgencyId]));
                    route.setRoute_short_name(Integer.parseInt (strArray[indexRouteShortName]));

                    routesList.add(route);

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
