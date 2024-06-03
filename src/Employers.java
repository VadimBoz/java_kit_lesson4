import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employers {
    private final ArrayList<Employer> employers;


    public Employers() {
        employers = new ArrayList<Employer>();
    };

    public void addEmployer(String name, String phoneNumber, int experience){
        employers.add(new Employer(name, phoneNumber, experience));
    }

    public ArrayList<Employer> getEmployersByExperience (int experience) {
        return employers.stream().filter(e -> e.getExperience() == experience).
                collect(ArrayList<Employer>::new, ArrayList<Employer>::add, ArrayList<Employer>::addAll);
    }


    public ArrayList<Employer> getAllEmployers() {
        return employers;
    }

    public ArrayList<String> getPhoneNumberByEmployer(String employerName)  {
        return employers.stream().filter(e -> e.getName().equals(employerName)).map(Employer::getPhone).
                collect(ArrayList<String>::new, ArrayList<String>::add, ArrayList<String>::addAll);
    }

    public Employer getEmployerByID(int ID) {
        return employers.stream().filter(e  -> e.getID() == ID).findFirst().orElse(null);
    }


}
