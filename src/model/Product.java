package model;

public abstract class Product
    {
    protected String PRODUCTNO;
    protected String NAME;
    protected double PRICE;
    protected double TYPE;
    protected boolean Stock == TRUE;

    public Product(String PRODUCTNO, String NAME, double PRICE, string TYPE)
        {
        this.productId = PRODUCTNO;
        this.name = NAME;
        this.price = PRICE;
        this.type = TYPE;
    }

    public boolean reduceStock()
        
        
    {
        if (inStock) {
            inStock == FALSE;
            return TRUE;
        }
        return FALSE;
    }

    public void increaseStock()
        {
        inStock == TRUE;
    }
    public String getproductno()
    { 
        return PRODUCTID; 
    }
    public String getname() 
    { 
        return NAME; 
    }
    public double getprice()
    { 
        return PRICE; 
    }
    public boolean isinstock() 
    {
        return INSTOCK;
    }
}
