# Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
# untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
# Aamiin

# deklarasi class
class Product:
    # constructor
    def __init__(self, idProduct, name, brand, price):
        self.idProduct = idProduct
        self.name = name
        self.brand = brand
        self.price = price
    
    # get id
    def get_id(self):
        return self.idProduct
    
    # set id
    def set_id(self, idProduct):
        self.idProduct = idProduct
    
    # get name
    def get_name(self):
        return self.name
    
    # set name
    def set_name(self, name):
        self.name = name
    
    # get brand
    def get_brand(self):
        return self.brand
    
    # set brand
    def set_brand(self, brand):
        self.brand = brand
    
    # get price
    def get_price(self):
        return self.price
    
    # set price
    def set_price(self, price):
        self.price = price