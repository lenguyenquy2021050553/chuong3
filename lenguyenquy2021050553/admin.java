import cau1.Book;

public class admin {


 
        public static void main(String[] args) {
          Book a = new Book();
          a.SetBook();
          a.getBook();
          System.out.print("thue: " +   a.getImportVAT()); 
          NoTaxBook b = new NoTaxBook();
          b.SetBook();
          b.getBook();
         System.out.print("thue: " +   b.getImportVAT()); 
        }
     
    
    }

