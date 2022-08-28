public class Student {
    String  Firstname;
    String Lastname;
    int group;
    double averageMark;
    public Student(String Firstname, String Lastname,int group, double averageMark){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {

    }

    String Firstname() {return this.Firstname;}
    String Lastname() {return this.Lastname;}
    int group() {return this.group;}
    double averageMark() {return this.averageMark;}

    void getScholarship() {
        if (averageMark == 5) {
            System.out.println("стипендия 100 рублей ");
        } else {
            System.out.println("стипендия 80 рублей");
        }

    }


}
