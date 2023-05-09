public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int temp = tonerAmount + tonerLevel;
        if(temp > 100 || temp < 0){
            return -1;
        }
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pages){
        if(this.duplex){
            int total = (pages / 2) + (pages % 2);
            pagesPrinted += total;
            return total;
        }else {
            pagesPrinted += pages;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
