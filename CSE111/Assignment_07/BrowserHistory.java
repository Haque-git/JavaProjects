package CSE111.Assignment_07;

public class BrowserHistory {
    WebSite head;
    WebSite tale;
    int maxSize = 3;
    int count;
    
    public BrowserHistory(int maxSize) {
        this.maxSize = maxSize;
        this.head = null;
        this.tale = null;
        this.count = 0;
    }

    public void visitWeb(String url) {
        if (this.count >= this.maxSize) {
            System.out.printf("History is full. Cannot visit %s web page\n", url);
            return;
        }
        WebSite newWebSide = new WebSite(url);
        if (this.head == null) {
            this.head = newWebSide;
            this.tale = newWebSide;
        } else {
            newWebSide.prev = this.tale;
            this.tale.next = newWebSide;
            this.tale = newWebSide;
        }
        System.out.println("Visited: "+ url);
        this.count++;
    }

    public void showHistory() {
        if (this.head == null) {
            System.out.println("No web pages visited yet.");
            return;
        }
        WebSite currSite = this.head;
        System.out.println("Browser History:");
        while (currSite != null) {
            System.out.println(currSite.getUrl());
            currSite = currSite.next;
        }
    }
    
    public void currentWeb() {
        if (this.tale == null) {
            System.out.println("You have not visited any website yet!");
            return;
        }
        System.out.printf("Current web page: %s\n", tale.getUrl());
    }

    public void back() {
        if (this.head == null) {
            return;
        }
        if (this.head == this.tale) {
            this.head = null;
            this.tale = null;
        } else {
            this.tale = this.tale.prev;
            this.tale.next = null;
        }
        this.count--;
    }
}
