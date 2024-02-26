/*
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin
*/

//import library
#include <bits/stdc++.h>
#include "Shirt.cpp"

//menggunakan standard namespace
using namespace std;

int main(){
    cout << "+============================================+" << endl;
    cout << "+ SELAMAT DATANG DI SISTEM INFORMASI PRODUCT +" << endl;
    cout << "+============================================+" << endl;

    int i, n = 0;
    string idProduct;
    string name;
    string brand;
    double price;
    string size;
    string material;
    char gender;
    string color;
    string sleeve_type;

    cout << "Masukkan jumlah data yang akan diinput dengan minimal 3 data: ";
    //input jumlah data
    cin >> n;
    cout << endl;

    //jika jumlah data yang diinput kurang dari 3 data
    if(n < 3){
        cout << "Minimal data yang harus diinput adalah 3 !\n";
    }
    else{
        list<Shirt> shirts;
        //input data
        for(i = 0; i < n; i++){
            cout << "Silahkan masukkan data ke-" << i + 1 << ":\n";
            cout << "ID: ";
            cin >> idProduct;           //memasukkan id
            cout << "Nama Product: ";  
            cin >> name;                //memasukkan nama
            cout << "Brand: ";   
            cin >> brand;               //memasukkan brand
            cout << "Price: ";   
            cin >> price;               //memasukkan price
            cout << "Size: ";
            cin >> size;                //memasukkan size
            cout << "Material: ";
            cin >> material;            //memasukkan material
            cout << "Gender: ";
            cin >> gender;              //memasukkan gender
            cout << "Color: ";
            cin >> color;               //memasukkan color
            cout << "Sleeve Type: ";
            cin >> sleeve_type;         //memasukkan sleeve type
            
            Shirt llist(idProduct, name, brand, price, size, material, gender, color, sleeve_type);
            shirts.push_back(llist);
            cout << "Data Product berhasil ditambahkan\n\n";
        }

        //menampilkan data dalam bentuk tabel
        cout << "Data Product :\n";
        cout << setfill('-');
        cout << "+-" << setw(6) << left << "-" << "+-" << setw(14) << left << "-" << "+-" << setw(13) << left << "-" << "+-" << setw(8) << left << "-" << "+-" << setw(7) << left << "-" << "+-" << setw(14) << left << "-" << "+-" << setw(7) << left << "-" << "+-" << setw(9) << left << "-" << "+-" << setw(14) << left << "-" << "+" << "\n";
        cout << setfill(' ');
        cout << "| " << setw(5) << left << "ID" << " | " << setw(13) << left << "Nama Product" << " | " << setw(12) << left << "Brand" << " | " << setw(7) << left << "Price" << " | " << setw(6) << left << "Size" << " | " << setw(13) << left << "Material" << " | " << setw(6) << left << "Gender" << " | " << setw(8) << left << "Color" << " | " << setw(13) << left << "Sleeve Type" << " |\n";
        cout << setfill('=');
        cout << "+=" << setw(6) << left << "=" << "+=" << setw(14) << left << "=" << "+=" << setw(13) << left << "=" << "+=" << setw(8) << left << "=" << "+=" << setw(7) << left << "=" << "+=" << setw(14) << left << "=" << "+=" << setw(7) << left << "=" << "+=" << setw(9) << left << "=" << "+=" << setw(14) << left << "=" << "+" << "\n";
        cout << setfill(' ');

        //tampil data
        list<Shirt>::iterator iter;
        for(iter = shirts.begin(); iter != shirts.end(); iter++){
            Shirt llist = *iter;
            cout << "| " << setw(5) << left << llist.idProduct << " | " << setw(13) << left << llist.name << " | " << setw(12) << left << llist.brand << " | " << setw(7) << left << llist.price << " | " << setw(6) << left << llist.size << " | " << setw(13) << left << llist.material << " | " << setw(6) << left << llist.gender << " | " << setw(8) << left << llist.color << " | " << setw(13) << left << llist.sleeve_type << " |\n";
        }

        cout << setfill('-');
        cout << "+-" << setw(6) << left << "-" << "+-" << setw(14) << left << "-" << "+-" << setw(13) << left << "-" << "+-" << setw(8) << left << "-" << "+-" << setw(7) << left << "-" << "+-" << setw(14) << left << "-" << "+-" << setw(7) << left << "-" << "+-" << setw(9) << left << "-" << "+-" << setw(14) << left << "-" << "+" << "\n";
        cout << setfill(' ');
    }

    return 0;
}