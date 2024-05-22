package SocialHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocialTest {

    @Test
    void checkHandleTest() {
        Social social =new Social(new String[]{"@123"});
       boolean expected =true;
       boolean actual=social.checkHandle("@123");
       assertEquals(expected,actual);

    }

    @Test
    void checkHandleLessThan9CharactersTest() {
        Social social =new Social(new String[]{"@123"});
        int expected=4;
     int actual=  social.checkHandleLessThan9Characters();
     assertEquals(expected,actual);
    }

    @Test
    void checkEmptyOrBlankCharactersTest() {
        Social social =new Social(new String[]{"45"});
        boolean expected=true;
        boolean actual= social.checkEmptyOrBlankCharacters();
        assertEquals(expected,actual);
    }


}