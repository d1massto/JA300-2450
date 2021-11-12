package lesson4;

public class HW2 {
    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber();
        p.numType = "Личный";
        p.num = 89214788565L;
        PhoneNumber pn = new PhoneNumber(88124795263L,"Рабочий");
        System.out.printf("%d - %s номер\n", p.num , p.numType);
        System.out.printf("%d - %s номер\n", pn.num , pn.numType);
    }
}
