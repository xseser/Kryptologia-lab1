public class Main {
    public static void main(String[] args) {
        // szyfrowanie wiadomosci.
        // https://planetcalc.com/7751/


        String encryptedMessage = "";
        String decryptedMessage = "ff";
        String enctryptionKey = "mapka";

//        PlayFair szyfruj = new PlayFair();
//        szyfruj.fillGaps(enctryptionKey);
//        szyfruj.displayChars();
//        System.out.println(szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage));


        enctryptionKey = "mapka";
        decryptedMessage = "";
        encryptedMessage = "XX";
        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        odszyfruj.displayChars();
        System.out.println(odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage));

    }
}