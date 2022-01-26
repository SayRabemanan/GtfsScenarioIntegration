package Readers;

public class Routes {

    public int routesId;
    public int route_long_name;
    public int route_short_name;
    public int route_type;
    public int agency_id;

    public Routes(int routesId, int route_long_name, int route_short_name, int route_type, int agency_id){
        setRoute_long_name(route_long_name);
        setRoute_short_name(route_short_name);
        setAgency_id(agency_id);
        setRoute_type(route_type);
        setRoutesId(routesId);

    }

    public Routes(int routesId) {
        setRoute_long_name(route_long_name);
    }

    public void setRoutesId(int routesId) {
        this.routesId = routesId;
    }

    public int getRoutesId() {
        return routesId;
    }

    public int getRoute_long_name() {
        return route_long_name;
    }

    public void setRoute_long_name(int route_long_name) {
        this.route_long_name = route_long_name;
    }

    public int getRoute_short_name() {
        return route_short_name;
    }

    public void setRoute_short_name(int route_short_name) {
        this.route_short_name = route_short_name;
    }

    public int getRoute_type() {
        return route_type;
    }

    public void setRoute_type(int route_type) {
        this.route_type = route_type;
    }

    public int getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(int agency_id) {
        this.agency_id = agency_id;
    }

 /*   public Location getCompanyLocation (String companyId){
            return this.getLocation();
        }
        public String getCompanyId() {
            return companyId;
        }
*/

}


