import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;


public class Main {


    public static String[] loadData(String input) {
        String[] array = input.split(" ");
        return array;
    }


    public static int convertToArabNumbers(String arg) throws IOException {
        int arabNum = 0;
        switch (arg) {
            case "I":
                arabNum = 1;
                break;
            case "II":
                arabNum = 2;
                break;
            case "III":
                arabNum = 3;
                break;
            case "IV":
                arabNum = 4;
                break;
            case "V":
                arabNum = 5;
                break;
            case "VI":
                arabNum = 6;
                break;
            case "VII":
                arabNum = 7;
                break;
            case "VIII":
                arabNum = 8;
                break;
            case "IX":
                arabNum = 9;
                break;
            case "X":
                arabNum = 10;
                break;
            default: throw new IOException();
        }
        return arabNum;
    }








    public static String convertToRomeNumbersFull(int num) {
        String[] romeNumber = new String[2];
        int[] digit = new int[2];
        digit[1] = num/10;
        digit[0] = num%10;

        switch (digit[1]){
            case 0: romeNumber[1] = "";break;
            case 1: romeNumber[1] = "X";break;
            case 2: romeNumber[1] = "XX";break;
            case 3: romeNumber[1] = "XXX";break;
            case 4: romeNumber[1] = "XL";break;
            case 5: romeNumber[1] = "L";break;
            case 6: romeNumber[1] = "LX";break;
            case 7: romeNumber[1] = "LXX";break;
            case 8: romeNumber[1] = "LXXX";break;
            case 9: romeNumber[1] = "XC";break;
            case 10: romeNumber[1] = "C";break;
        }

        switch (digit[0]){
            case 1: romeNumber[0] = "I";break;
            case 2: romeNumber[0] = "II";break;
            case 3: romeNumber[0] = "III";break;
            case 4: romeNumber[0] = "IV";break;
            case 5: romeNumber[0] = "V";break;
            case 6: romeNumber[0] = "VI";break;
            case 7: romeNumber[0] = "VII";break;
            case 8: romeNumber[0] = "VIII";break;
            case 9: romeNumber[0] = "IX";break;
            case 0: romeNumber[0] = "";break;
        }


        return romeNumber[1]+romeNumber[0];
    }


        public static void main (String[]args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            String[] array = loadData(input);
            if(array.length!=3) throw new IOException();
          if(!array[1].equals("*")  && !array[1].equals("+") && !array[1].equals("-") && !array[1].equals("/") ) throw new IOException();

            int result = 0;
            int var1 = 0;
            int var2 = 0;


            try {

                var1 = Integer.parseInt(array[0]);
                var2 = Integer.parseInt(array[2]);
                if (var1 < 1 || var1 > 10 || var2 < 1  || var2 > 10) throw new IOException();

                    switch (array[1]) {
                        case "+":
                            result = var1 + var2;
                            break;
                        case "-":
                            result = var1 - var2;
                            break;
                        case "*":
                            result = var1 * var2;
                            break;
                        case "/":
                            result = var1 / var2;
                            break;
                    }
               System.out.println(result);
            }
            catch (NumberFormatException e) {
                var1 = convertToArabNumbers(array[0]);
                var2 = convertToArabNumbers(array[2]);



                switch (array[1]) {
                    case "+":
                        result = var1 + var2;
                        break;
                    case "-":
                        result = var1 - var2;
                        break;
                    case "*":
                        result = var1 * var2;
                        break;
                    case "/":
                        result = var1 / var2;
                        break;

                }
                if (result < 0) throw new IOException();
                System.out.println(convertToRomeNumbersFull(result));
            }

        }
    }

