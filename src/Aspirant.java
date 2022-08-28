public class Aspirant extends Student {
    String Science;

    public Aspirant (String Firstname, String Lastname,int group, double averageMark, String Byology){
        super(Firstname, Lastname, group, averageMark);
        this.Science = Byology;

    }

    public Aspirant() {

    }

    public static void main(String[] args){
        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        student.getScholarship();
        aspirant.getScholarship();
    }
    @Override
    void getScholarship() {
        if (averageMark == 5) {
            System.out.println("стипендия 200 рублей");
        } else {
            System.out.println("стипендия 180 рублей");
        }
    }

}
