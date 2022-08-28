public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.Firstname = "Alex";
        student.Lastname = "Petrov";
        var i = "12";
        student.group = Integer.parseInt(i);
        student.averageMark = 4.5;

        Aspirant aspirant = new Aspirant();
        aspirant.Firstname = "Oleg";
        aspirant.Lastname = "Ivanov";
        var j = "122";
        aspirant.group = Integer.parseInt(j);
        aspirant.averageMark = 5;

        student.getScholarship();
        aspirant.getScholarship();}
}
