class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) map.put(arr[i], i);
        for (int[] piece: pieces) {
            if (!map.containsKey(piece[0])) return false;
            for (int i = 0; i < piece.length - 1; i++)
                if (map.getOrDefault(piece[i], Integer.MIN_VALUE) + 1 != map.getOrDefault(piece[i + 1], Integer.MIN_VALUE)) return false;
        }
        return true;
    }
}
