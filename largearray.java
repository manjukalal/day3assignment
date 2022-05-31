
public class largearray {

    public static void main(String[] args) {

                int [] array = new int [] {15, 41, 6, 45, 96};

                int large = array[0];

                for (int i = 0; i < array.length; i++)
                {
                    if(array[i] > large)
                        large = array[i];
                }
                System.out.println("Largest element  in given array: " + large);
            }
        }
		