
public class oddarray {

    public static void main(String[] args) {

                int [] arr = new int [] {10, 9, 3, 14, 35,86};

                System.out.println("Elements of given array present on odd position: ");

                for (int i = 0; i < arr.length; i = i+2) {
                    System.out.println(arr[i]);
                }
            }
        }