class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int left = 1;
        int right = piles[piles.length - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            long total = 0;
            for (int p : piles) {
                total += Math.ceil((double) p / mid);
            }

            if (total <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}