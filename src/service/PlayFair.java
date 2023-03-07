package service;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class PlayFair {
    //i = j

    char[][] tab = new char[5][5];

    public PlayFair() {
        prepareCube();
    }

    public void prepareCube() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = '/';
            }
        }
    }

    public void displayChars() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tab[i][j] + "   ");
                if (j == 4) System.out.println("\n");
            }
        }
    }

    public boolean fillGaps(String string) {
        int asciiValue = 65;
        int iteration = 0;
        string = string.toUpperCase();
        string = string.replaceAll("I", "J");

        int x = 0;
        int y = 0;
        int stringLength = string.length();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (iteration < stringLength) {
                    if (tab[i][j] == '/') {
                        if (!checkIfExists(string.charAt(iteration))) {
                            putWord(x, y, string.charAt(iteration));
                            y++;
                            if (y == 5) {
                                x++;
                                y = 0;
                            }
                            iteration++;
                        } else {
                            iteration++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asciiValue == 73) {
                    asciiValue = 74;
                }
                if (!checkIfExists((char) asciiValue)) {
                    putWord(x, y, (char) asciiValue);
                    asciiValue++;
                    y++;
                    if (y == 5) {
                        x++;
                        y = 0;
                        if (x == 5) {
                            return false;
                        }
                    }
                } else {
                    asciiValue++;
                }
            }
        }
        return true;
    }

    public void putWord(Integer i, Integer j, Character character) {
        tab[i][j] = character;
    }


    public Boolean checkIfExists(Character character) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tab[i][j] == character) return true;
            }
        }
        return false;
    }

    public String[] arrayParser(String str) {
        str = str.toUpperCase();
        str = str.replaceAll(" ", "");
        str = str.replaceAll("I", "J");

        int len = str.length();
        String[] result = new String[len / 2];
        for (int i = 0, j = 0; i < len; i += 2, j++) {
            result[j] = str.substring(i, i + 2); // wyciągnięcie podciągu dwuznakowego
        }
        return result;
    }

    public String bothCharsSame(String str) {
        str = str.replaceAll(" ", "");
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (i < length-1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str = str.substring(0, i + 1) + 'X' + str.substring(i + 1);
                }
            }
        }
//        System.out.println(str);
        return str;
    }

    public String hideMessage(String str, String encryptedMessage) {
        int keyIndex = 0;
        int len = str.length();
        if (len % 2 != 0) {
            str += 'X';
        }
        String[] list = arrayParser(str);
        char varA = ' ';
        char varB = ' ';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                varA = (list[keyIndex].charAt(0));
                varB = (list[keyIndex].charAt(1));
            }
        }
        int xA = returnX(varA);
        int yA = returnY(varA);
        int xB = returnX(varB);
        int yB = returnY(varB);

        if (tab[yA][xA] == 'X' && tab[yB][xB] == 'X') {
            xA++;
            xB++;
        } else if (xA != xB && yA == yB) {
            xA += 1;
            xB += 1;
        } else if (yA != yB && xA == xB) {
            yA += 1;
            yB += 1;
        } else if (yA != yB && xA != xB) {
            int tempXA = xA;
            int tempXB = xB;
            xA = tempXB;
            xB = tempXA;
        }

        xA = valueParser(xA);
        xB = valueParser(xB);
        yA = valueParser(yA);
        yB = valueParser(yB);
        encryptedMessage += tab[yA][xA];
        encryptedMessage += tab[yB][xB];
        str = str.substring(2);
        if (str.length() > 0) return hideMessage(str, encryptedMessage);

//        System.out.println(xA + "     " + xB);
//        System.out.println(yA + "     " + yB);
        return encryptedMessage;
    }

    public Integer valueParser(int x) {
        if (x > 4) {
            x -= 5;
        }
        if (x < 0) {
            x += 5;
        }
        return x;
    }

    public Integer returnX(Character character) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (character == tab[i][j]) {
                    return j;
                }
            }
        }
        return -1;
    }

    public Integer returnY(Character character) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (character == tab[i][j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public String descryptMessage(String str, String descryptedMessage) {
        int keyIndex = 0;
        int len = str.length();
        if (len % 2 != 0) {
            str += 'X';
        }
        String[] list = arrayParser(str);
        char varA = ' ';
        char varB = ' ';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                varA = (list[keyIndex].charAt(0));
                varB = (list[keyIndex].charAt(1));
            }
        }
        int xA = returnX(varA);
        int yA = returnY(varA);
        int xB = returnX(varB);
        int yB = returnY(varB);

        if (tab[yA][xA] == 'X' && tab[yB][xB] == 'X') {
            xA--;
            xB--;
        } else if (xA != xB && yA == yB) {
            xA -= 1;
            xB -= 1;
        } else if (yA != yB && xA == xB) {
            yA -= 1;
            yB -= 1;
        } else if (yA != yB && xA != xB) {
            int tempXA = xA;
            int tempXB = xB;
            xA = tempXB;
            xB = tempXA;
        }

        xA = valueParser(xA);
        xB = valueParser(xB);
        yA = valueParser(yA);
        yB = valueParser(yB);
        descryptedMessage += tab[yA][xA];
        descryptedMessage += tab[yB][xB];
        str = str.substring(2);
        if (str.length() > 0) return descryptMessage(str, descryptedMessage);

//        System.out.println(xA + "     " + xB);
//        System.out.println(yA + "     " + yB);
        return descryptedMessage;
    }
}
