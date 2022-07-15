package pl.myprojects;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Divisors {

    List<Integer> findDivisors(int userNumber) {
        List<Integer> listOfDivisors = new ArrayList<>();
        // ===========  dla złożoności obliczeniowej - 0(Sqrt(n)) ================
        for (int i = 1; i <= Math.sqrt(Math.abs(userNumber)); i++) {
            if (userNumber % i == 0) {
                // pomijanie duplikatów
                if (Math.abs(userNumber) / i == i) {
                    addPositiveNegative(listOfDivisors, i);
                } else {
                    addPositiveNegative(listOfDivisors, i);
                    addPositiveNegative(listOfDivisors, userNumber / i);
                }
            }
        }
        Collections.sort(listOfDivisors);
        return listOfDivisors;
    }

    private void addPositiveNegative(List<Integer> listOfDivisors, int i) {
        listOfDivisors.add(i);
        listOfDivisors.add(-i);
    }
}