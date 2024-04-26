import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DVD d1= new DVD("ard elnefak","mohamed",2001,20);
        Book b1=new Book("nnnnnnn","ahmed",2000,72);
        Magazine m1=new Magazine("mmmmmmmmm","khaled",2007, 2.1);

         Library l1=new Library();
         l1.addItem(d1);
         l1.addItem(b1);
         l1.addItem(m1);
         d1.updateInfo("ddddddd","mohamed",2001,20);


         l1.displayItems();

    }
}