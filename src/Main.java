import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Town town = new Town();
        int input;
        do {
            System.out.println("1: Thêm dộ dân");
            System.out.println("2: Hiển thị");
            System.out.println("3: Người mừng thọ 80 tuổi");
            System.out.println("0: Exit");
            System.out.println("-----------");
            input = Integer.parseInt(sc.nextLine());

            switch (input){
                case 1:
                    town.add();
                    break;
                case 2:
                    town.showHouseHolds();
                    break;
                case 3:
                    town.check();
            }

        }while (input != 0);
    }
}
