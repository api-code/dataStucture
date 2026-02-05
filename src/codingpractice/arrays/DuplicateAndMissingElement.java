package codingpractice.arrays;

public class DuplicateAndMissingElement {
    public static int[] duplicateMissingEle(int[] array){
        int duplicateCount=-1;
        int missingCount=-1;
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=1;j<array.length;j++) {
                if (array[j] == i) {
                    count++;
                }
            }
                if(count>=2){
                    duplicateCount=i;
                }
                else
                if(count==0){
                    missingCount=i;
                }
        }
        return new int[]{duplicateCount, missingCount};
    }
    public static void main(String[] args) {
        int[] arrays= {3, 5, 4, 1, 1};

        int[] result = duplicateMissingEle(arrays);

        // Print the repeating and missing numbers found
        System.out.println("The repeating and missing numbers are: {"
                + result[0] + ", " + result[1] + "}");
    }
}
