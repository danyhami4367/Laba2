package ru.imit.omsu;

class StringProcessor {
    public String repeatString(String s, int N) throws IllegalArgumentException {
        if (N < 0) {
            throw new IllegalArgumentException("N не должно быть отрицательным.");
        } else if (N == 0) {
            return "";
        } else {
            return s.repeat(N);
        }
    }

    public int countOccurrences(String mainString, String subString) throws IllegalArgumentException {
        if (subString == null || subString.isEmpty()) {
            throw new IllegalArgumentException("2 строка не должна быть пустой или 0.");
        } else {
            int lastIndex = 0;
            int count = 0;
            while (lastIndex != -1) {
                lastIndex = mainString.indexOf(subString, lastIndex);
                if (lastIndex != -1) {
                    count++;
                    lastIndex += subString.length();
                }
            }
            return count;
        }
    }

    public String DigToString(String str) {
        return str.replace("1", "один").replace("2", "два").replace("3", "три");
    }

    public void removeEverySecondCharacter(StringBuilder sb) {
        for (int i = 1; i < sb.length(); i++) {
            sb.deleteCharAt(i);
        }
    }
}
