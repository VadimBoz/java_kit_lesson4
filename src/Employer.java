public class Employer {

    private String name;
    private String phone;
    private int experience;
    private int ID = 0;
    private static int counter = 0;

    public Employer(String name, String phone, int experience) {
        this.name = name;
        this.phone = phone;
        this.experience = experience;
        counter++;
        ID = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setAge(int experience) {
        this.experience = experience;
    }

    public int getID() {
        return ID;
    }


    @Override
    public String toString() {
        return "Employer{" + name + ", " + phone +
                ", experience= " + experience +  ", ID= " + ID +
                "}\n";
    }
}
