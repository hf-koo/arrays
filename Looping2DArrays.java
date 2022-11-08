public class Looping2DArrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };
        // for(int j = 0; j < grades[0].length; j++){
        //     System.out.println(grades[0][j]);
        // }
        // for(int j = 0; j < grades[1].length; j++){
        //     System.out.println(grades[1][j]);
        // }
        // for(int j = 0; j < grades[2].length; j++){
        //     System.out.println(grades[2][j]);
        // }

        for (int i = 0; i < grades.length; i++){
            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }
            for(int j = 0; j < grades[i].length; j++){
                System.out.println(grades[i][j]);
            }
            System.out.print("\n");
        }
        

        
    }
}
