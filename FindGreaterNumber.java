public class FindGreaterNumber {

    public static void main(String[] args) {

        int list[] = {238,767,56,78,98,897,898};
        int largest=list[0];
        int smallest =list[0];


        for (int i = 0; i < list.length; i++ ) {
            if ( list[i]>largest){
                largest=list[i];
            } else if (list[i]< smallest) {
                smallest = list[i];
            }
        }
        System.out.println("largest"+largest);
        System.out.println("smallest"+smallest);


    }
}
