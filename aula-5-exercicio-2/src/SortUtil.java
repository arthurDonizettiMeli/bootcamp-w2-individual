public class SortUtil<T> {
    // Bubble
    public static <T> Precedente<T>[] sort(Precedente<T> arr[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i].precedeA((T)arr[i+1]) > 0) {
                    Precedente<T> aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                }
            }
        }
        return arr;
    }
}
