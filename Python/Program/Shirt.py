# Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
# untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
# Aamiin

# import class file
from Clothing import Clothing

# deklarasi class
class Shirt(Clothing):
    # constructor
    def __init__(self, idProduct, name, brand, price, size, material, gender, color, sleeve_type):
        super().__init__(idProduct, name, brand, price, size, material, gender)
        self.color = color
        self.sleeve_type = sleeve_type
    
    # get color
    def get_color(self):
        return self.color
    
    # set color
    def set_color(self, color):
        self.color = color
    
    # get sleeve_type
    def get_sleeve_type(self):
        return self.sleeve_type
    
    # set sleeve_type
    def set_sleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type