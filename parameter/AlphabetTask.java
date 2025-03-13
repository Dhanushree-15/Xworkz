
public class AlphabetTask {
    public static void printAlphabetsInAscendingOrder(Set<Character> alphabets) {
        List<Character> sortedList = new ArrayList<>(alphabets);
        Collections.sort(sortedList);
        for (Character alphabet : sortedList) {
            System.out.print(alphabet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Character> alphabets = Set.of('z', 'a', 'm', 'x', 'b');
        printAlphabetsInAscendingOrder(alphabets);
    }
}