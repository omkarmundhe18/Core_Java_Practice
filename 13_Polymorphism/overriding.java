public class overriding {
    

public static void main(String[] args) {
    FullTimeemployee obj = new  FullTimeemployee();
    obj.baseSalary = 1000;
    obj.name ="Mansur";
    obj.bonus=300.00;
    obj.calculateSalary(); 
    obj.ShowDeatils();
    
}
}

class employee{
    String name;
    double baseSalary;


    //method to calculate salary (can be overriding)
    public double calculateSalary() {
        return baseSalary;//defult logic
    }

    public void ShowDeatils(){
        System.out.println("Employee: "+name + ",Salary: " + calculateSalary());
    }
}

class FullTimeemployee extends employee{
    double bonus;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return baseSalary + bonus;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("FullTimeEmployee: "+name + ",Salary: " + calculateSalary());
    }
}

class partTimeemployee extends employee{
    int hoursworked;
    double hourlyRate;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return hoursworked * hourlyRate;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("part-time Employee: "+name + ",Salary: " + calculateSalary());
    }
}


class temperoryemployee extends employee{
    int dayssworked;
    double dailyyRate;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return dayssworked * dailyyRate;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("temperory Employee: "+name + ",Salary: " + calculateSalary());
    }
}