class Star1 {
    public static void main(String[] args) {

        // for(int i=4; i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int n = 4;
        for (int i = 1; i <= n; i++) {//stars = n - lineno + 1
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}