import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String idProduct;
        String name;
        String brand;
        Double price;
        String size;
        String material;
        char gender;
        String color;
        String sleeve_type;

        //struktur data
        ArrayList<Shirt> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data yang akan diinput dengan minimal 3 data: ");
        int i, n = 0;
        //exception handling
        try{
            n = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("The input is not an integer!");
        }

        System.out.println();

        if(n < 3){
            System.out.println("Minimal data yang harus diinput adalah 3");
        }
        else{
            //iterasi input data
            for(i = 0; i < n; i++){
                System.out.println("Silahkan masukkan data ke-" + (i + 1));
                System.out.print("ID: ");
                idProduct = sc.next();
                System.out.print("Nama Product: ");
                name = sc.next();
                System.out.print("Brand: ");
                brand = sc.next();
                System.out.print("Price: ");
                price = sc.nextDouble();
    
                System.out.print("Size: ");
                size = sc.next();
                System.out.print("Material: ");
                material = sc.next();
                System.out.print("Gender: ");
                gender = sc.next().charAt(0);
    
                System.out.print("Color: ");
                color = sc.next();
                System.out.print("Sleeve Type: ");
                sleeve_type = sc.next();

                System.out.println("Data Product berhasil ditambahkan");
                System.out.print("\n");

                list.add(new Shirt(idProduct, name, brand, price, size, material, gender, color, sleeve_type));
            }

            //output iterasi
            System.out.println("Data Product : ");
            //menentukan lebar maksimum untuk setiap kolom
            int maxIdLength = 2;//panjang minimal untuk judul kolom id
            int maxNamaLength = 12;//panjang minimal untuk judul kolom nama
            int maxBrandLength = 5;//panjang minimal untuk judul kolom brand
            int maxPriceLength = 5;//panjang minimal untuk judul kolom price
            int maxSizeLength = 4;//panjang minimal untuk judul kolom size
            int maxMaterialLength = 8;//panjang minimal untuk judul kolom material
            int maxGenderLength = 6;//panjang minimal untuk judul kolom gender
            int maxColorLength = 5;//panjang minimal untuk judul kolom color
            int maxSleeveTypeLength = 11;//panjang minimal untuk judul kolom sleeve type
        
            //menentukan lebar maksimum isi kolom
            for(Shirt shirt : list){
                maxIdLength = Math.max(maxIdLength, shirt.getIdProduct().length());
                maxNamaLength = Math.max(maxNamaLength, shirt.getName().length());
                maxBrandLength = Math.max(maxBrandLength, shirt.getBrand().length());
                maxPriceLength = Math.max(maxPriceLength, String.valueOf(shirt.getPrice()).length());
                maxSizeLength = Math.max(maxSizeLength, shirt.getSize().length());
                maxMaterialLength = Math.max(maxMaterialLength, shirt.getMaterial().length());
                maxGenderLength = Math.max(maxGenderLength, String.valueOf(shirt.getGender()).length());
                maxColorLength = Math.max(maxColorLength, shirt.getColor().length());
                maxSleeveTypeLength = Math.max(maxSleeveTypeLength, shirt.getSleeve_type().length());
            }
        
            //menentukan lebar kolom agar tidak terlalu sempit
            maxIdLength = Math.max(maxIdLength, "ID".length());
            maxNamaLength = Math.max(maxNamaLength, "Nama Product".length());
            maxBrandLength = Math.max(maxBrandLength, "Brand".length());
            maxPriceLength = Math.max(maxPriceLength, "Price".length());
            maxSizeLength = Math.max(maxSizeLength, "Size".length());
            maxMaterialLength = Math.max(maxMaterialLength, "Material".length());
            maxGenderLength = Math.max(maxGenderLength, "Gender".length());
            maxColorLength = Math.max(maxColorLength, "Color".length());
            maxSleeveTypeLength = Math.max(maxSleeveTypeLength, "Sleeve Type".length());
        
            //output
            //menentukan lebar judul kolom
            String format = "| %-"+ (maxIdLength) + "s | %-"+ (maxNamaLength) + "s | %-"+ (maxBrandLength) + "s | %-"+ (maxPriceLength) + "s | %-"+ (maxSizeLength) + "s | %-"+ (maxMaterialLength) + "s | %-"+ (maxGenderLength) + "s | %-"+ (maxColorLength) + "s | %-"+ (maxSleeveTypeLength) + "s | %n";
            //menentukan lebar garis pembatas baris
            String line = "+-" + "-".repeat(maxIdLength) + "-+-" + "-".repeat(maxNamaLength) + "-+-" + "-".repeat(maxBrandLength) + "-+-" + "-".repeat(maxPriceLength) + "-+-" + "-".repeat(maxSizeLength) + "-+-" + "-".repeat(maxMaterialLength) + "-+-" + "-".repeat(maxGenderLength) + "-+-" + "-".repeat(maxColorLength) + "-+-" + "-".repeat(maxSleeveTypeLength) + "-+";
            System.out.println(line);
            System.out.printf(format, "ID", "Nama Product", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");
            String linee = "+=" + "=".repeat(maxIdLength) + "=+=" + "=".repeat(maxNamaLength) + "=+=" + "=".repeat(maxBrandLength) + "=+=" + "=".repeat(maxPriceLength) + "=+=" + "=".repeat(maxSizeLength) + "=+=" + "=".repeat(maxMaterialLength) + "=+=" + "=".repeat(maxGenderLength) + "=+=" + "=".repeat(maxColorLength) + "=+=" + "=".repeat(maxSleeveTypeLength) + "=+";
            System.out.println(linee);
            //menampilkan data
            for(Shirt shirt : list){
                System.out.printf(format, shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), String.format("%.0f", shirt.getPrice()), shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeve_type());
                System.out.println(line);
            }
        }

        //close scanner
        sc.close();
    }
}