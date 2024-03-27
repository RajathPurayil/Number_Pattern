public class Main {
    public static void main(String[] args) {

        //Write a program to print below pattern

        /*
                        1
                        123
                        12345
                        1234567

        */


        int  num=1;

        for (int i=1;i<=4;i++){

            for (int j=1;j<=num;j++){

                System.out.print(j);
            }

            System.out.println();

            num=num+2;
        }

    }
}