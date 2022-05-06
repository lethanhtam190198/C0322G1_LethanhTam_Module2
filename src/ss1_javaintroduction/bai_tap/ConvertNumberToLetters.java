package ss1_javaintroduction.bai_tap;

import java.util.Scanner;

public class ConvertNumberToLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc ");
        int number = sc.nextInt();
        int number1=number/10;
        int number2=number%10;
        String Convertnumbertoletters= "";
            switch (number1) {
                case 1:
                    Convertnumbertoletters="Ten";
                    break;
                case 2:
                    Convertnumbertoletters=" Twenty";
                    break;
                case 3:
                    Convertnumbertoletters=" Thirty";
                    break;
                case 4:
                    Convertnumbertoletters=" fourty";
                    break;
                case 5:
                    Convertnumbertoletters=" fivty";
                    break;
                case 6:
                    Convertnumbertoletters=" sixty";
                    break;
                case 7:
                    Convertnumbertoletters=" seventy";
                    break;
                case 8:
                    Convertnumbertoletters=" eighty";
                    break;
                case 9:
                    Convertnumbertoletters=" ninety";
                    break;
            }
            switch (number2) {
                case 1:
                    if(number1==1){
                        Convertnumbertoletters="eleven";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+"one";
                    break;
                case 2:
                    if(number1==1){
                        Convertnumbertoletters="Twetly";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+ "two";
                    break;
                case 3:
                    if(number1==1){
                        Convertnumbertoletters="Thirteen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+"three";
                    break;
                case 4:
                    if(number1==1){
                        Convertnumbertoletters="fourteen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+" four";
                    break;
                case 5:
                    if(number1==1){
                        Convertnumbertoletters="fifteen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+" five";
                    break;
                case 6:
                    if(number1==1){
                        Convertnumbertoletters="sixteen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+" six";
                    break;
                case 7:
                    if(number1==1){
                        Convertnumbertoletters="seventeen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+" seven";
                    break;
                case 8:
                    if(number1==1){
                        Convertnumbertoletters="eighteen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+" eight";
                    break;
                case 9:
                    if(number1==1){
                        Convertnumbertoletters="nineteen";
                        break;
                    }
                    Convertnumbertoletters=Convertnumbertoletters+" nine";
                    break;
            }
        if (!Convertnumbertoletters.equals("")) System.out.printf("Number '%d' has %s", number, Convertnumbertoletters);
        else System.out.print("Invalid input!");
        }
    }

