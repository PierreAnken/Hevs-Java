package Strategy_1.behavior;

public class BubbleSortBehavior implements SortBehavior {
    
    public BubbleSortBehavior() {
    }
    
    public void sort(int[] vector) {
        int temp;
        int permutations = -1;
        int iterations   = 0;
        
        while (permutations != 0) {
            permutations = 0;
            
            for (int i=0; i<vector.length - iterations - 1; i++) {
                
                if (vector[i] > vector[i + 1]) {
                    permutations++;
                    temp = vector[i + 1];
                    vector[i+1] = vector[i];
                    vector[i]   = temp;
                }
            }
        }
    }
    
}
