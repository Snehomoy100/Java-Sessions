import java.util.Scanner;

class Operators {
    public static void main(String[] args){
        // operators
    

        // Artithmetic operators
        int a = 10;
        int b = 12;
        int c = 12;
        int z = (a + b * c); // precidence 
        System.out.println(z);


        // Unary operators
        z = a++; // post increment & similar is the post decrement as well. e.g - z = a--;
        System.out.println(z + " " + a);
        z = ++a; // pre increment & similar is the pre decrement as well. e.g - z = --a;
        System.out.println(z + " " + a);


        // Assignment operators
        int x = 10;
        int y = 5;
        x += y; // => x = x + y
        System.out.println(x);
        x %= y; // x = x % y (% gives the remainder after deviding x with y)
        System.out.println(x);
        int s = x = y; // here comes the associativity with is Right to Left for assignment operators.
        System.out.println(s);
    }
}



class Logical_Operator {
    public static void main(String[] args) {

        // Logical operator
        String usr = "User"; 
        String pwd = "Password";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your user id: ");
        String iu = input.next();
        System.out.println("Enter your password: ");
        String ip = input.next();

        if (usr.equals(iu) && pwd.equals(ip)) { // logical AND operator
            System.out.println("You're Welcome!");
        } else if(usr.equals(iu) || pwd.equals(ip)){ // logical OR operator
            System.out.println("Your user id or password is incorrect!");
        } else{
            System.out.println("You don't have an account!");
        }

        input.close();

        boolean x = true;
        System.out.println(!x); // logical NOT operator.
    }
}