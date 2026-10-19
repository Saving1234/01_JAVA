package lecture.section02.superkeyword;

import java.util.*;

public class Product {

    private String code; //상품코드
    private String brand; //브랜드
    private String name; //상품명
    private int price;    //가격
    private Date manufacturingDate; //제조일자

    public Product() {

        System.out.println("기본생성자 호출함");
    }

    public Product(String code, String brand, int price, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.manufacturingDate = manufacturingDate;

        System.out.println("모든 필드를 초기화하는 생성자 호출형...");
    }



    //getter/ setter

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    //tostring


    @Override    //objdet 클래스의 toString 오버라이딩 한 것.
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}

