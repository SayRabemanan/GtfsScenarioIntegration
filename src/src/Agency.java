public class Agency {
    private int agency_id;
    private String agency_name;
    private String agency_timezone;
    private String agency_lang;

    public Agency (int agency_id, String agency_name, String agency_timezone, String agency_lang){
        setAgency_id(agency_id);
        setAgency_name(agency_name);
        setAgency_timezone(agency_timezone);
        setAgency_lang(agency_lang);
    }

    public int getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(int agency_id) {
        this.agency_id = agency_id;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getAgency_timezone() {
        return agency_timezone;
    }

    public void setAgency_timezone(String agency_timezone) {
        this.agency_timezone = agency_timezone;
    }

    public String getAgency_lang() {
        return agency_lang;
    }

    public void setAgency_lang(String agency_lang) {
        this.agency_lang = agency_lang;
    }



}

