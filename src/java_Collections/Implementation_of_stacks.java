package java_Collections;
import java.util.Scanner;
public class Implementation_of_stacks {

        int top;
        int maxsize = 10;
        int[] arr = new int[maxsize];


        boolean isEmpty()
        {
            return (top < 0);
        }
        Implementation_of_stacks()
        {
            top = -1;
        }
        boolean push (Scanner sc)
        {
            if(top == maxsize-1)
            {
                System.out.println("Overflow !!");
                return false;
            }
            else
            {
                System.out.println("Enter Value");
                int val = sc.nextInt();
                top++;
                arr[top]=val;
                System.out.println("Item pushed");
                return true;
            }
        }
        boolean pop ()
        {
            if (top == -1)
            {
                System.out.println("Underflow !!");
                return false;
            }
            else
            {
                top --;
                System.out.println("Item popped");
                return true;
            }
        }
        void display ()
        {
            System.out.println("Printing stack elements .....");
            for(int i = top; i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
        boolean purge() {
            return top == maxsize-1;
        }
    }


    class Main {

        public static void main(String[] args) {
            int choice=0;
            Scanner sc = new Scanner(System.in);
            Implementation_of_stacks s = new Implementation_of_stacks();
            System.out.println("Stack is not created");

            while(choice != 6)
            {
                System.out.println("-----------MENU----------");
                System.out.println("1.Create a new stack\n2.Push a value\n3.Pop the value\n4.Display the top value\n5. Purge the stack");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                if(choice == 1){
                    s = new Implementation_of_stacks();
                    continue;
                }

                switch(choice)
                {
                    case 2:
                    {
                        s.push(sc);
                        break;
                    }
                    case 3:
                    {
                        s.pop();
                        break;
                    }
                    case 4:
                    {
                        s.display();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Is stack full: " + s.purge());
                        break;
                    }
                    default:
                    {
                        return;
                    }
                }
            }
        }
    }

