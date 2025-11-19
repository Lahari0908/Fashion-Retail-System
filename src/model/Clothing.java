package model;

public class Clothing extends Products {
    private String SIZE;
    private String MODEL;
    private String COLOR;
    public Clothing(String PRODUCTNO, StringNAMEOFCLOTHING, double PRICE, String SIZE, String COLOR, String MODEL) {
        super(PRODUCTNO,NAMEOFCLOTHING,PRICE,SIZE,COLOR,MODEL);
        this.model = model;
        this.size = size;
        this.color = color;
    }
}
