import java.util.HashSet;

/**
 * Created by ADMIN on 07.06.2015.
 */
public class MyException {

    public static void main(String[] args) {

        int badArg1 = 0;
        int badArg2 = -1;
        int badArg3 = 1;

        HashSet mySet = new HashSet();

        mySet.add(badArg1);
//        mySet.add(badArg2);
//        mySet.add(badArg3);

        try {
            tryException(mySet);
        } catch (VeryBadException e) {
            System.out.println("VeryBadException!");
        } catch (BadException e) {
            System.out.println("BadException!");
        } catch (GoodException e) {
            System.out.println("GoodException!");
        } catch (Exception e) {
            System.out.println("AnotherException!");
        }

    }

    public static void tryException(HashSet a) throws GoodException, BadException, VeryBadException {

        if (a.contains(0) & a.contains(-1) & a.contains(1)) {
            throw new VeryBadException();
        }
        if ((a.contains(0) & a.contains(-1)) | (a.contains(0) & a.contains(1)) | (a.contains(1) & a.contains(-1))) {
            throw new BadException();
        }
        if (a.contains(-1) | a.contains(0) | a.contains(1)){
            throw new GoodException();
        }

    }

}
