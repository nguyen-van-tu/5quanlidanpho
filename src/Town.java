import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Town {
    private HouseHolds houseHolds;

    HouseHolds h = new HouseHolds();
    Person person = new Person();
    ArrayList<HouseHolds> holdsArrayList = new ArrayList<>();
    ArrayList<Person> personArrayList = new ArrayList<>();

    public void add() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nhà");
        h.setHouseNum(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập số thành viên");
        h.setMembersNum(Integer.parseInt(sc.nextLine()));
        personArrayList.add(person);
        do {
            System.out.println("Nhập tên");
            person.setName(sc.nextLine());
            System.out.println("Nhập năm sinh");
            person.setYearOfBirth(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập nghề nghiệp");
            person.setJob(sc.nextLine());
            holdsArrayList.add(h);
        } while (h.getMembersNum() != holdsArrayList.size());

        h.setPerson(personArrayList);

    }

    public void showHouseHolds() {
        for (HouseHolds h : holdsArrayList) {
            System.out.println(h.toString());
        }
//        for (Person p: personArrayList) {
//            System.out.println(p.toString());
//        }
    }

    public void check() {
        if (LocalDateTime.now().getYear() - person.getYearOfBirth() == 80) {
            System.out.println("người mừng thọ năm nay là : " + person.toString());
        }else {
            System.out.println("Không có người nào 80 tuôii");
        }
    }
}
