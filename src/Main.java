public class Main {
    public static void main(String[] args) {
        Employers employers = new Employers();
        employers.addEmployer("Serg", "89608832786", 2);
        employers.addEmployer("Oleg", "89608832784", 3);
        employers.addEmployer("Sofia", "89608832780", 4);
        employers.addEmployer("Alex", "89608832785", 1);
        employers.addEmployer("Mikl", "89608832745", 5);
        employers.addEmployer("Zinaida", "89608832734", 6);
        employers.addEmployer("Svetnana", "89608832743", 2);
        employers.addEmployer("Dmitriy", "89608832751", 1);
        employers.addEmployer("Alexander", "89608832754", 1);
        employers.addEmployer("Serg", "89608832756", 0);
        employers.addEmployer("Valadimir", "89608832723", 0);
        employers.addEmployer("Dmitriy", "89608832700", 1);


        System.out.println(employers.getAllEmployers());

        System.out.println("--------------------   employers by experience   --------------------");
        System.out.println(employers.getEmployersByExperience(1));

        System.out.println("--------------------   phone number by employers   --------------------");
        System.out.println(employers.getPhoneNumberByEmployer("Dmitriy"));


        System.out.println("--------------------   find emplouer by ID    --------------------");
        System.out.println(employers.getEmployerByID(1));

    }
}