package CSE111.Assignment_07;

public class WebSite {
    private String url;

    WebSite next;
    WebSite prev;

    public WebSite(String url) {
        this.url = url;
        this.next = null;
        this.prev = null;
    }

    public String getUrl() {
        return this.url;
    }
}