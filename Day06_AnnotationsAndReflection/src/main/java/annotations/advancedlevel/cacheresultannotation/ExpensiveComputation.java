package annotations.advancedlevel.cacheresultannotation;

import java.util.HashMap;
import java.util.Map;

class ExpensiveComputation {
    private final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeFactorial(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Returning cached result for: " + n);
            return cache.get(n);
        }
        System.out.println("Computing factorial for: " + n);
        int result = (n <= 1) ? 1 : n * computeFactorial(n - 1);
        cache.put(n, result);
        return result;
    }
}