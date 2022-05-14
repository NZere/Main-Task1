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
        System.out.println("Введите число месяца: ");
        int month = in.nextInt();
        if(month>=1 && month<=12){
            if(month==1)
                System.out.println("January/Январь");
            else if (month==2)
                System.out.println("February/Февраль");
            else if (month==3)
                System.out.println("March/Март");
            else if (month==4)
                System.out.println("April/Апрель");
            else if (month==5)
                System.out.println("May/Май");
            else if (month==6)
                System.out.println("June/Июнь");
            else if (month==7)
                System.out.println("July/Июль");
            else if (month==8)
                System.out.println("August/Август");
            else if (month==9)
                System.out.println("September/Сентябрь");
            else if (month==10)
                System.out.println("October/Октябрь");
            else if (month==11)
                System.out.println("November/Ноябрь");
            else
                System.out.println("December/Декабрь");
        }
        else
            System.out.println("Не правильно ввели число месяца");



    }
}
