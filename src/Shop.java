import java.util.Arrays;

public class Shop {
    private String name;
    private Phone[]phones;

    public Shop(String name, Phone[] phones) {
        this.name = name;
        this.phones = phones;
    }

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }
    public int quantityOfPhones(){
        return phones.length;
    }
    public int maxPrice(){
        int max = 0;
        for(Phone phone : phones){
            max = Math.max(phone.getPrice(),0);
        }
      return max;
    }
    public int arif(){
        int summa=0;
        summa+= quantityOfPhones();
       return summa/phones.length;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}
