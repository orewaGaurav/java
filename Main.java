public class Main{
    static void myMethod(String name){
        System.out.println("My name is "+name+"!");
    }
    static int sum(int x,int y){
        return y+x;
    }
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println(3*3);
        String name = "Gaurav";
        System.out.println(name);
        int age = 19;
        System.out.println("My age is: "+age);
        final float pi = 3.14f;//once declared final var value is fixed through the code
        System.out.println(pi);
        char ch = 'G';
        System.out.println(ch);
        boolean a = true;
        System.out.println(a);
        long myNum = 15000000000L;
        System.out.println(myNum);
        float  var1= 34E2f;
        System.out.println(var1);
        double d1 = 12E4d;
        System.out.println(d1);
        int var2 = 34;
        float var3 = var2;//type casting smaller to bigger
        System.out.println(var3);
        int var4 = (int)var3;//type casting bigger to smaller
        System.out.println(var4);
        String str1 = "abehjcqlAgauAVs";
        System.out.println("The length of str1 is: "+str1.length()); 
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        String txt = "Please locate where locate occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        String txt1 = "Please locate \"where\" locate \'occurs!\'";
        System.out.println(txt1);
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7)); 
        System.out.println((int)(Math.random()*101));
        // ternory operator
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 20;
        int num5 =40; 
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        // ternory operator for more than one condition;
        // condition1 ?(condition2 ? Expression1 : Expression2) : Expression3; 
        String res = (time<18)?(num5>time?"yes":"No"):"no";
        System.out.println(res);
        // switch
        int day = 2;
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
        }
        int i =0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        // The do/while loop is a variant of the while loop. This loop will execute the code block once, 
        // before checking if the condition is true,then it will repeat the loop as long as the condition is true.
        i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i>3);
        // condition is false but loop will execute for 1st time
        for(i=0;i<5;i++)
        System.out.print(" "+i);

        // for each-loop
        System.out.println("\n");
        String[] cars = {"BMW","VOLVO","LAMBO","MERCEDES"};
        for(String j:cars){
            System.out.println(j);
        }
        myMethod("Gaurav");
        myMethod("Lavesh");
        myMethod("Priyanshu");
        System.out.println(sum(5,9));
        

    




    }
}
