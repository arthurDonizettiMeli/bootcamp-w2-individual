package radix_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
  private static List<String> L0 = new ArrayList<>();
  private static List<String> L1 = new ArrayList<>();
  private static List<String> L2 = new ArrayList<>();
  private static List<String> L3 = new ArrayList<>();
  private static List<String> L4 = new ArrayList<>();
  private static List<String> L5 = new ArrayList<>();
  private static List<String> L6 = new ArrayList<>();
  private static List<String> L7 = new ArrayList<>();
  private static List<String> L8 = new ArrayList<>();
  private static List<String> L9 = new ArrayList<>();

  public static void radixSort(int[] iArr) {
    int maior = Arrays.stream(iArr).max().getAsInt();
    int qntCasas = (int) Math.log10((double) maior) + 1;

    String sArr[] = new String[iArr.length];
    List<String> resArr = new ArrayList<>();

    for (int i = 0; i < iArr.length; i++) {
      sArr[i] = String.format("%0" + qntCasas + "d", iArr[i]);
    }

    for (int casa = qntCasas - 1; casa >= 0; casa--) {
      for (int i = 0; i < sArr.length; i++) {
        adicionarItemListaCorrespondente(sArr[i], casa);
      }
      incluirItensOrdenados(resArr);
      limparListasComplementares();

      sArr = resArr.toArray(String[]::new);
      resArr.clear();
    }

    for (int i = 0; i < sArr.length; i++) {
      iArr[i] = Integer.parseInt(sArr[i]);
    }
  }

  private static void adicionarItemListaCorrespondente(String itemArray, int casa) {
    switch (itemArray.charAt(casa)) {
      case '0':
        L0.add(itemArray);
        break;
      case '1':
        L1.add(itemArray);
        break;
      case '2':
        L2.add(itemArray);
        break;
      case '3':
        L3.add(itemArray);
        break;
      case '4':
        L4.add(itemArray);
        break;
      case '5':
        L5.add(itemArray);
        break;
      case '6':
        L6.add(itemArray);
        break;
      case '7':
        L7.add(itemArray);
        break;
      case '8':
        L8.add(itemArray);
        break;
      case '9':
        L9.add(itemArray);
        break;
    }
  }

  private static void incluirItensOrdenados(List<String> resArr) {
    resArr.addAll(L0);
    resArr.addAll(L1);
    resArr.addAll(L2);
    resArr.addAll(L3);
    resArr.addAll(L4);
    resArr.addAll(L5);
    resArr.addAll(L6);
    resArr.addAll(L7);
    resArr.addAll(L8);
    resArr.addAll(L9);
  }

  private static void limparListasComplementares() {
    L0.clear();
    L1.clear();
    L2.clear();
    L3.clear();
    L4.clear();
    L5.clear();
    L6.clear();
    L7.clear();
    L8.clear();
    L9.clear();
  }

  public static void main(String[] args) {
    int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

    radixSort(iArr);

    Arrays.stream(iArr).forEach(System.out::println);
  }
}
