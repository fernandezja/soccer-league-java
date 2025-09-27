
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import com.soccer_league.*;

public class EquipoTests {

    @Test
    public void equipo_create_simple()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");

        assertEquals("Boca Juniors", boca.getName());        
        assertEquals("BOC", boca.getAbreviatura());

        
    }

    

    


}
