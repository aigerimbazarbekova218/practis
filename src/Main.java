import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Phone phone1=new Phone("IPhone11",Brand.APPLE,Color.WHITE,OperationSystem.IOS,56000);
        Phone phone2=new Phone("Iphone12", Brand.APPLE, Color.GOLD,OperationSystem.ANDROID,67000);
        Phone phone3= new Phone("Iphone13", Brand.APPLE, Color.BLACK, OperationSystem.IOS,70000);
        Phone[] phone=new Phone[]{phone1, phone2, phone3};


        for (int i = 0; i < phone.length; i++) {
            if(phone[i].getOperationSystem()!=OperationSystem.ANDROID) {

            }
        }
        System.out.println("Айфон не может иметь другую операционную систему!");

        //System.out.println(" IOS - OC для Apple");
        Phone phone4=new Phone("Samsung 21s",Brand.SAMSUNG,Color.RED,OperationSystem.ANDROID,60000);
        Phone phone5=new Phone("Samsung 30A",Brand.XIAOMI,Color.GOLD,OperationSystem.ANDROID,34000);
        Phone phone6=new Phone("Samsung 32a",Brand.SAMSUNG,Color.BLACK,OperationSystem.IOS,44500);
        Phone phone7=new Phone("Samsung a54",Brand.SAMSUNG,Color.WHITE,OperationSystem.ANDROID,44555);
        Phone[] phones=new Phone[]{phone4,phone5,phone6,phone7};
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getOperationSystem() != OperationSystem.IOS) {
                phones[i].getOperationSystem().setUse(OperationSystem.ANDROID.getUse());
                System.out.println(phones[i]);
            }
        }
        Scanner scanner=new Scanner(System.in);
        Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase());
        Phone phone8=new Phone("Iphone",Brand.APPLE,Color.BLACK,OperationSystem.IOS,55566);
        Phone phone9=new Phone("Samsung", Brand.SAMSUNG,Color.RED,OperationSystem.ANDROID,66666);
        Phone phone10=new Phone("Xiaomi", Brand.XIAOMI,Color.GOLD,OperationSystem.ANDROID,99999);
        Phone phone11=new Phone("Meizu", Brand.SAMSUNG,Color.WHITE,OperationSystem.ANDROID,26777);
        Phone phone12=new Phone("OPPO", Brand.SAMSUNG, Color.GOLD,OperationSystem.ANDROID,34455);
        Phone[] phones1=new Phone[]{phone8,phone9,phone10,phone11,phone12};


        for (int i = 0; i <phones1.length ; i++) {
            if(brand==phones1[i].getBrand()){
                System.out.println(phones1[i]);
                System.out.println("Телефоны с брендом "+ brand);
            }

        }





        Shop shop=new Shop("World",phones1);
        System.out.println(shop.quantityOfPhones());
        System.out.println(shop.arif());
        System.out.println(shop.maxPrice());

        Shop shop1=new Shop("Telephone", phones1);


    }
}