//kelas anak, kelas ini 'mewarisi properti kelas induk
class Clothing extends Product{
    String size;
    String material;
    char gender;

    //constructors
    //constructor lain yang terdapat parameter
    Clothing(String idProduct, String name, String brand, Double price, String size, String material, char gender){
        super(idProduct, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    //get size
    String getSize(){
        return this.size;
    }

    //set size
    void setSize(String size){
        this.size = size;
    }

    //get material
    String getMaterial(){
        return this.material;
    }

    //set material
    void setMaterial(String material){
        this.material = material;
    }

    //get gender
    char getGender(){
        return this.gender;
    }

    //set gender
    void setGender(char gender){
        this.gender = gender;
    }
}