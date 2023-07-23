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





        public static String convertToRomeNumbers(int num) {
            String romeNumber = null;
            switch (num) {
                case 1:
                    romeNumber = "I";
                    break;
                case 2:
                    romeNumber = "II";
                    break;
                case 3:
                    romeNumber = "III";
                    break;
                case 4:
                    romeNumber = "IV";
                    break;
                case 5:
                    romeNumber = "V";
                    break;
                case 6:
                    romeNumber = "VI";
                    break;
                case 7:
                    romeNumber = "VII";
                    break;
                case 8:
                    romeNumber = "VIII";
                    break;
                case 9:
                    romeNumber = "IX";
                    break;
                case 10:
                    romeNumber = "X";
                    break;
            }
            return romeNumber;
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

                if (var1 < var2) throw new IOException();

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
                System.out.println(convertToRomeNumbers(result));
            }









        }
    }

