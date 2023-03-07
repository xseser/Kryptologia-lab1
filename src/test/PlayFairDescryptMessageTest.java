package test;

import org.junit.jupiter.api.Test;
import service.PlayFair;

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

    @Test
    public void descryptMessage9Test() {
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "DTGS";
        String trueRecord = "FREU";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage10Test() {
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "BB";
        String trueRecord = "PZPZ";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage11Test() {
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "BBAA";
        String trueRecord = "PZKMPW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage12Test() {
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "TOJESTSZYFRDOZLAMANIA";
        String trueRecord = "UNLDRSUXTKJAGUJPBMLHPW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage13Test() {
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "TOJESTSZYFRDOZLAMANIA";
        String trueRecord = "UNLDRSUXTKJAGUJPBMLHPW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage14Test() {
        String enctryptionKey = "mapka";
        String decryptedMessage = "";
        String encryptedMessage = "KRYPTOLOGIALABORATORIUMNUMERJEDEN";
        String trueRecord = "ATXKUNJNDOPJMKJUKRJUORKHQBDSLDCDLY";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage15Test() {
        String enctryptionKey = "kryptologia";
        String decryptedMessage = "";
        String encryptedMessage = "OT";
        String trueRecord = "AK";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage16Test() {
        String enctryptionKey = "mijadzien";
        String decryptedMessage = "";
        String encryptedMessage = "kopalniawegla";
        String trueRecord = "HLRMHCMJUBOKDW";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }

    @Test
    public void descryptMessage17Test() {
        String enctryptionKey = "tomaszimaja";
        String decryptedMessage = "";
        String encryptedMessage = "politechnikapoznanska";
        String trueRecord = "NMNZUZACFOHSNMJLOQYDXQ";

        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        decryptedMessage = odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage);
        assertEquals(trueRecord, decryptedMessage);
    }
}