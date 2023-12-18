package lopSach;

public class Book {

    double masach;
    String tensach;
    double gia;
    String tacgia;
    public Book(){
    }

    public Book(double masach, String tensach, double gia, String tacgia) {
        this.masach = masach;
        this.tensach = tensach;
        this.gia = gia;
        this.tacgia = tacgia;
    }

    public double getMasach() {
        return masach;
    }

    public void setMasach(double masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    @Override
    public String toString() {
        return "Book{" +
                "masach: " + masach +
                ", tensach: '" + tensach + '\'' +
                ", gia: " + gia +
                ", tacgia: '" + tacgia + '\'' +
                '}';
    }
}
