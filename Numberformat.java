import java.text.NumberFormat;
import java.util.Locale;

public class Numberformat {
    public static void main(String[] args) {
        double num = 04843.56;
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String formattedNum = numberFormat.format(num);
        System.out.println(formattedNum);
    }
}

