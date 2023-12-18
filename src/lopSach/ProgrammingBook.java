package lopSach;

public class ProgrammingBook extends Book {
   public String ngonngu;
    String khochu;
    public ProgrammingBook(){
    }

    public ProgrammingBook(double masach, String tensach, double gia, String tacgia, String ngonngu, String khochu) {
        super(masach, tensach, gia, tacgia);
        this.ngonngu = ngonngu;
        this.khochu = khochu;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public String getKhochu() {
        return khochu;
    }

    public void setKhochu(String khochu) {
        this.khochu = khochu;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "ngonngu: '" + ngonngu + '\'' +
                ", khochu: '" + khochu + '\'' +
                ", masach: " + masach +
                ", tensach: '" + tensach + '\'' +
                ", gia: " + gia +
                ", tacgia: '" + tacgia + '\'' +
                '}';
    }
}
