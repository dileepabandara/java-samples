public class StarPattern2 {

    public static void main(String[] args) {

        int h, i, j, k;

        for (h = 7; h > 2; h--) {

            for (i = 0; i < h; i++) {

                for (j = 6; j > i; j--) {
                    System.out.print(" ");
                }

                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }
                for (k = 1; k < i; k++) {
                    System.out.print("*");
                }

                System.out.println("");

            }

            for (i = h - 2; i > 0; i--) {

                for (j = 6; j > i; j--) {
                    System.out.print(" ");
                }

                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }
                for (k = 1; k < i; k++) {
                    System.out.print("*");
                }

                System.out.println("");

            }

        }

    }

}

//
//              *
//             ***
//            *****
//           *******
//          *********
//         ***********
//          *********
//           *******
//            *****
//             ***
//              *
//
//              *
//             ***
//            *****
//           *******
//          *********
//           *******
//            *****
//             ***
//              *
//
//              *
//             ***
//            *****
//           *******
//            *****
//             ***
//              *
//
//              *
//             ***
//            *****
//             ***
//              *
//
//              *
//             ***
//              *
//
