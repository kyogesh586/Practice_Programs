package basicPrograms;

public class NumberCount {

    public static void main(String[] args) {

        int num=4567889;
        int count=0;

        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}