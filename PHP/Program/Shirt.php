<!-- 
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin 
-->

<?php
require('Clothing.php');

//deklarasi class
class Shirt extends Clothing{
    public $color;
    public $sleeve_type;
  
    function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type){
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    //set color
    public function setColor($color){
        $this->color = $color;
    }

    //get color
    public function getColor(){
        return $this->color;
    }

    //set sleeve type
    public function setSleeve_type($sleeve_type){
        $this->sleeve_type = $sleeve_type;
    }

    //get sleeve type
    public function getSleeve_type(){
        return $this->sleeve_type;
    }
}
?>