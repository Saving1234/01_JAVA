package problem2;

public class Application {

    public int intResult(int a, int b, int c, int d, int e, int f){

        int [][] num = new int [2][3];

        num[0][0] = a;
        num[0][1] = b;
        num[0][2] = c;
        num[1][0] = d;
        num[1][1] = e;
        num[1][2] = f;

        int j= 0;
        for(j=0; j<=num.length; j++){
            for(int z=1; z<= num[z].length; z++ )
                System.out.println(num[j][z]);
        }

        return j;


    }


    public void evenResult(int a, int b, int c){
        int []num1 = {a,b,c};
        int[] num2 = num1;

        for(int i=0; i< num1.length; i++){
                System.out.print(
                        num1[i] );


            }
        System.out.println();

        for(int z=0; z< num2.length; z++){
            System.out.print(num2[z]);
        }


    }

    public void evenResult2(int a, int b, int c){
        int[]num={a,b,c};
        int [] num2= num;

        for(int i =0; i < num.length; i++){
            System.out.print(num[i]);
        }
        System.out.println();

        for(int z =0; z < num2.length; z++){
            System.out.print(num2[z]);
        }
        System.out.println();
    }

    public void evenResult3(int a, int b, int c){
        int[][]num = new int [2][3];

        num[0][0] = a;
        num[0][1] = b;
        num[0][2] = c;
        num[1][0] = a;
        num[1][1] = b;
        num[1][2] = c;


        for(int i=0; i < num.length;i++){
            for(int z=0; z< num[i].length; z++){
                System.out.println(num[i][z] + "");
            }

        }
    }

    public void evenResult4(){

        int [][]num = new int [3][2];

        num[0][0] =10;
        num[0][1] =20;
        num[1][0] =30;
        num[1][1] =40;
        num[2][0] =50;
        num[2][1] =60;

        for(int i=0; i < num.length; i++){
            for(int z=0; z< num[i].length; z++){
                System.out.print(num[i][z] + "");
            }
            System.out.println();
        }

    }
}
