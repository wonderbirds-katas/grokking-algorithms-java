package systems.boos;

import java.util.List;
import systems.boos.algorithms.BinarySearch;
import systems.boos.algorithms.SelectionSort;

public class Demos {

  private Demos() {}

  static void binarySearch(Output output) {
    output.append("Binary Search%n");
    output.append("=============%n");

    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var target = 9;
    var searchResult = BinarySearch.binarySearch(numbers, target);

    if (searchResult.isPresent()) {
      var foundIndex = searchResult.get();
      output.append(
        "Search %d -> %d is the index; %d is the value in %s%n",
        target,
        foundIndex,
        numbers.get(foundIndex),
        numbers
      );
    } else {
      output.append("Search %d -> not found in %s%n", target, numbers);
    }

    output.append("%n");
  }

  static void selectionSort(Output output) {
    output.append("Selection Sort%n");
    output.append("==============%n%n");

    // generate a list of numbers from 1 to 10.
    var numbers = List.of(2, 4, 5, 1, 10, 9, 7, 3, 8, 6);

    output.append("Shuffled input: %s%n", numbers);

    var sorted = SelectionSort.selectionSort(numbers);

    output.append("   Sorted list: %s%n%n", sorted);
  }
}
