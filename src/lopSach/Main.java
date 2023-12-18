package lopSach;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book = new Book();
        System.out.println(book);
        ProgrammingBook[] a = new ProgrammingBook[5];
        ProgrammingBook book1 = new ProgrammingBook(12.5, "no name1", 120.0,"Nguyễn Ngọc Ngạn", "Tiêng Việt", "to");
        System.out.println(book1);
        ProgrammingBook book2 = new ProgrammingBook(12.6, "nono", 130.0, "nono", "java", "to" );
        System.out.println(book2);
        ProgrammingBook book3 = new ProgrammingBook(12.6, "nono", 140.0, "nono", "java", "to" );
        System.out.println(book3);
        ProgrammingBook book4 = new ProgrammingBook(12.6, "nono", 150.0, "nono", "java", "to" );
        System.out.println(book4);
        ProgrammingBook book5 = new ProgrammingBook(12.6, "nono", 160.0, "nono", "viet", "to" );
        System.out.println(book5);
        a[0] = book1;
        a[1] = book2;
        a[2] = book3;
        a[3] = book4;
        a[4] = book5;
        double gia1 =0;
        for (int i = 0; i < a.length; i++) {
            gia1 = gia1 + a[i].getGia();
        }
        FictionBook[] b = new FictionBook[5];
        FictionBook book6 = new FictionBook(12.6, "no name2", 170.0, "k biết", "Viễn tưởng");
        System.out.println(book6);
        FictionBook book7 = new FictionBook(12.6, "no name2", 180.0, "k biết", "Viễn tưởng");
        System.out.println(book7);
        FictionBook book8 = new FictionBook(12.6, "no name2", 190.0, "k biết", "Viễn tưởng");
        System.out.println(book8);
        FictionBook book9 = new FictionBook(12.6, "no name2", 200.0, "k biết", "Viễn tưởng");
        System.out.println(book9);
        FictionBook book10 = new FictionBook(12.6, "no name2", 210.0, "k biết", "Viễn tưởng");
        System.out.println(book10);
        b[0] = book6;
        b[1] = book7;
        b[2] = book8;
        b[3] = book9;
        b[4] = book10;
        double gia2 =0;
        for (int i = 0; i < b.length; i++) {
            gia2 = gia2 + b[i].getGia();
        }
        double giatong = gia1+gia2;
        System.out.println("giá của 10 cuốn sách là: " + giatong);
        int dem = 0;
        for (int i = 0; i < b.length; i++) {
            if ( a[i].getNgonngu().equals("java")){
                dem++;
            }
        }
        System.out.println("cuốn sách có java là: "+ dem);

    }
}