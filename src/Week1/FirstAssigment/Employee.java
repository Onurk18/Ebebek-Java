package Week1.FirstAssigment;

public class Employee {
    String name;
    float salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) { //kurucu metot
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){ //tax() metodu vergiyi hesaplar ve return eder.
        double tax;
        if(salary<1000){
            tax=0;
        }
        else {
            tax= salary*0.03;
        }
        return tax;
    }
    public int bonus(){ //bonus() metodu bonusu hesaplar ve return eder.
        int bonus=0;
        if (workHours>40){
            bonus=(workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){ //raiseSalary() metodu maaş artışını return eder.
        double raise;
        int workingTime=2021-hireYear;
        if (workingTime<10){ //çalıştığı yıla göre hesaplanır.
            raise=salary*0.05;
        }
        else if (workingTime<20){
            raise=salary*0.1;
        }
        else {
            raise=salary*0.15;
        }
        return raise;
    }

    @Override
    public String toString() { //toString metodu override edilip direkt yazdırılmak için kullanılır.
        double t=tax();
        int b=bonus();
        double r=raiseSalary();
        String string;
        string="Adı:"+name+
                "\nMaaşı: "+salary+
                "\nÇalışma Saati :"+workHours+
                "\nBaşlangıç Yılı :"+hireYear+
                "\nVergi: "+t+
                "\nBonus: "+b+
                "\nMaaş Artışı: "+r+
                "\nVergi ve Bonuslar ile birlikte maaş: "+(salary+b-t)+
                "\nToplam maaş: "+(salary+b+r-t);
        System.out.println(string);
        return string;
    }

    public static void main(String[] args) {
        Employee onur= new Employee("Onur",2000,45,2012); //çıktı denemesi
        System.out.println(onur.toString());
    }
}

