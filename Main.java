import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while(isContinue){
            System.out.println("Выберите куда двинуться: \n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево");
            int input = new Scanner(System.in).nextInt();
            if (input==1){
                y++;
            } else if(input==2){
                y--;
            } else if (input==3) {
                x++;
            } else if (input==4) {
                x--;
            } else {
                System.out.println("Error");
                isContinue=false;
            }
            System.out.println("Координаты робота: по вертикали 1"+ y + ", по горизонтали " + x);
        }
       /* boolean isContinue = false;
        do {
            System.out.println("hello");
            } while (isContinue);
        }
       /* boolean isContinue = true;
        while(isContinue){
            System.out.println("hello");
            System.out.println("continue? (1/0)");
            int input = new Scanner(System.in).nextInt();
            if (input==0){
                isContinue = false;
            }
        } */
        /*for (int i = 0; i < 10; i++){
            if (i<3 || i>7){
                continue;
            }
            System.out.println(i);
        } */
      /*  for (int i = 0;i<5;i++){
            if (i==3){
                continue;
            }
            System.out.println("hello");
        } */
    }
}
