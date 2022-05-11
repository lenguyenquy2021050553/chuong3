import java.util.Scanner;
   

public class Book {
    private String title;
   private double price;
    protected double name;
    Scanner sc = new Scanner(System.in);
    public double getBook(){
       return 0.5/100 *price;
    }
    public void SetBook () {
        System.out.print("nhap tên sach: ");
        title =sc.nextLine();
     System.out.print("nhap gia: ");
     price =sc.nextDouble();
    }
   public void getBook () {
    System.out.println("ten sach: "+ title);
    System.out.println("ten gia: "+ price);
   }
    public static void main(String[] args) throws Exception {
        Tour a = new Book;
        System.out.print("thue:" +   a.getImportVAT()); 
     }
}