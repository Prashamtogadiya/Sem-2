public class lab81 {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int ans = 1;
            for (int i = 0; i <= b; i++) {
                ans *= a;
            }
            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("Enter values in integer ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter all the values");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Program Completed");
        }

    }
}
