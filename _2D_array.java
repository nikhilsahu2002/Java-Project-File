public class _2D_array {
    //for creating 2D array, we must follow the same steps as that of simple arrays.
    //2D array like this int myArray[][];
    //MyArray = new int [3][4]; or int MyArray[][] = new int [3][4];
    // like the one dimansanla array, 2D dimenstional arrat may be inislize my folling diclartion with a list of intitisl value in close in brases[]
    //note the systex of the above statement ,are requied after each braces closes of the row , excpte in the case of the last row
    public static void main(String[] args) {
        int [][] array2D={
            {1,1,1,1,1},
            {0,0,0,0,0}
        };
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j) {
                    array2D[i][j]=1;
                }
                else{
                    array2D[i][j]=0;
                }
            }
        }
    }
}
