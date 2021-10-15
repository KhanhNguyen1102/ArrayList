package manager.service;

import manager.model.Employee;

public class ManagerEmployee implements ServiceEmployee{
    private Employee[] empList = new Employee[3];
    private int size = 0;
    @Override
    public int add(Employee person) {
        if (size<empList.length) {
            empList[size] = person;
            size++;
            return 1;
        }else
        return 0;
    }

    @Override
    public void print() {
        for (Employee employee : empList) {
            System.out.println(employee);
        }
        System.out.println("------------------------------");
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < empList.length; i++) {
            if (empList[i].getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int id,Employee person) {
        empList[find(id)]=person;

    }

    @Override
    public void delete(int id) {
        empList[find(id)] = null;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ánh",1,2000,"white house");
        Employee emp2 = new Employee("Khánh",2,3000,"Black house");
        Employee emp3 = new Employee("Hương",3,3000,"sky");
        ManagerEmployee list = new ManagerEmployee();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.print();
        System.out.println(list.find(2));
        Employee emp4 = new Employee("Như Anh", 4 ,100000,"CodeGym");
        list.update(3,emp4);
        list.print();
        list.delete(4);
        list.print();
    }
}
