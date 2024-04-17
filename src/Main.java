import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.next();
        try{
            if(a==null){
                throw new NullPointerException("value is null");
            }
            int number = Integer.valueOf(a);
            System.out.println(number);

        }catch (NullPointerException nullPointerException){
            System.out.println("value is null");
        }catch (NumberFormatException numberFormatException){
            System.out.println("value is not number");
        }catch (Exception e){
            System.out.println("unexcepted error");
        }
    }
}