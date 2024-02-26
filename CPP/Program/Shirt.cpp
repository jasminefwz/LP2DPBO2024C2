/*
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin
*/

//import library
#include "Clothing.cpp"

//menggunakan standard namespace
using namespace std;

class Shirt : public Clothing{
    public:
        string color;
        string sleeve_type;

        Shirt(string idProduct, string name, string brand, double price, string size, string material, char gender, string color, string sleeve_type) : Clothing(idProduct, name, brand, price, size, material, gender), color(color), sleeve_type(sleeve_type) {}

        //get color
        string get_color(){
            return this->color;
        }

        //set color
        void set_color(string color){
            this->color = color;
        }

        //get sleeve type
        string get_sleeve_type(){
            return this->sleeve_type;
        }

        //set sleeve type
        void set_sleeve_type(string sleeve_type){
            this->sleeve_type = sleeve_type;
        }
    
        //destructors
        ~Shirt(){}
};