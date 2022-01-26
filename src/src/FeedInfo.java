public class FeedInfo {
    private String feed_publisher_name;
    private String feed_publisher_url;
    private String feed_lang;
    private int feed_start_date;
    private int feed_end_date;
    private String feed_version;
    private String feed_contact_email;
    private String feed_contact_url;

    public FeedInfo(String feed_publisher_name, String feed_publisher_url, String feed_lang, int feed_start_date, int feed_end_date, String feed_version, String feed_contact_email, String feed_contact_url) {
        setFeed_publisher_name(feed_publisher_name);
        setFeed_publisher_url(feed_publisher_url);
        setFeed_lang(feed_lang);
        setFeed_start_date(feed_start_date);
        setFeed_end_date(feed_end_date);
        setFeed_version(feed_version);
        setFeed_contact_email(feed_contact_email);
        setFeed_contact_url(feed_contact_url);
    }


    public int getFeed_end_date() {
        return feed_end_date;
    }

    public void setFeed_end_date(int feed_end_date) {
        this.feed_end_date = feed_end_date;
    }

    public String getFeed_version() {
        return feed_version;
    }

    public void setFeed_version(String feed_version) {
        this.feed_version = feed_version;
    }

    public String getFeed_contact_email() {
        return feed_contact_email;
    }

    public void setFeed_contact_email(String feed_contact_email) {
        this.feed_contact_email = feed_contact_email;
    }

    public String getFeed_contact_url() {
        return feed_contact_url;
    }

    public void setFeed_contact_url(String feed_contact_url) {
        this.feed_contact_url = feed_contact_url;
    }

    public String getFeed_lang() {
        return feed_lang;
    }

    public void setFeed_lang(String feed_lang) {
        this.feed_lang = feed_lang;
    }

    public int getFeed_start_date() {
        return feed_start_date;
    }

    public void setFeed_start_date(int feed_start_date) {
        this.feed_start_date = feed_start_date;
    }

    public String getFeed_publisher_url() {
        return feed_publisher_url;
    }

    public void setFeed_publisher_url(String feed_publisher_url) {
        this.feed_publisher_url = feed_publisher_url;
    }

    public String getFeed_publisher_name() {
        return feed_publisher_name;
    }

    public void setFeed_publisher_name(String feed_publisher_name) {
        this.feed_publisher_name = feed_publisher_name;
    }
}
