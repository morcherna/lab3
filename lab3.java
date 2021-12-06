import java.util.Scanner;
import java.util.regex.*;

public class Task3 {
    // Пользователь вводит с клавиатуры строчку, являющуюся паролем.
    //Проверить, надежно ли составлен пароль. Пароль считается надежным,
    //если он состоит из 8 или более символов. Символом может быть цифра,
    //английская буква, знак подчеркивания. Пароль должен содержать хотя бы
    //одну заглавную букву, одну маленькую букву и одну цифру.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        Pattern p = Pattern.compile("(?=.*[A-z])(?=.*[a-z])(?=.*[\\d])(?=.*[_]){8,}");
        Matcher m = p.matcher(password);
        if (m.find()) {
            System.out.print("Пароль надежный!");
        }
        else {System.out.print("Пароль ненадежный!");}
    }
}