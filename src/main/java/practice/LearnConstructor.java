package practice;

public class LearnConstructor {
    int a;
    int b;
    int c;
    int d;
    int e;    // WE NEVER USE ANY RETURN TYPE IN CONSTRUCTOR

    public LearnConstructor() {   //FIRST CONSTRUCTOR
        a = 10;
        b = 15;
        c = 13;
    }

    //SECOND CONSTRUCTOR
    public LearnConstructor(int a, int b, int c) {

        this.a = a;
        this.b = a;
        this.c = c;
    }

        public static void main(String[] args){
            LearnConstructor myObj1 = new LearnConstructor();
            // myObj.a=10; [here we assigned the values on object level]
            //  myObj.b=15; [but in constructor we assign the values on class level]
            //  myObj.c=13;

            System.out.println("myObj1 a=" + myObj1.a);
            System.out.println("myObj b=" + myObj1.b);
            System.out.println("myObj c=" + myObj1.c);


            LearnConstructor myObj2 = new LearnConstructor(101, 103, 119);

            System.out.println("myObj a=" + myObj2.a);
            System.out.println("myObj b=" + myObj2.b);
            System.out.println("myObj c=" + myObj2.c);
        }

    }
