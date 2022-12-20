
package BD_Productos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class addProductosTest {
    
    public addProductosTest() {
    }

    @Test
    public void testId_producto_auto() {
        System.out.println("id_producto_auto");
        addProductos instance = null;
        int expResult = 0;
        int result = instance.id_producto_auto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        addProductos.main(args);
        fail("The test case is a prototype.");
    }
    
}
