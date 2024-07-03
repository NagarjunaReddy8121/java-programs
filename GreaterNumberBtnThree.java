public class GreaterNumberBtnThree {
    public static void main(String[] args) {
        int x=4;
        int y=7;
        int z=10;

        // if(x>y && x>z){
        //     System.out.println(x);
        // }if (y>z) {
        //     System.out.println(y);
        // } else {
        //     System.out.println(z);
        // }
        int result=(x>y && x>z)?x:(y>z)?y:z;

        System.out.println(result);
    }
}
