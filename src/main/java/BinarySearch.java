


public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch();
    }
    private static Integer BinarySearch(int[] sortedArray, int key){
        int arrIndex = -1;

        for(int i = 0; i < sortedArray.length; i++){

            if(sortedArray[i] == key ){
                arrIndex = i;

                return arrIndex;
            }

        }

        return arrIndex;
    }
}
