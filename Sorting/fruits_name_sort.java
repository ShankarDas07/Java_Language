package shorting;

public class fruits_name_sort {
    static void fruitSort(String [] fruits) {
        int n=fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_idx])<0) {
                    min_idx = j;
                }
                }
            if (min_idx != i) {
                String temp = fruits[i];
                fruits[i] = fruits[min_idx];
                fruits[min_idx] = temp;
            }
        }
    }
    public static void main (String[]args){
        String [] fruits={"Apple", "Papaya", "Lime", "Watermelon", "Mango", "Kiwi"};

        fruitSort(fruits);
        for (String val: fruits) {
            System.out.print(val + " ");
        }
    }
}
