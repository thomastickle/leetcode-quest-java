package com.github.ttickle.stringmatching;

public class StringMatchingQuestion2 {

    /**
     * Determines whether {@code goal} can be obtained by repeatedly rotating
     * {@code s} to the left.
     *
     * <p>My initial solution used an O(1) memory approach that treated the string
     * as a circular buffer and compared characters using modular arithmetic rather
     * than constructing rotated strings. While memory efficient, that approach has
     * a worst-case time complexity of O(n²), as many rotations may need to be
     * examined before a mismatch is detected.
     *
     * <p>Upon further analysis, I realized that any valid rotation of {@code s}
     * must appear as a substring of {@code s + s}. By concatenating the string
     * with itself and checking whether {@code goal} exists within the resulting
     * string, the problem can be reduced to a substring search problem by checking
     * whether goal appears within {@code s + s}
     *
     * <p>The original circular-buffer implementation has been left commented out
     * below for reference and comparison.
     *
     * @param s the source string to rotate
     * @param goal the target string to compare against
     * @return {@code true} if {@code goal} is a rotation of {@code s};
     *         {@code false} otherwise
     */
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s+s).contains(goal);
    }

//    public boolean rotateString(String s, String goal) {
//        if (s.length() != goal.length()) {
//            return false;
//        }
//
//
//        for (int sOffset = 0; sOffset < s.length(); sOffset++) {
//            boolean match = true;
//            for (int goalIndex = 0; goalIndex < goal.length(); goalIndex++) {
//                int sIndex = (goalIndex + sOffset) % s.length();
//                if (s.charAt(sIndex) != goal.charAt(goalIndex)) {
//                    match = false;
//                    break;
//                }
//            }
//
//            if (match) {
//                return true;
//            }
//        }
//        return false;
//    }
}
