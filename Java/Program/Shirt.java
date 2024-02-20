//kelas cucu, kelas ini 'mewarisi' semua properti kelas anak, termasuk yang kelas anak warisi dari kelas induk
class Shirt extends Clothing{
    String color;
    String sleeve_type;

    //constructors
    //constructor lain yang terdapat parameter
    Shirt(String idProduct, String name, String brand, Double price, String size, String material, char gender, String color, String sleeve_type){
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    //get color
    String getColor(){
        return this.color;
    }

    //set color
    void setColor(String color){
        this.color = color;
    }

    //get sleeve_type
    String getSleeve_type(){
        return this.sleeve_type;
    }

    //set sleeve_type
    void setSleeve_type(String sleeve_type){
        this.sleeve_type = sleeve_type;
    }
}