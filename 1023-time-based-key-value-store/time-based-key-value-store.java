class TimeMap {

    Map<String, List<Pair<String, Integer>>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!timeMap.containsKey(key)) {
            timeMap.put(key, new ArrayList<>());
        }
        timeMap.get(key).add(new Pair<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        List<Pair<String, Integer>> values = timeMap.get(key);

        if (values == null || values.isEmpty()) {
            return "";
        }

        int minStamp = 0;
        int maxStamp = values.size() - 1;
        String ans = "";
        while (maxStamp >= minStamp) {
            int mid = minStamp + (maxStamp - minStamp) / 2;
            Pair<String,Integer> pair = values.get(mid);
            if (pair.getValue() <= timestamp) {
                minStamp = mid + 1;
                ans = pair.getKey();
            } else
                maxStamp = mid - 1;
        }

        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */