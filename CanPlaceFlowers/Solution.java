class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int planted = 0;
        for(int i =0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                if(i == 0 || i == flowerbed.length-1){
                    if(i == 0){
                        if(flowerbed.length == 1){
                          flowerbed[i] = 1;
                            planted++;
                        } 
                        else{
                            if(flowerbed[i+1] == 0){
                                flowerbed[i] = 1;
                                planted++;
                            } 
                        }
                    }
                 else{
                    if(flowerbed.length == 1){
                          flowerbed[i] = 1;
                            planted++;
                    } 
                    else{
                        if(flowerbed[i-1] == 0){
                            flowerbed[i] = 1;
                            planted++;
                        } 
                    }    
                }
            }
            else{
               if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i] = 1;
                    planted++;
               } 
            }
        }
    }
    if(planted>=n) return true;
    else return false;
    }
}