package fifth;

import java.util.ArrayList;
import java.util.List;

public class Kit {
    public static void main(String[] args) {
        int sizeSafe = 23;
        List<Objects> list = new ArrayList<>();
        list.add(new Objects(15,7,"hat"));
        list.add(new Objects(8, 8, "dress"));
        list.add(new Objects(3, 1, "shirt"));
        list.add(new Objects(6, 5, "skirt"));
        list.add(new Objects(5, 12, "phone"));
        list.add(new Objects(12, 14, "laptop"));
        list.add(new Objects(15, 3, "plant"));

        bubbleSort(list);

        List<Objects> listSafe = new ArrayList<>();
        int sizeSafeNow = 0;
        for (int i = 0; i < list.size(); i++){
            if ( (sizeSafeNow + list.get(i).getSize()) <= sizeSafe){
                listSafe.add(list.get(i));
                sizeSafeNow = sizeSum(listSafe);
            }
        }

        System.out.println("Содержимое сейфа: ");
        for (int i = 0; i < listSafe.size(); i++) System.out.println(listSafe.get(i));
        System.out.println();
        System.out.println("Ценность сейфа: " + valueSum(listSafe));

    }

    public static int sizeSum(List<Objects> E) {
        int sum = 0;
        for (int i = 0; i < E.size(); i++) {
            sum += E.get(i).getSize();
        }
        return sum;
    }

    public static int valueSum(List<Objects> E) {
        int sum = 0;
        for (int i = 0; i < E.size(); i++) {
            sum += E.get(i).getValue();
        }
        return sum;
    }

    public static List bubbleSort(List<Objects> E) {
        for (int i = E.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (E.get(j).getCostSize() < E.get(j + 1).getCostSize()) {
                    Objects tmp = E.get(j);
                    E.set(j, E.get(j + 1));
                    E.set(j + 1, tmp);
                }
            }
        }
        return E;
    }
}
