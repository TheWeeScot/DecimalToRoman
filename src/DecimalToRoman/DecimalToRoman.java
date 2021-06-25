package DecimalToRoman;

import com.sun.jdi.InvalidTypeException;

public class DecimalToRoman  {

    private final int originalDecimal;
    private int remainingDecimal;
    private String roman = "";

    public DecimalToRoman(int number) throws InvalidTypeException {
        if (number < 0) throw new InvalidTypeException();
        originalDecimal = number;
        remainingDecimal = number;
    }

    public String getRoman()  {
        if (originalDecimal == 0) return "";

        while (remainingDecimal > 0) {
            do ; while (extract(1000, "M"));
            do ; while (extract(900, "CM"));
            do ; while (extract(500, "D"));
            do ; while (extract(400, "CD"));
            do ; while (extract(100, "C"));
            do ; while (extract(90, "XC"));
            do ; while (extract(50, "L"));
            do ; while (extract(40, "XL"));
            do ; while (extract(10, "X"));
            do ; while (extract(9, "IX"));
            do ; while (extract(5, "V"));
            do ; while (extract(4, "IV"));
            do ; while (extract(1, "I"));
        }
        return roman;
    }

    private boolean extract(int decimal, String romanPart) {
        if (remainingDecimal >= decimal) {
            roman += romanPart;
            remainingDecimal -= decimal;
            return true;
        }
        return false;
    }
}
