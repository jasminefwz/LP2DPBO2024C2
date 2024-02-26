# Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
# untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
# Aamiin

# import class file
from Product import Product

# deklarasi class
class Clothing(Product):
    # constructor
    def __init__(self, idProduct, name, brand, price, size, material, gender):
        super().__init__(idProduct, name, brand, price)
        self.size = size
        self.material = material
        self.gender = gender
    
    # get size
    def get_size(self):
        return self.size
    
    # set size
    def set_size(self, size):
        self.size = size
    
    # get material
    def get_material(self):
        return self.material
    
    # set material
    def set_material(self, material):
        self.material = material
    
    # get gender
    def get_gender(self):
        return self.gender
    
    # set gender
    def set_gender(self, gender):
        self.gender = gender