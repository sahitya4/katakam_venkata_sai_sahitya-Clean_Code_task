import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {

        Scanner s = new Scanner(System.in);


        System.out.format("Enter your choice: \n1.Interest \n2.House-construction\n");
        int option = s.nextInt();
        if(option==1)
        {
            System.out.format("Enter principle amount:\n");
            double principleamount = s.nextDouble();
            System.out.format("Enter time period:\n");
            int time = s.nextInt();
            System.out.format("Enter rate of interest:\n");
            double rate = s.nextDouble();
            System.out.format("Enter your choice: \n1.Simple \n2.Compound\n");
            int  choice = s.nextInt();

            if(choice==1)
            {
                Interest simple = new Interest(principleamount,time,rate);
                double res1=simple.simple_interest();
                System.out.format("Total Interest: "+res1);

            }
            else if(choice==2)
            {
                Interest simple = new Interest(principleamount,time,rate);
                double res1 = simple.compound_interest();
                System.out.format("Total Interest: "+res1);
            }
            else
            {
                System.out.format("Please enter valid input..");
            }
        }

        else if(option==2)
        {
            System.out.format("Enter material type(standard/above-standard/high-standard):\n");
            String material = s.next();
            System.out.format("Enter total area:\n");
            double area = s.nextDouble();
            System.out.format("is house fully automated or not?(yes/no):\n");
            String automated = s.next();


            House_Construction house = new House_Construction(material,area,automated);
            double res2=house.total_construction_cost();
            System.out.format("Total amount needed to construct house: "+res2);
        }
        else
        {
            System.out.format("Please enter valid input...");
        }
    }
}
