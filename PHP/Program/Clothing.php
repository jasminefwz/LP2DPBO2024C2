<!-- 
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin 
-->

<?php
require('Product.php');

//deklarasi class
class Clothing extends Product{
    public $size;
    public $material;
    public $gender;
  
    //constructor
    function __construct($idProduct, $name, $brand, $price, $size, $material, $gender){
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    //set size
    public function setSize($size){
        $this->size = $size;
    }

    //get size
    public function getSize(){
        return $this->size;
    }

    //set material
    public function setMaterial($material){
        $this->material = $material;
    }

    //get material
    public function getMaterial(){
        return $this->material;
    }

    //set gender
    public function setGender($gender){
        $this->gender = $gender;
    }

    //get gender
    public function getGender(){
        return $this->gender;
    }
}
?>