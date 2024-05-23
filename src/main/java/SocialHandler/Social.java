package SocialHandler;

import java.util.ArrayList;
import java.util.List;

public class Social {
    private ArrayList<String> handle;

    public Social(String[] handle) {
        this.handle = new ArrayList<>(List.<String>of(handle));
    }

    public ArrayList<String> getHandle() {
        return handle;
    }

    public void setHandle(ArrayList<String> handle) {
        this.handle = handle;
    }

    public boolean checkHandle(String newHandle){
        boolean contains = handle.contains(newHandle);
        System.out.println(contains);

        return contains;
    }
    public int checkHandleLessThan9Characters(){
        int totalCharacters=0;
        for (String s:handle){
            totalCharacters+=s.length();
        }
        if (totalCharacters>=10){
            System.out.println("Too many characters, must be less then 10");
        }
        System.out.println("The total number of characters are :"+totalCharacters);
        return totalCharacters;
    }
    public boolean checkEmptyOrBlankCharacters(){
        if (handle.isEmpty()){
            System.out.println("You must enter a handle!");
        }else {
            System.out.println("Thank you for entering a valid handle!");
        }
        return true;
    }
    public void addHandle(String newHandle){
        handle.add(newHandle);
    }
    public void removeHandle(String oldHandle){
        handle.remove(oldHandle);
    }
    public void updateHandle(String oldHandle,String newHandle){
        int index=handle.indexOf(oldHandle);
        if(index!=-1){
            handle.set(index,newHandle);
        }

    }
    public String showAllHandles(){
        for ( String h :handle){
            System.out.println(h);
        }
        return "";
    }
}
