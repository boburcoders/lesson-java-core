package classesInJava;

public class Test {

    /*
     * public class Main{} oddiy class
     * public abstract class Main1{}
     * public interface Main2{}
     * public record UserDto(String name, String password)...
     * public enum UserRole{ ADMIN,USER,STAFF}
     * public class Response<T> {}
     * */
    // Wrapper classes int -> Integer, long-> Long, double -> Double, char-> Charachter, boolean-> Boolean ( Heap joylashadi)
    // Genericlar bilan ishlash uchun, null qiymat qabul qilishi uchun, utilita metodlari bor, collection bilan ishlaydi.
    public static void main(String[] args) {
        /*Wrapper classlar:
         * oddiy class: filed, method, constructor, entity classlar, service, utilita, object yaratsa boladi, extend qilsa boladi;
         * absatract class: fieldlar yozsa boladi, abstract method, oddiy  metod, object yaratib, extend qilsa boladi,
         * interface class: public abstract method, default method, static method, public static final  fieldlar boladi. implement, multi inheritance ruxsat bor
         * record class: Data class, immutable class, UserRequestDto, getter builtin,  allagrs constructor;
         * enum class: static qiymatlarni oladi, ADMIN, admin
         * generic class: generic programming, bitta code universal code yozish, sealed,
         *
         * */


        ProductRequestDto requestDto = new ProductRequestDto("Olma", 12.0, 2.5, "hol");

        Product product = new Product();
        product.setName(requestDto.name());
        product.setPrice(requestDto.price());
        product.setQuantity(requestDto.quantity());
        product.setType(ProductType.valueOf(requestDto.type().toUpperCase()));
//
//        UserRole role1 = UserRole.valueOf("admin");
//
//        System.out.println(role1);

        // getProduct

        ProductResponse productResponse =
                new ProductResponse(product.getName(), product.getPrice(), product.getQuantity(), product.getType().name());

        Response<ProductResponse> response = new Response<>();
        response.setMessage("ok");
        response.setSuccess(true);
        response.setData(productResponse);
        System.out.println(response);

        Response<Order> orderResponse = new Response<>();
        orderResponse.setMessage("ok");
        orderResponse.setSuccess(true);
        orderResponse.setData(new Order("01223", "Yunsobot 15, 39"));
        System.out.println(orderResponse);

    }
}
