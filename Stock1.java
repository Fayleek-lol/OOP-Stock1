public class Stock1
{
    private String nameOfProduct;
    private double priceProduct;
    private boolean availabilityInStock;
    
    public Stock1()
    {
        nameOfProduct = "None";
        priceProduct = 400;
        availabilityInStock = false;
    }
    
    public Stock1(String nameOfProduct)
    {
        nameOfProduct = nameOfProduct;
        priceProduct = 200;
        availabilityInStock = false;
    }
    
    public Stock1(String nameOfProduct, int priceProduct, boolean availabilityInStock)
    {
        nameOfProduct = nameOfProduct;
        priceProduct = priceProduct;
        availabilityInStock = availabilityInStock;
    }
    
    public Stock1(Stock1 sto)
    {
        nameOfProduct = sto.nameOfProduct;
        priceProduct = sto.priceProduct;
        availabilityInStock = sto.availabilityInStock;
    }
    
    public void printAboutObject()
    {
        System.out.println("Название продукта" + nameOfProduct);
        System.out.println("Цена продукта" + priceProduct);
        System.out.println("Наличие на складе" + availabilityInStock);
        System.out.println();
    }
    
	public void setNameOfProduct(String nameOfProduct)
    {
        if (nameOfProduct.length() > 0)
        {
            this.nameOfProduct = nameOfProduct.substring(0,1).toUpperCase() + nameOfProduct.substring(1);
        }
    }
    public String getNameOfProduct()
    {
        return nameOfProduct;
    }      
    
    public void setPriceProduct (int priceProduct)
    {
        if (priceProduct < 0)
        {
            System.out.println("Price can't be negative");    
        }   
        else
        {
            this.priceProduct = priceProduct;
        }
    }

    public double getPriceOfProduct()
    {
        return priceProduct;
    }
    
    public void setAvailabilityInStock(boolean availabilityInStock)
    {
        this.availabilityInStock = availabilityInStock;
    }
    
    public boolean getAvailbilityInStock()
    {
        return availabilityInStock;
    }
}
