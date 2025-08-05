class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

    boolean[] skip = new boolean[fruits.length];

    int placed = 0;
    
    for(int i = 0; i < fruits.length; i++){

        for(int j = 0; j < baskets.length; j++){

            if(fruits[i] <= baskets[j] && skip[j] == false){
            skip[j] = true;
            placed++;
            break;
        }

        }
        


    }
    return fruits.length - placed;


    }
}