package service;

import service.PlayFair;

public class Main {
    public static void main(String[] args) {
        // https://planetcalc.com/7751/

        // szyfrowanie wiadomosci.
        String encryptedMessage = "";
        String decryptedMessage = "playfair";
        String enctryptionKey = "krypto";
        service.PlayFair szyfruj = new service.PlayFair();
        szyfruj.fillGaps(enctryptionKey);
        szyfruj.displayChars();
        System.out.println(szyfruj.hideMessage(szyfruj.bothCharsSame(decryptedMessage), encryptedMessage));

        //odszyfrowywanie wiadomosci
        enctryptionKey = "krypto";
        decryptedMessage = "";
        encryptedMessage = "playfair";
        PlayFair odszyfruj = new PlayFair();
        odszyfruj.fillGaps(enctryptionKey);
        odszyfruj.displayChars();
        System.out.println(odszyfruj.descryptMessage(odszyfruj.bothCharsSame(encryptedMessage), decryptedMessage));

    }
}