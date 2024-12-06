import java.util.Scanner;
class Summation {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int add=0;
        int i=1;
        
        int n= scanner.nextInt();
        do{
            
                if(i%2==0){
                    add+=i;

                }i++;
                

            
        } while(i<=n);
        System.out.println(add);
        scanner.close();
    } 
}
