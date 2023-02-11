import java.util.*;
import java.lang.*;


class GFG{
    static int smallestSubstring(String a)
    {
        //function to find smallest substring with unique chars.
        ArrayList<String> a1 = new ArrayList<>();
        for(int i = 0; i < a.length(); i++)
        {
            for(int j = i + 1; j <= a.length(); j++)
            {
                if (i != j)
                    a1.add(a.substring(i, j));
            }
        }

        // Take into account
        // all the substrings
        TreeMap<String, Integer> a2 = new TreeMap<>();
        for(String s : a1)
            a2.put(s, a2.getOrDefault(s, 0) + 1);

        ArrayList<String> freshlist = new ArrayList<>();

        // Iterate over all
        // unique substrings
        for(String s : a2.keySet())
        {
            // If frequency is 1
            if (a2.get(s) == 1)
                // Append into fresh list
                freshlist.add(s);
        }

        // Initialize a dictionary
        TreeMap<String, Integer> dictionary = new TreeMap<>();
        for(String s : freshlist)
        {
            // Append the keys
            dictionary.put(s, s.length());
        }

        ArrayList<Integer> newlist = new ArrayList<>();

        // Traverse the dictionary
        for(String s : dictionary.keySet())
            newlist.add(dictionary.get(s));

        int ans = Integer.MAX_VALUE;

        for(int i : newlist)
            ans = Math.min(ans, i);

        // Return the minimum of dictionary
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "dabbcabcd";

        System.out.println(smallestSubstring(S));
    }
}

// This code is contributed by Kingash