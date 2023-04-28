class GFG {
    String longest(String names[], int n) {
        
        int max = names[0].length();
        int itr = 0;
        for(int i = 1; i < n; i++){
            if(max < names[i].length()){
                max = names[i].length();
                itr = i;
            }
        }
        
        return names[itr];
    }
}
