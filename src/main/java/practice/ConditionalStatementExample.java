package practice;

public class ConditionalStatementExample {

    public void IfStatements() {
        int x = 40;
        if (x < 20) {
            System.out.println("This is if statement");

        } else {
            System.out.println("This is else statement ");

        }


    }

    public void NestedIfStatement() {
        int x = 30;
        int y = 10;
        if (x < 35) {
            if (y < 15) {
                System.out.println("x =" + x + "and y=" + y);

            }
        }
    }

    public void IfStatement2()
    {char grade='C';

        if (grade == 'A') {
            System.out.println("you did excellent in exam");
        } else if (grade == 'B') {
            System.out.println("you did well in the exam");
        } else if (grade == 'C') {
            System.out.println("you did average in the exam");
        } else if (grade == 'D') {
            System.out.println("you failed in the exam");
        } else {
            System.out.println("you have invalid entry");
        }

    }

          public void SwitchStatement(){

        char grade ='C';
        switch(grade) {

            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("well done");
                break;
            case 'D':
                System.out.println("you passed");
            case 'F':
                System.out.println("better try again");
                break;
            default:
                System.out.println("invalid game");
        }
               System.out.println("your grade is " + grade);}

        }







