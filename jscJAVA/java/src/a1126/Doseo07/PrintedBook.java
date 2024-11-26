package a1126.Doseo07;

public class PrintedBook extends Book {
    private  int pageCount; //페이지 수
    private  double weight; //책의 무개
    
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public PrintedBook(String title, String author, String iSBN, int pageCount, double weight) {
        super(title, author, iSBN);
        this.pageCount = pageCount;
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " +pageCount);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("시발제발좀 되라고 개시발");
    }
    

}
