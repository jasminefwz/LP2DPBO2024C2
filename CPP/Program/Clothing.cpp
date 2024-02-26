/*
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin
*/

//import library
#include "Product.cpp"

//menggunakan standard namespace
using namespace std;

//deklarasi class
class Clothing : public Product{
    public:
        string size;
        string material;
        char gender;

        Clothing(string idProduct, string name, string brand, double price, string size, string material, char gender): Product(idProduct, name, brand, price), size(size), material(material), gender(gender) {}

        //get size
        string get_size(){
            return this->size;
        }

        //set size
        void set_size(string size){
            this->size = size;
        }

        //get material
        string get_material(){
            return this->material;
        }

        //set material
        void set_material(string material){
            this->material = material;
        }

        //get gender
        char get_gender(){
            return this->gender;
        }

        //set gender
        void set_gender(char gender){
            this->gender = gender;
        }
    
        //destructors
        ~Clothing(){}
};