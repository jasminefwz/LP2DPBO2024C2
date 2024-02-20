//deklarasi class
class Product{
    String idProduct;
    String name;
    String brand;
    Double price;

    //constructors
    //constructor lain yang terdapat parameter
    Product(String idProduct, String name, String brand, Double price){
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //get idProduct
    String getIdProduct(){
        return this.idProduct;
    }

    //set idProduct
    void setIdProduct(String idProduct){
        this.idProduct = idProduct;
    }

    //get name
    String getName(){
        return this.name;
    }

    //set name
    void setName(String name){
        this.name = name;
    }

    //get brand
    String getBrand(){
        return this.brand;
    }

    //set brand
    void setBrand(String brand){
        this.brand = brand;
    }

    //get price
    Double getPrice(){
        return this.price;
    }

    //set price
    void setPrice(Double price){
        this.price = price;
    }
}