import java.text.NumberFormat;
import java.text.ParseException;

public class ExmploExcecao {
    
    public static void main(String[] args) {
        
        // Case 1
        /*Number valor = Double.valueOf("a1.75");
        System.out.println(valor);*/

        // Case 2
        Number valor;
        try {

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
            
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
