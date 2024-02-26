# Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP2 dalam Mata Kuliah DPBO
# untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
# Aamiin

# import class file
from Shirt import Shirt

print("+============================================+")
print("+ SELAMAT DATANG DI SISTEM INFORMASI PRODUCT +")
print("+============================================+")

shirts = []

# input banyaknya data
n = int(input("Masukkan jumlah data yang akan diinput dengan minimal 3 data: "))
print()

# jika jumlah data yang dimasukkan kurang dari 3
if n < 3:
    print("Minimal data yang harus diinput adalah 3 !")
else:
    # memasukkan data
    for i in range (n):
        print(f"Silahkan masukkan data ke-{i + 1}:")
        idProduct = str(input("ID: "))
        name = str(input("Nama Product: "))
        brand = str(input("Brand: "))
        price = float(input("Price: "))
        size = str(input("Size: "))
        material = str(input("Material: "))
        gender = input("Gender: ")[0]
        color = str(input("Color: "))
        sleeve_type = str(input("Sleeve Type: "))
        
        shirts.append(Shirt(idProduct, name, brand, price, size, material, gender, color, sleeve_type))
        print("Data Product berhasil ditambahkan")
        print()
        
    # output
    # mencari panjang maksimum untuk setiap kolom
    max_id_length = max(len(shirtss.idProduct) for shirtss in shirts)
    max_name_length = max(len(shirtss.name) for shirtss in shirts)
    max_brand_length = max(len(shirtss.brand) for shirtss in shirts)
    max_price_length = max(len(str(shirtss.price)) for shirtss in shirts)
    max_size_length = max(len(shirtss.size) for shirtss in shirts)
    max_material_length = max(len(shirtss.material) for shirtss in shirts)
    max_gender_length = max(len(shirtss.gender) for shirtss in shirts)
    max_color_length = max(len(shirtss.color) for shirtss in shirts)
    max_sleeve_type_length = max(len(shirtss.sleeve_type) for shirtss in shirts)
        
    # menentukan panjang untuk judul kolom
    max_id_length = max(max_id_length, len("ID"))
    max_name_length = max(max_name_length, len("Name Product"))
    max_brand_length = max(max_brand_length, len("Brand"))
    max_price_length = max(max_price_length, len("Price"))
    max_size_length = max(max_size_length, len("Size"))
    max_material_length = max(max_material_length, len("Material"))
    max_gender_length = max(max_gender_length, len("Gender"))
    max_color_length = max(max_color_length, len("Color"))
    max_sleeve_type_length = max(max_sleeve_type_length, len("Sleeve Type"))
    
    print("Data Product :")
    
    # membuat tabel dengan lebar kolom yang sesuai dengan panjang maksimum
    # mencetak garis bawah tabel
    print(f"+{'-' * 4}+{'-' * (max_id_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_brand_length + 2)}+{'-' * (max_price_length + 2)}+{'-' * (max_size_length + 2)}+{'-' * (max_material_length + 2)}+{'-' * (max_gender_length + 2)}+{'-' * (max_color_length + 2)}+{'-' * (max_sleeve_type_length + 2)}+")
    # menampilkan judul kolom
    print(f"| {'No'} | {'ID':<{max_id_length}} | {'Nama Product':<{max_name_length}} | {'Brand':<{max_brand_length}} | {'Price':<{max_price_length}} | {'Size':<{max_size_length}} | {'Material':<{max_material_length}} | {'Gender':<{max_gender_length}} | {'Color':<{max_color_length}} | {'Sleeve Type':<{max_sleeve_type_length}} |")
    # mencetak garis bawah tabel
    print(f"+{'=' * 4}+{'=' * (max_id_length + 2)}+{'=' * (max_name_length + 2)}+{'=' * (max_brand_length + 2)}+{'=' * (max_price_length + 2)}+{'=' * (max_size_length + 2)}+{'=' * (max_material_length + 2)}+{'=' * (max_gender_length + 2)}+{'=' * (max_color_length + 2)}+{'=' * (max_sleeve_type_length + 2)}+")

    # menampilkan data dalam bentuk tabel
    for idx, shirtss in enumerate(shirts, start = 1):
        id_col = shirtss.idProduct.ljust(max_id_length)
        name_col = shirtss.name.ljust(max_name_length)
        brand_col = shirtss.brand.ljust(max_brand_length)
        price_col = f"{shirtss.price:.0f}".ljust(max_price_length)
        size_col = shirtss.size.ljust(max_size_length)
        material_col = shirtss.material.ljust(max_material_length)
        gender_col = shirtss.gender.ljust(max_gender_length)
        color_col = shirtss.color.ljust(max_color_length)
        sleeve_type_col = shirtss.sleeve_type.ljust(max_sleeve_type_length)
        
        print(f"| {idx:2} | {id_col} | {name_col} | {brand_col} | {price_col} | {size_col} | {material_col} | {gender_col} | {color_col} | {sleeve_type_col} |")
        
    # mencetak garis bawah tabel
    print(f"+{'-' * 4}+{'-' * (max_id_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_brand_length + 2)}+{'-' * (max_price_length + 2)}+{'-' * (max_size_length + 2)}+{'-' * (max_material_length + 2)}+{'-' * (max_gender_length + 2)}+{'-' * (max_color_length + 2)}+{'-' * (max_sleeve_type_length + 2)}+")