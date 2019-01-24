/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to finish the extra credit question. 
 * The deadline of this assignment is 01/25/2019 23:59 PST.
 * Please feel free to contact Fiona for any questions.
 * TA office hour: Tuesday 1 pm -- 4 pm
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    this.name=name;
   	 this.age=age;
   	 this.gender=gender;
   	 this.salary=salary;
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    	return this.name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    	this.name=name;    	
    }
    
    public void raiseSalary(double byPercent)
    {
    	double increase;
    	increase= (byPercent/100)*this.salary;
    	this.salary= this.salary+increase;
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
	// Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
    	double sST;
    	if (employee.salary<=8900)
    	{
    		sST= .062*employee.salary;
    	}
    	else
    	{
    		sST=.062*106800;
    	}
		System.out.println("the Social Security Tax is"+ sST);
    	return sST;    	
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
    	double InsCov = 0;
    	if(employee.age<35)
    	{
    		InsCov=.03*employee.salary;
    	}
    	else if(employee.age>35 && employee.age<50)
    	{
    		InsCov=.04*employee.salary;
    	}
    	else if(employee.age>50 && employee.age<60)
    	{
    		InsCov=.05*employee.salary;
    	}
    	else
    		InsCov=.06*employee.salary;
    	
    	return InsCov;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
    	Employee e;
    	if (e1.salary>e2.salary)
    	{
    		e=e1;
    		e1=e2;
    		e2=e;
    	}
    	if(e2.salary>e3.salary)
    	{
    		e=e2;
    		e2=e3;
    		e3=e;
    	}
    	if (e1.salary>e2.salary)
    	{
    		e=e1;
    		e1=e2;
    		e2=e;
    	}
    	System.out.println("The sorted employees according to salary are"+e1.name+" " +e2.name+" " + e3.name);

    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)  
     */
    public void tripleSalary(Employee employee) {
    	employee.salary= 3*employee.salary;
    }
   
    


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Your Answer:
     When Instance(or object) of any class is passed in a method, 
     its copy is created and it is used inside the method instead of the original instance itself.
     So the objects which are getting swapped reflect no changes back in the main method, where swap() is invoked.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Employee c = new Employee("Jeremy", 30, Gender.MALE, 1500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);//
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        new Assignment2().sortSalary(a,b,c);
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
