public class Pattern_02 {
    public static void main(String[] args) {
        // // Butterfly pattern
        // int n = 5;

        // //upper half
        // for(int i=1; i<=n; i++){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     // spaces
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     //2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Lower half
        // for(int i=n; i>=1; i--){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     // spaces
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     //2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // //solid Rhombus
        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // //number Pyramid
        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //number -> print row no, row no times
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i +" ");
        //     }
        //     System.out.println();
        // }


        // // Palindromic pattern
        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     // spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //1st half number
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }

        //     //2nd half number
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        //Diamond pattern
        int n = 4;

        //upper half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
