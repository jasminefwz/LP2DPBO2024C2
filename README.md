# LP2DPBO2024C2

## Janji
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan Aamiin

## Desain Kelas (Diagram)
![image](https://github.com/jasminefwz/LP2DPBO2024C2/assets/147362810/f98bfabc-5b79-4c84-bbbf-0d8a49354b18)

## Desain Program
Pada program berbasis OOP dengan jenis pewarisan _Multilevel Inheritance_ tentang Data Product ini memiliki 3 class yang mana satu kelas merupakan orang tua (Product) lalu mewarisi satu kelas lain yaitu anak (Clothing) dan diwariskan lagi ke satu kelas lain yaitu cucu (Shirt). Pada setiap bahasanya memiliki empat file yaitu tiga file untuk per kelas dan satu file untuk main.

Program ini menampilkan data dari seluruh objek kelas cucu/Shirt yang dibuat di dalam main. Maka dari itu, kelas anak harus extends kelas orang tua, begitupun kelas cucu harus extends kelas anak sebagai orang tuanya. Jadi, main hanya akan memanggil kelas cucu. Setiap kelas memiliki constructor.

User dapat memasukkan jumlah banyaknya data yang akan diinput dengan minimal jumlah data adalah 3 menggunakan kondisi jika jumlah data yang diinput kurang dari 3 maka program akan keluar. Namun jika sebaliknya, maka program akan melanjutkan proses input data dengan perulangan sebanyak jumlah inputan dan data tersebut akan disimpan. Setelah itu, program akan menampilkan data Product hasil inputan dalam bentuk tabel.

## Penjelasan ALur
**1. File Class Orang Tua "Product"**

Pertama-tama deklarasi class Product, kemudian deklarasi atribut idProduct (str), name (untuk nama product) (str), brand (str), dan price (double). Lalu lakukan getter dan setter pada setiap atributnya.

**2. File Class Anak "Clothing"**

Pada kelas anak ini import library dari kelas orang tuanya dan deklarasi class Clothing yang extends class Product sebagai class orang tua. Mendeklarasikan atribut size (str), material (str), dan gender (char), lalu terdapat super untuk mendeklarasi atribut yang ada pada kelas yang mewarisi. Getter dan setter pun dilakukan di setiap atribut

**3. File Class Cucu "Shirt"**

Sama halnya seperti class Clothing, import library class Clothing dan deklarasikan class Shirt yang extends class Clothing sebagai class orang tuanya, lalu deklarasi atribut color (str) dan sleeve_type (str). Kemudian super dan lakukan getter serta setter untuk kedua atribut tersebut.

**4. File Main**

Dalam file ini kita hanya import kelas cucu yaitu class Shirt dan akan menampilkan tampilan awal selamat datang serta perintah untuk input jumlah data yang akan diinput user dengan minimal 3 data. Lalu saat user memasukkan jumlah data yang kurang dari 3 maka program akan keluar dan menampilkan bahwa minimal data yang harus diinput adalah 3. Akan tetapi, jika user memasukkan jumlah data lebih dari 3, maka program akan meminta kita untuk input data Product yang terdapat 9 atribut dari ketiga kelas yang sudah ada sesuai dengan jumlah data yang diinput tadi, dan data akan disimpan. Setelah menginput data, program menampilkan data-data tersebut menggunakan perulangan yang disajikan dalam bentuk tabel dengan memperhatikan panjang kolom setiap atributnya untuk mengatur spasi serta garis pembatas agar tabel menjadi rapi.

## Dokumentasi Program saat Dijalankan
### Contoh -> Bahasa Python
1. Tampilan awal
<img width="683" alt="1  tampilan awal" src="https://github.com/jasminefwz/LP2DPBO2024C2/assets/147362810/fa40c529-0535-4760-83f1-5a4739f3955d">

2. Jumlah data yang diinput kurang dari 3
<img width="682" alt="2  jumlah data yg diinput kurang dr 3" src="https://github.com/jasminefwz/LP2DPBO2024C2/assets/147362810/6fc2a1de-5659-46a5-842c-d17977e0cafb">

3. Input data
<img width="301" alt="3  input data" src="https://github.com/jasminefwz/LP2DPBO2024C2/assets/147362810/2e890895-ade8-46b3-bdbc-ee7e67be643a">

4. Menampilkan data
<img width="836" alt="4  menampilkan data" src="https://github.com/jasminefwz/LP2DPBO2024C2/assets/147362810/7400c76e-48e5-4869-bbef-323b07cba309">
