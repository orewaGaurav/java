public class Main{
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

    


    }
}
