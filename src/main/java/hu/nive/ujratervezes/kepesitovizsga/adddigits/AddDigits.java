package hu.nive.ujratervezes.kepesitovizsga.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int sum = 0;
        if(isEmpty(input)) {
            return -1;
        }
        for(char c : input.toCharArray()) {
            if(Character.isDigit(c)) {
                sum+= Integer.parseInt(Character.toString(c));
            }
        }
        return sum;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
