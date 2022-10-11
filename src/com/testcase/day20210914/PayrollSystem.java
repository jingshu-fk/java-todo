package com.testcase.day20210914;
/*
员工工资信息系统：
    新增员工
    验证员工是否存在
    修改员工工资
    查询员工工资
    删除员工
    获取员工记录
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayrollSystem {
    HashMap<String, Double> employee;
    final String salaryInfo = "D:\\JavaWorkSpace\\StartOne\\src\\com\\testcase\\day20210914\\employee.txt";

    public PayrollSystem() {
        employee = new HashMap<>();
    }

    public void increaseUser(String user, double salary) throws IOException {
        try(Writer writer = new FileWriter(salaryInfo)) {
            String empInfo = user + " " + salary;
            writer.write(empInfo + "\n");
        }
    }

    public boolean employeeExist(String user) throws IOException {
        if(employee.containsKey(user)){
            return true;
        }else {
            return getEmployee().containsKey(user);
        }
    }

    public void deleteEmployee(String user) throws IOException {
        employee.remove(user);
        try (Writer writer = new FileWriter(salaryInfo)) {
            for (Map.Entry<String, Double> entry : employee.entrySet()) {
                String intoMsg = entry.getKey() + " " + entry.getValue() + "\n";
                writer.write(intoMsg);
            }
        }
    }

    public void putSalary(String user, double salary) throws IOException{
        employee.put(user, salary);
        try(Writer writer = new FileWriter(salaryInfo)) {
            for(Map.Entry<String, Double> entry: employee.entrySet()){
                String intoMsg = entry.getKey() + " " + entry.getValue() + "\n";
                writer.write(intoMsg);
            }
        }
    }

    public double selectSalary(String user){
        return employee.get(user);
    }

    public HashMap<String, Double> getEmployee() throws IOException {
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream(salaryInfo), StandardCharsets.UTF_8)){
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt = null;
            while((lineTxt = bufferedReader.readLine()) != null){
                System.out.println("lineTxt=" + lineTxt);
                String empName = lineTxt.split(" ")[0];
                double empSalary = Double.parseDouble(lineTxt.split(" ")[1]);
                employee.put(empName, empSalary);
            }
        }
        return employee;
    }

    public void common() throws IOException {
        String textMsg = "######################################\n" +
                "            员工工资信息表             \n" +
                "#######################################\n" +
                "1、查询员工工资\n" +
                "2、修改员工工资\n" +
                "3、增加新员工记录\n" +
                "4、删除员工记录\n" +
                "5、退出";
        System.out.println(textMsg);
        System.out.println("请输入操作代码：");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if(choice == 1){
            System.out.println("请输入要查询的员工姓名：");
            String upUser = s.next();
            if(employeeExist(upUser)){
                System.out.println(upUser + "的工资为：" + selectSalary(upUser));
            }else {
                System.out.println("员工不存在！");
            }
        }else if(choice == 2){
            System.out.println("请输入要修改员工的姓名和工资，以空格分隔：");
            String upUser = s.nextLine();
            String empName = upUser.split(" ")[0];
            double empSalary = Double.parseDouble(upUser.split(" ")[1]);
            if(employeeExist(empName)){
                putSalary(empName, empSalary);
                System.out.println(empName + "的工资修改成功");
            }else {
                System.out.println("员工不存在");
            }
        }else if(choice == 3){
            System.out.println("请输入要新增员工的姓名和工资，以空格分隔：");
            String upUser = s.nextLine();
            System.out.println(upUser);

            String empName = upUser.split(" ")[0];
            double empSalary = Double.parseDouble(upUser.split(" ")[1]);
            if(employeeExist(empName)){
                System.out.println("员工记录已存在！");
            }else {
                increaseUser(empName, empSalary);
                System.out.println("新增成功！");
            }
        }else if(choice == 4){
            System.out.println("请输入要删除的员工姓名：");
            String upUser = s.next();
            if(employeeExist(upUser)){
                deleteEmployee(upUser);
            }else {
                System.out.println("员工不存在");
            }
        }else if(choice == 5){
            System.out.println("退出成功");
        }
    }
}
