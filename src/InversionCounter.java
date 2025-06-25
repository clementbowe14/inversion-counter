public class InversionCounter {

    public InversionCounter(){
    }

    public long countInversions(int [] array) {
        if(array.length == 1){
            return 0;
        }

        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;

        int [] left = new int[leftSize];
        int [] right = new int[rightSize];

        for(int i = 0; i < array.length/2; i++){
            left[i] = array[i];
        }

        for(int i = array.length/2, j = 0; i < array.length; i++, j++) {
            right[j] = array[i];
        }

        long leftInversions = countInversions(left);
        long rightInversions = countInversions(right);

        int leftIdx = 0, rightIdx = 0;
        int idx = 0;
        int splitInversions = 0;

        while(leftIdx < left.length && rightIdx < right.length){
            if(left[leftIdx] < right[rightIdx]){
                array[idx++] = left[leftIdx++];
            } else {
                splitInversions += (left.length - leftIdx);
                array[idx++] = right[rightIdx++];
            }
        }

        if(leftIdx < left.length){
            while(leftIdx < left.length){
                array[idx++] = left[leftIdx++];
            }
        }

        if(rightIdx < right.length){
            while(rightIdx < right.length){
                array[idx++] = right[rightIdx++];
            }
        }


        return leftInversions + rightInversions + splitInversions;
    }

}
