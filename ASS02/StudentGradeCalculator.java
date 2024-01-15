import java.util.Scanner;

class StudeInfo {
    int marks = 0;
    int total = 0;
    String sub = null;

    public int accept(int n) {
         Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Subject name: ");
            sub = sc.next();
            System.out.println("Enter the obtained marks(out of 100): ");
            marks = sc.nextInt();
            if (marks > 100 || marks < 0) {
                while (true) {
                    System.out.println("Enter valid marks!!!");
                    marks = sc.nextInt();
                    if (marks > 100 || marks < 0) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
            total = total + marks;
        }
        System.out.println("Total marks: " + total);
        return total;

    }

    public  int Avg(int per,int n) {
        per = total / n;

        System.out.println("Obtained Percentage:" + per + "%");
        return per;
    }

    public  void Grade(int per) {
        if (per > 90) {
            System.out.println("Grade: A+");
        } else if (per > 80 || per <= 90) {
            System.out.println("Grade: B");
        } else if (per > 70 || per <= 80) {
            System.out.println("Grade: C");
        } else if (per > 60 || per <= 70) {
            System.out.println("Grade: D");
        } else if (per > 35 || per <= 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Fail");
        }

    }

}

public class StudentGradeCalculator {
    public static void main(String[] args) {

        System.out.print("Enter the Number of Subjects: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StudeInfo ob = new StudeInfo();

        int total= ob.accept(n);
        int per=ob.Avg(total,n);
        ob.Grade(per);

    }

}
