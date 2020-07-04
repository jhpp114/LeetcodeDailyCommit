class solution {
    public void num_sepearation(int value) {
        if (value >= 100) {
            System.out.println("The Value has to be less than 100");
            return;
        }
        boolean isNegative = false;
        // handle negative
        if (value < 0) {
            isNegative = true;
        } 
        // first modular is the ....first base?
        int ones_base = 0;
        int tenth_base = 0;

        if (isNegative) {
            value *= -1;
            ones_base = value % 10;
            value /= 10;
            tenth_base = value % 10;
            System.out.println("1st base : " + ones_base);
            System.out.println("10th base: " + tenth_base);
            System.out.println("negative");
        } else {
            ones_base = value % 10;
            value /= 10;
            tenth_base = value % 10;
            System.out.println("1st base: " + ones_base);
            System.out.println("10th base: " + tenth_base);
        }
       
    }
    
    public static void main(String[] args) {
        solution sol = new solution();
        int test1 = 0;
        sol.num_sepearation(test1);

        int test2 = -10;
        sol.num_sepearation(test2);

        int test3 = 100;
        sol.num_sepearation(test3);
    }
}