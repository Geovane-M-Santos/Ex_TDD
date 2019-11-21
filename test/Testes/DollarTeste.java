package Testes;

import ex_tdd.Dollar;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author Geovane
 */
public class DollarTeste {
    public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
    }
}
