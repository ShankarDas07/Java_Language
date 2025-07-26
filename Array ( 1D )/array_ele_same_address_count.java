package one_D_array;

public class array_ele_same_address_count {
    public int findAddress(int x, int[] arr) {
        int lastAddress = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                lastAddress = i;
            }
        }
        return lastAddress;
    }

    public static void main(String[] args) {
        array_ele_same_address_count obj = new array_ele_same_address_count();
        int[] arr = {11, 1, 19, 21, 11, 55, 11};
        int x = 11;
        int lastAddress = obj.findAddress(x, arr);
        System.out.println(lastAddress);
    }
}
