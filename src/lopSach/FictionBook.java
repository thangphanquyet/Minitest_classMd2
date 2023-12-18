package lopSach;

public class FictionBook extends Book {
    String loaisach;
    public FictionBook(){
    }

    public FictionBook(double masach, String tensach, double gia, String tacgia, String loaisach) {
        super(masach, tensach, gia, tacgia);
        this.loaisach = loaisach;
    }

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "loaisach='" + loaisach + '\'' +
                ", masach=" + masach +
                ", tensach='" + tensach + '\'' +
                ", gia=" + gia +
                ", tacgia='" + tacgia + '\'' +
                '}';
    }
}
