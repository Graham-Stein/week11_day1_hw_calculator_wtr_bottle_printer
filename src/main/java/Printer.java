public class Printer {

    private int paper;
    private int paperCapacity;
    private int tonerCapacity;
    private int toner;

    public Printer(){
        this.paperCapacity = 200;
        this.paper = this.paperCapacity;
        this.tonerCapacity = 300;
        this.toner = this.tonerCapacity;
    }


    public int paperInTray() {
//    Create a Printer class that has a property for number of sheets of paper left.
        return this.paper;
    }

    public int Print(int pages, int copies) {
        int sheets = (pages * copies);
        //    The print method will only run if the printer has enough paper (and toner).
        if (sheets <= this.paper && sheets <= this.toner) {
//        Add a method to print that takes in a number of pages to be printed and number of copies to print.
            this.paper -= sheets;
            this.toner -= sheets;
            //     If it runs it will reduce the
// value of the paper left by number of copies * number of pages.
            return this.paper;
        }
        return -1;
    }

    public int refill() {
        //        Create a method to refill the printer paper.
        this.paper = this.paperCapacity;
        return this.paper;
    }


    public int tonerLevel() {
        return this.toner;
    }

    public int useToner(int n) {
        //        Add a toner volume property to the class.
        //        Modify the printer so that it reduces the toner by 1 for each page printed.
        this.toner -= n;
        return this.toner;

    }
}