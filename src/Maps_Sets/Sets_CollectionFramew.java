package Maps_Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets_CollectionFramew {
    static void main() {

        // HASHSET BASIC OPERATION WORK ON 0(1) AND SAME FOR TREESET FOR 0(logn)


        HashSet<Integer> hs = new HashSet<>();

        hs.add(23); hs.add(66); hs.add(2); hs.add(2);
        hs.add(78); hs.add(46); hs.add(96); hs.add(96);

        System.out.println(hs.size());
        hs.add(44);
        System.out.println(hs.contains(2));
        hs.remove(23);
        System.out.println(hs);


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23); ts.add(66); ts.add(2); ts.add(2);
        ts.add(78); ts.add(46); ts.add(96); ts.add(96);

        System.out.println(ts.size());
        ts.add(44);
        System.out.println(ts.contains(2));
        ts.remove(23);

    }
}


