public class Main {
     static void ageValidate(int age) throws CustomException{
        if(age < 18){
            throw new CustomException("You're Underage");
        }
        else{
            System.out.println("Eligible for vote");
        }
    }

    public static void main(String[] args) {
        try{
            int[] a = new int[5];
            a[4] = 100/0;
            a[5] = 100;
            ageValidate(17);
            System.out.println("This line will not execute");
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally will always execute whether the exception caught or not");
        }
    }
}