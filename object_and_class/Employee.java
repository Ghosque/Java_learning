package object_and_class;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    // 构造器
    public Employee(String name){
        this.name = name;
    }
    // 设置age
    public void empAge(int empAge){
        age = empAge;
    }
    // 设置designation
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    // 设置salary
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    // 打印信息
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}
