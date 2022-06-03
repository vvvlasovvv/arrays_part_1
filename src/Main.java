public class Main {
    public static void main(String[] args) {

        //Arrays_Part_1
        //Task №1
        int[] weight1 = new int[3];
        weight1[0] = 1;
        weight1[1] = 2;
        weight1[2] = 3;

        float[] weight2 = {1.57f, 7.654f, 9.986f};

        int[] weight3 = {4, 5, 6};

        //Task №2
        for (int i = 0; i < weight1.length; i++) {
            if(i!=weight1.length-1)
                System.out.print(weight1[i] + ", ");
            else
            System.out.println(weight1[i]);
        }

        for (int i = 0; i < weight2.length; i++) {
            if(i!=weight2.length-1)
                System.out.print(weight2[i] + ", ");
            else
            System.out.println(weight2[i]);
        }

        for (int i = 0; i < weight3.length; i++) {
            if(i!=weight3.length-1)
                System.out.print(weight3[i] + ", ");
            else
            System.out.println(weight3[i]);
        }

        //Task №3
        for (int i = weight1.length-1; i >= 0; i--) {
            if(i != 0)
                System.out.print(weight1[i] + ", ");
            else
                System.out.println(weight1[i]);
        }

        for (int i = weight2.length-1; i >= 0; i--) {
            if(i != 0)
                System.out.print(weight2[i] + ", ");
            else
                System.out.println(weight2[i]);
        }

        for (int i = weight3.length-1; i >= 0; i--) {
            if(i != 0)
                System.out.print(weight3[i] + ", ");
            else
                System.out.println(weight3[i]);
        }

        //Task №4
        for (int i = 0; i < weight1.length; i++) {
            if(weight1[i] % 2 == 1){
                weight1[i]+=1;
            }
            if(i!=weight1.length-1)
                System.out.print(weight1[i] + ", ");
            else
                System.out.println(weight1[i]);
        }

        for (int i = 0; i < weight3.length; i++) {
            if(weight3[i] % 2 == 1){
                weight3[i]+=1;
            }
            if(i!=weight3.length-1)
                System.out.print(weight3[i] + ", ");
            else
                System.out.println(weight3[i]);
        }
    }
}