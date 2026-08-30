class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        if (digits.isEmpty()) {
            return res;
        }

        HashMap<Character, List<Character>> map = new HashMap<>();
        map.put('2', new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put('3', new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        map.put('4', new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        map.put('5', new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        map.put('6', new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        map.put('7', new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        map.put('8', new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        map.put('9', new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));

        backtrack(digits, 0, curr, map, res);
        return res;
    }

    private void backtrack(String digits, int index, StringBuilder curr,
        HashMap<Character, List<Character>> map, List<String> res) {
        if (curr.length() == digits.length()) {
            res.add(curr.toString());
            return;
        }
        char digit = digits.charAt(index);
        List<Character> letter = map.get(digit);

        for (char let : letter) {
            curr.append(let);
            backtrack(digits, index + 1, curr, map, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
