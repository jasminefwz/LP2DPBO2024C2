<!-- 
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin 
-->

<?php
require('Shirt.php');

echo "<b>=================================================</b>" . "<br>";
echo "<b>　SELAMAT DATANG DI SISTEM INFORMASI PRODUCT　</b>" . "<br>";
echo "<b>=================================================</b>" . "<br>" . "<br>";

//memasukkan jumlah data
echo "Masukkan jumlah data yang akan diinput dengan minimal 3 data: <i>5</i>" . "<br>";

//memasukkan data
$shirt1 = new Shirt("ps30", "Polo Shirt", "Polo", 329.099, "XL", "T-shirt", "L", "Hijau", "Short Sleeve");
$shirt2 = new Shirt("cln1", "Celana Sport", "Nike", 259.999, "XS", "Polyester", "L", "Biru", "Long Sleeve");
$shirt3 = new Shirt("tktp9", "Tank Top", "Under Armour", 89.999, "S", "Spandex", "P", "Coklat", "Sleeveless");
$shirt4 = new Shirt("hd48", "Hoodie", "Bershka", 499.999, "M", "Fleece", "P", "Magenta", "Long Sleeve");
$shirt5 = new Shirt("drs14", "Dress", "H&M", 500.999, "S", "Katun", "P", "Putih", "Sleeveless");
echo "<i>Data Product berhasil ditambahkan</i>" . "<br>" . "<br>";

$shirts = [$shirt1, $shirt2, $shirt3, $shirt4, $shirt5];

echo "<table border='1'>";//membuat tabel
echo "<b>　　　　　　　　　　　　　　Data Product</b>" . "<br>";
//judul isi tabel
echo "<tr>";
echo "<td><b>ID</b></td>";
echo "<td><b>Nama Product</b></td>";
echo "<td><b>Brand</b></td>";
echo "<td><b>Price</b></td>";
echo "<td><b>Size</b></td>";
echo "<td><b>Material</b></td>";
echo "<td><b>Gender</b></td>";
echo "<td><b>Color</b></td>";
echo "<td><b>Sleeve Type</b></td>";
echo "</tr>";

//perulangan untuk menampilkan data
foreach($shirts as $shirt){
    echo "<tr>";
    echo "<td>{$shirt->idProduct}</td>";    //untuk menampilkan id
    echo "<td>{$shirt->name}</td>";         //untuk menampilkan nama
    echo "<td>{$shirt->brand}</td>";        //untuk menampilkan brand
    echo "<td>{$shirt->price}</td>";        //untuk menampilkan price
    echo "<td>{$shirt->size}</td>";         //untuk menampilkan size
    echo "<td>{$shirt->material}</td>";     //untuk menampilkan material
    echo "<td>{$shirt->gender}</td>";       //untuk menampilkan gender
    echo "<td>{$shirt->color}</td>";        //untuk menampilkan color
    echo "<td>{$shirt->sleeve_type}</td>";  //untuk menampilkan sleeve type
    echo "</tr>";
}
echo "</table>";
?>