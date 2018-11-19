import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper200(){
        assertEquals(200, printer.paperInTray());
    }

    @Test
    public void hasPrintFunction(){
        assertEquals(180, printer.Print(10, 2));
        assertEquals(280, printer.getTonerLevel());
    }

    @Test
    public void hasNoPrintIfNotEnoughPaper(){
        assertEquals(-1, printer.Print(100, 3));
    }

    @Test
    public void hasRefillFunction(){
        assertEquals(200, printer.setRefill());
    }

    @Test
    public void hasToner(){
        assertEquals(300, printer.getTonerLevel());
    }

    @Test
    public void hasUseTonerFunction(){
        assertEquals(200, printer.useToner(100));
    }
}


//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages to be printed and number of copies to print.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.