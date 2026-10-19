package InterviewQuestion;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder()
                .sku("Gaurav")
                .title("Gupta")
                .price(100.0)
                .price(99.00)
                .quantity(25)
                .build();

        Product products = Product.ProductBuilder.builder()
                .sku("XXX")
                .title("Gupta")
                .price(100.0)
                .price(99.00)
                .quantity(25)
                .build();
//        mockEmployee = Employee.builder()
//                .id(1L)
//                .email("Anuj@gmail.com")
//                .name("Anuj")
//                .salary(200L)
//                .build();


        System.out.println(products);
    }
}
