import java.util.Comparator;

public class MyArrays {
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            byte midVal = a[mid];

            if (midVal < key) {
                fromIndex = mid + 1;
            } else if (midVal > key) {
                toIndex = mid;
            } else {
                return mid; // key found
            }
        }
        return -(fromIndex + 1); // key not found
    }

    // Binary Search for char[]
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            char midVal = a[mid];

            if (midVal < key) {
                fromIndex = mid + 1;
            } else if (midVal > key) {
                toIndex = mid;
            } else {
                return mid; // key found
            }
        }
        return -(fromIndex + 1); // key not found
    }

    // Binary Search for generic types with Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid; // key found
            }
        }
        return -(fromIndex + 1); // key not found
    }
    public static int binarySearch(int[] array, int key) {
            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int midVal = array[mid];

                if (midVal < key) {
                    low = mid + 1; // Искать в правой половине
                } else if (midVal > key) {
                    high = mid - 1; // Искать в левой половине
                } else {
                    return mid; // Элемент найден
                }
            }
            return -1; // Элемент не найден
        }
    }


