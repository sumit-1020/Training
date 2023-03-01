package Assignments;

import java.util.Scanner;
public class Calender {
public static int CallYear() 
{
Scanner sc = new Scanner(System.in);
System.out.printf("Enter a Year between 2000 to 2400: ");
int year = sc.nextInt();
//sc.close();
return(year);
}
public static void main(String[] args) {
int i = 0;
while (i<=10) {
int year = CallYear();
if ((year <= 1999) || (year >=2401)) {
System.out.println("Invalid input.");
i=i+1;
continue;
}
else {
System.out.println("Valid Year.");
break;
}}}}
