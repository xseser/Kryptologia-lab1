package test;

import org.junit.jupiter.api.Test;
import service.PlayFair;

import static org.junit.jupiter.api.Assertions.*;

class PlayFairHideMessageTest {
    @Test
    public void hideMessage1Test() {
        String encryptedMessage = "";
        String decryptedMessage = "kb";
        String enctryptionKey = "mapka";
        String trueRecord = "BM";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage2Test() {
        String encryptedMessage = "";
        String decryptedMessage = "ff";
        String enctryptionKey = "mapka";
        String trueRecord = "EYEY";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage3Test() {
        String encryptedMessage = "";
        String decryptedMessage = "ee";
        String enctryptionKey = "mapka";
        String trueRecord = "LPLP";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage4Test() {
        String encryptedMessage = "";
        String decryptedMessage = "ww";
        String enctryptionKey = "mapka";
        String trueRecord = "XYXY";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage5Test() {
        String encryptedMessage = "";
        String decryptedMessage = "fn";
        String enctryptionKey = "mapka";
        String trueRecord = "NT";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage6Test() {
        String encryptedMessage = "";
        String decryptedMessage = "ar";
        String enctryptionKey = "mapka";
        String trueRecord = "DW";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage7Test() {
        String encryptedMessage = "";
        String decryptedMessage = "nr";
        String enctryptionKey = "mapka";
        String trueRecord = "JT";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage8Test() {
        String encryptedMessage = "";
        String decryptedMessage = "vb";
        String enctryptionKey = "mapka";
        String trueRecord = "ZM";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage9Test() {
        String encryptedMessage = "";
        String decryptedMessage = "cf";
        String enctryptionKey = "mapka";
        String trueRecord = "DG";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage10Test() {
        String encryptedMessage = "";
        String decryptedMessage = "xx";
        String enctryptionKey = "mapka";
        String trueRecord = "YYYY";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage11Test() {
        String encryptedMessage = "";
        String decryptedMessage = "fujwaansk";
        String enctryptionKey = "mapka";
        String trueRecord = "GTRAPWKJTP";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage12Test() {
        String encryptedMessage = "";
        String decryptedMessage = "px";
        String enctryptionKey = "mapka";
        String trueRecord = "EP";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage13Test() {
        String encryptedMessage = "";
        String decryptedMessage = "a b";
        String enctryptionKey = "mapka";
        String trueRecord = "PM";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage14Test() {
        String encryptedMessage = "";
        String decryptedMessage = "XXX";
        String enctryptionKey = "mapka";
        String trueRecord = "YYYYYY";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage15Test() {
        String encryptedMessage = "";
        String decryptedMessage = "mam pm";
        String enctryptionKey = "mapka";
        String trueRecord = "APAKPV";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage16Test() {
        String encryptedMessage = "";
        String decryptedMessage = "krypotologia to fajny przedmiot";
        String enctryptionKey = "mapka";
        String trueRecord = "ATXKNUHNUORDUNDKLOXKUWFEAHNU";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage17Test() {
        String encryptedMessage = "";
        String decryptedMessage = "to jest Przykladowy tekst ktory ma za zadanie sprawdzic jak dziala kod";
        String enctryptionKey = "mapka";
        String trueRecord = "UNLDTUASVZPNDJJZKYFPTUFYJUVKBWBWDJKJLDXEWDAJWODHPBGWRDJPBNEW";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage18Test() {
        String encryptedMessage = "";
        String decryptedMessage = "AAVV";
        String enctryptionKey = "mapka";
        String trueRecord = "PWMWWY";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

    @Test
    public void hideMessage19Test() {
        String encryptedMessage = "";
        String decryptedMessage = "kopalniawegla";
        String enctryptionKey = "mijadzien";
        String trueRecord = "LGRMHCADUBHODW";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }
    @Test
    public void hideMessage20Test() {
        String encryptedMessage = "";
        String decryptedMessage = "politechnikapoznanska";
        String enctryptionKey = "tomaszimaja";
        String trueRecord = "NMNZZLHQVFHSNMJLOQDRCA";

        PlayFair szyfruj = new PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        encryptedMessage = szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage);
        assertEquals(trueRecord, encryptedMessage);
    }

}