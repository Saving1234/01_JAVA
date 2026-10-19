package lecture.problemLv2.one;

public class Manager extends Employee{

    @Override
    public void printInfo(String name, int salary) {
        System.out.println("이름 : " + name + " 연봉 : " + salary);

    }
}
