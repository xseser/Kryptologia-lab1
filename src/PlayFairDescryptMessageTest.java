import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlayFairDescryptMessageTest {

    @Test
    public void descryptMessage1Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "kb";
        String trueRecord = "PK";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage2Test() { // po y
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "Kt";
        String trueRecord = "YN";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }
    @Test
    public void descryptMessage3Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "WX";
        String trueRecord = "VW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage4Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "vwxw";
        String trueRecord = "ZVWV";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage5Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "ww";
        String trueRecord = "VWVW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    @Disabled
    public void descryptMessage6Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "VVWW";
        String trueRecord = "ZWZVVW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }
    @Test
    public void descryptMessage7Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "FS";
        String trueRecord = "ET";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage8Test() { // po x
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "XX";
        String trueRecord = "WWWW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }



}