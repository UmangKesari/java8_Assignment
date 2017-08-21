import org.junit.Test;

import static org.junit.Assert.*;

public class SupplierDemoTest
{
    SupplierDemo supplier = new SupplierDemo();
    @Test
    public void testSupplier()
    {
        assertEquals(supplier.usingSupplier(5,6),11);
    }

}
