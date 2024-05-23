package SocialHandler;

public class Main {
    public static void main(String[] args) {
        Social social =new Social(new String[]{"@123"});
        social.addHandle("12345");

social.removeHandle("12345");
social.addHandle("@12454");

        social.updateHandle("@12454","@789");
        social.showAllHandles();

    }
}
