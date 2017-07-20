package nl.rabaelo.soundsharp;

public class Mp3 {

    private int ID;
    private String Make;
    private String Model;
    private int MBSize;
    private Double Price;

    Mp3(Integer id, String make, String model, Integer mbsize, Double price) {
        this.ID = id;
        this.Make = make;
        this.Model = model;
        this.MBSize = mbsize;
        this.Price = price;
    }

    void setID(Integer id) {
        this.ID = id;
    }

    Integer getID() {
        return this.ID;
    }

    void setMake(String make) {
        this.Make = make;
    }

    String getMake() {
        return this.Make;
    }

    void setModel(String model) {
        this.Model = model;
    }

    String getModel() {
        return this.Model;
    }

    void setMBSize(Integer mbSize) {
        this.MBSize = mbSize;
    }

    Integer getMBSize() {
        return this.MBSize;
    }

    void setPrice(Double price) {
        this.Price = price;
    }

    Double getPrice() {
        return this.Price;
    }

    @Override
    public String toString() {
        return new StringBuffer(" ID : " + ID +
                " Brand : " + Make +
                " Model : " + Model +
                " Memory : " + MBSize +
                " Price : " + Price).toString();
    }
}
