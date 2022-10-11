import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String month = obj.nextLine();
        int day = obj.nextInt();
        System.out.println((month.equals("july") && day==5)?1:0);
    }
}