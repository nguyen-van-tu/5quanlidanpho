import java.util.ArrayList;

public class HouseHolds {
    private int houseNum;
    private int membersNum;
    private ArrayList<Person> personArrayList;

    public HouseHolds(int houseNum, int membersNum, ArrayList<Person> personArrayList) {
        this.houseNum = houseNum;
        this.membersNum = membersNum;
        this.personArrayList = personArrayList;
    }

    public HouseHolds() {

    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public int getMembersNum() {
        return membersNum;
    }

    public void setMembersNum(int membersNum) {
        this.membersNum = membersNum;
    }

    public ArrayList<Person> getPerson() {
        return personArrayList;
    }

    public void setPerson(ArrayList person) {
        this.personArrayList = person;
    }

    @Override
    public String toString() {
        return "HouseHolds{" +
                "houseNum='" + houseNum + '\'' +
                ", membersNum=" + membersNum +
                ", person=" + personArrayList +
                '}';
    }
}
