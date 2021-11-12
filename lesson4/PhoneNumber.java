package lesson4;

public class PhoneNumber {
    long num;
    String numType;

    PhoneNumber(){
        numType = "";
    }

    PhoneNumber(long l, String s){
        num = l;
        numType = s;
    }

    void print(){
        System.out.printf("Телефонный %s номер: %d\n", numType, num);
    }

    void changeType(String s){
        numType = s;
    }

    long getNum(long l){
        return num;
    }
}
