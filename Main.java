class Main {
    public static void main(String args[]) {
        // Your code goes here
        int nums[][] =  new int[3][4];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0;i<nums[i].length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] =(int)(Math.random() *10);
            }
        }

    }
}