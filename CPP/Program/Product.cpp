/*
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin
*/

//import library
#include <iostream>
#include <string>
#include <iomanip>

//menggunakan standard namespace
using namespace std;

//deklarasi class
class Product{
    public:
        string idProduct;
        string name;
        string brand;
        double price;

        Product(string idProduct, string name, string brand, double price) : idProduct(idProduct), name(name), brand(brand), price(price) {}

        //get id
        string get_id(){
            return this->idProduct;
        }

        //set id
        void set_id(string idProduct){
            this->idProduct = idProduct;
        }
        
        //get name
        string get_name(){
            return this->name;
        }

        //set name
        void set_name(string name){
            this->name = name;
        }

        //get brand
        string get_brand(){
            return this->brand;
        }

        //set brand
        void set_brand(string brand){
            this->brand = brand;
        }

        //get price
        double get_price(){
            return this->price;
        }

        //set price
        void set_price(double price){
            this->price = price;
        }
    
        //destructors
        ~Product(){}
};