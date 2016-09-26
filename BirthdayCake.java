import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Divya Chopra on 9/22/2016.
 */
public class BirthdayCake {
    public static void main(String[] args) {
        System.out.println("Enter number of guests");
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i <n; i++)
        {
            list.add(Integer.valueOf(sc.nextLine()));
           // System.out.println(list.get(i));
        }

        int [] helper = new int[list.size()];
        for(int i =0; i <list.size();i++) {
            helper[i] = list.get(i);
        }
        for(int i=1; i <list.size(); i++)
        {
            for(int j=0; j<i; j++)
            {
                if(list.get(i) >= list.get(j))
                helper[i] = Math.max(helper[i], helper[j]+list.get(i));

            }
            System.out.println(helper[i]);
        }
        int result=0;
        for(int i =0; i<helper.length; i++)
            result = Math.max(result,helper[i]);

        System.out.println(result);
    }
}
