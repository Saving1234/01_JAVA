package problem;

public class Application {

    public void integer(int a, int b, int c, int d, int e){



        int [] x = {a,b,c,d,e};


        System.out.print(x[0]);
        System.out.print(x[1]);
        System.out.print(x[2]);
        System.out.print(x[3]);
        System.out.printf("%d/2", x[4]);

    }

    public void backwordsInt(int a, int b, int c, int d, int e){

        int [] x = {a,b,c,d,e};


        System.out.print(x[4]);
        System.out.print(x[3]);
        System.out.print(x[2]);
        System.out.print(x[1]);
        System.out.print(x[0]);

    }

    public void intblown(){

        int [] nums = {10, 20, 30, 40, 50};

        for(int i =0; i<=nums.length; i++){
            System.out.println(nums[i]);
        }

        int [] empty = new int[3];
        String [] names = new String[3];


        System.out.printf("nums = %d %d %d %d %d\n",
                nums[0], nums[1], nums[2], nums[3], nums[4]);
        System.out.printf("empty = %d %d %d\n", empty[0], empty[1], empty[2]);
        System.out.printf("names : %s %d %s\n", names[0], names[1], names[2]);
    }

}
