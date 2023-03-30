

import java.util.Scanner;
public class meepo { /**
 * @param args
 */
public static void main(String[] args) {
    
  
   
    Scanner sc = new Scanner(System.in);
        
    String binaryText = "01110111 01101000 01111001 00100000 01100100 01101111 00100000 01110000 01110010 01101111 01100111 01110010 01100001 01101101 01101101 01100101 01110010 01110011 00100000 01110111 01100101 01100001 01110010 00100000 01100111 01101100 01100001 01110011 01110011 01100101 01110011 00111111";
    
    String translatedBinary = binaryToText(binaryText);
    System.out.print(translatedBinary + " ");
    String ans = sc.nextLine();

    if (ans.startsWith ("why")){
        String binaryjoke = "01100010 01100101 01100011 01100001 01110101 01110011 01100101 00100000 01110100 01101000 01100101 01111001 00100000 01100100 01101111 01101110 01110100 00100000 01000011 00100011 00100000 01001100 01001111 01001100 01001100 01001100 00101000 01101001 01100100 01101011 00100000 01110111 01101000 01100001 01110100 00100000 01110100 01101000 01100001 01110100 00100000 01101101 01100101 01100001 01101110 01110011 00101001 00100000 01110111 01101001 01101100 01101100 00100000 01110101 00100000 01100111 01101111 00100000 01110100 01101111 00100000 01110000 01110010 01101111 01101101 00100000 01110111 01101001 01110100 01101000 00100000 01101101 01100101 00111111";
        String translatedBinary1 = binaryToText(binaryjoke);
        System.out.print(translatedBinary1 + " no or okay: ");
        String ans1 = sc.nextLine();

        while (ans1.startsWith("n")) { 
            String binaryjoke2 = "01110000 01101100 01100101 01100001 01110011 01100101 00100000 01100111 01101001 01110110 01100101 00100000 01101101 01100101 00100000 01100001 00100000 01100011 01101000 01100001 01101110 01100011 01100101";
            String translatedBinary2 = binaryToText(binaryjoke2);
            System.out.println(translatedBinary2 + " no or okay: ");
            ans1 = sc.nextLine();

            if (ans1.startsWith("ok")){
                System.out.println("yipeee");
              }
      } 

      }
      else { 
        System.out.println(" say why ");
        ans = sc.nextLine();
      }
    
    sc.close();
   //i didnt code the bottom stuff
}

     public static String binaryToText(String binaryText) {
        String[] binaryNumbers = binaryText.split(" ");
        String text = "";
        for (String currentBinary : binaryNumbers) {
            int decimal = binaryToDecimal(currentBinary);
            char letra = (char) decimal;
            text += letra;
        }
        return text;
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int position = 0;
        for (int x = binary.length() - 1; x >= 0; x--) {
            short digit = 1;
            if (binary.charAt(x) == '0') {
                digit = 0;
            }
            double multiplier = Math.pow(2, position);
            decimal += digit * multiplier;
            position++;
        }
        return decimal;
    }

}