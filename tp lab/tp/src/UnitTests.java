import com.company.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {
    @Test
    void alimentar(){
        Perro p = new Perro("fifo","perro","alexia");
        ABM menu=new ABM();
        menu.agregarmascota(p);
        p.alimentar("fifo");
        assertEquals(p.getAlegria()+1, p.getAlegria());
    }

    @Test
    void saludar(){
        Gato g = new Gato("pancho","gato","nadia");
        ABM menu=new ABM();
        menu.agregarmascota(g);
        g.alimentar("pancho");
        g.saludar("nadia","pancho");
        assertEquals(1,g.getAlegria());
    }

    @Test
    void cambiarcanto(){
        Pajarito paj=new Pajarito("enzo","pajarito","cinthia",true);
        ABM menu=new ABM();
        menu.agregarmascota(paj);
        paj.cambiarcanto("lalala");
        assertEquals("lalala",paj.getSaludo());
    }

    @Test
    void modificarmascota(){
        Perro p2 = new Perro("fido","perro","eliana");
        ABM menu=new ABM();
        menu.agregarmascota(p2);
        menu.modificarmascota("fido","pepe","fidito");
        assertEquals("fidito",p2.getNombre());
        assertEquals("pepe",p2.getDueño());
    }

    @Test
    void eliminarmascota(){
        Pez pez= new Pez("jorge","pez","olivia");
        ABM menu=new ABM();
        menu.agregarmascota(pez);
        menu.eliminarmascota("Jorge");
        assertNull(pez);
    }

    @Test
    void agregarmascota(){
        ABM menu=new ABM();
        Pajarito paj2=new Pajarito("renzo","pajarito","giuli",true);
        menu.agregarmascota(paj2);
        assertEquals(paj2,null);
    }

    @Test
    void chequearPeces(){
        Pez pez2= new Pez("jorgelin","pez","oliva");
        ABM menu=new ABM();
        menu.agregarmascota(pez2);
        pez2.saludar("alexia","jorgelin");
        menu.chequearPeces();
        assertEquals(null,pez2)
    }



}
