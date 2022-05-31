
public class smallarray {
    public static void main(String[] args) {

                int [] array = new int [] {45, 33, 76, 32, 16};

                int small = array[0];

                for (int i = 0; i < array.length; i++)
                {
                    if(array[i] < small)
                        small = array[i];
                }
                System.out.println("Largest element in given array: " + small);
            }
        }
