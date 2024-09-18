import java.io.*;
class GFG{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers");
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        float av=(a+b+c)/3;
        System.out.println("Average of 3 numbers: "+av);
    }
}