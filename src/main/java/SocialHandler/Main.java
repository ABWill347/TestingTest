package SocialHandler;

public class Main {
    public static void main(String[] args) {
        Social social =new Social(new String[]{"@123"});
        social.checkHandle("@1232");

        System.out.println();
    }
}
