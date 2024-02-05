/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {

        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        for (char m : s) {

            System.out.print(m);
        }
        System.out.println();

        // lets reverse this array
        int left = 0; //a
        int right = s.length - 1; // b

        while (left < right) {

            char temp = s[left];  // c = a
            s[left] = s[right]; // b=a
            s[right] = temp;  // c=a

            left++;
            right--;

        }
        for (char m : s) {

            System.out.print(m);
        }
    }
}