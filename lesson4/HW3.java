package lesson4;

public class HW3 {
    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber(8921124124L,"Личный");
        p.print();
        System.out.println(p.getNum(89215456344L));
        p.changeType("Рабочий");
        p.print();
    }
}
