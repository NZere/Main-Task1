import java.util.Scanner;

public class Lab
{
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("Done by: Oryngozha Nazzere");
        System.out.println("------------------------------------------------");
        Scanner in= new Scanner (System.in);

        System.out.println("***************** TASK 1 ****************");
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Хай, "+name+":)");


        System.out.println("***************** TASK 2*****************");
        System.out.println("Введите аргументы через пробел: ");
        String s1= in.nextLine();
        String [] args1= s1.split(" ");

        for(int i=args1.length-1; i>=0;i--){
            System.out.print(args1[i]+ " ");
        }
        System.out.println();


        System.out.println("***************** TASK 3*****************");
        System.out.println("Введите сколько рандомных цифр вы бы хотели вывести: ");

            int ranCount= Integer.parseInt(in.nextLine());
            int[] ranNumbers=new int [ranCount];
            for(int i=0;i<ranCount;i++){
            ranNumbers[i]=(int)(Math.random()*1000);
        }

        System.out.println(ranCount+ " рандомных чисел с переходом на новую строку");
        for(int i=0;i<ranCount;i++){
            System.out.println(ranNumbers[i]);
        }

        System.out.println(ranCount+ " рандомных чисел без перехода на новую строку");
        for(int i=0;i<ranCount;i++){
            System.out.print(ranNumbers[i]+" ");
        }
        System.out.println();



        System.out.println("***************** TASK 4*****************");
        System.out.println("Введите аргументы через пробел: ");

        String str2= in.nextLine();
        String [] args2= str2.split(" ");
        int sum = 0;
        int mul = 1;
        for(int i = 0 ;i < args2.length;i++){
            sum+=Integer.parseInt(args2[i]);
            mul*=Integer.parseInt(args2[i]);
        }
        System.out.println("Сумма: "+sum+" (произведение "+mul+") ");



        System.out.println("***************** TASK 5*****************");

        while(true){
            System.out.println("Введите число месяца: ");
            int month = in.nextInt();
            switch(month){
                case 1:
                    System.out.println("January/Январь");
                    return;
                case 2:
                    System.out.println("February/Февраль");
                    return;
                case 3:
                    System.out.println("March/Март");
                    return;
                case 4:
                    System.out.println("April/Апрель");
                    return;
                case 5:
                    System.out.println("May/Май");
                    return;
                case 6:
                    System.out.println("June/Июнь");
                    return;
                case 7:
                    System.out.println("July/Июль");
                    return;
                case 8:
                    System.out.println("August/Август");
                    return;
                case 9:
                    System.out.println("September/Сентябрь");
                    return;
                case 10:
                    System.out.println("October/Октябрь");
                    return;
                case 11:
                    System.out.println("November/Ноябрь");
                    return;
                case 12:
                    System.out.println("December/Декабрь");
                    return;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
        }



    }
}
