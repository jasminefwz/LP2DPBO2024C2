<!-- 
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin 
-->

<?php
//deklarasi class
class Product{
    public $idProduct;
    public $name;
    public $brand;
    public $price;
  
    //constructor
    function __construct($idProduct, $name, $brand, $price){
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    //set id
    public function setId($idProduct){
        $this->idProduct = $idProduct;
    }

    //get id
    public function getId(){
        return $this->idProduct;
    }

    //set name
    public function setName($name){
        $this->name = $name;
    }

    //get name
    public function getName(){
        return $this->name;
    }

    //set brand
    public function setBrand($brand){
        $this->brand = $brand;
    }

    //get brand
    public function getBrand(){
        return $this->brand;
    }

    //set price
    public function setPrice($price){
        $this->price = $price;
    }

    //get price
    public function getPrice(){
        return $this->price;
    }
}
?>