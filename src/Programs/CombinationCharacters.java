package Programs;

public class CombinationCharacters {
    public static void main(String[] args) {
        String input = "I Love Dogs";
        String cleanedInput = input.replace(" ", ""); // Remove spaces
        int length = cleanedInput.length();

        // Generate combinations
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j) { // Avoid using the same character
                    System.out.print(cleanedInput.charAt(i) + "" + cleanedInput.charAt(j) + ", ");
                }
            }
            System.out.println(); // New line after each row
        }
    }
}
/*IL, Io, Iv, Ie, ID, Io, Ig, Is,
LI, Lo, Lv, Le, LD, Lo, Lg, Ls,
oI, oL, ov, oe, oD, oo, og, os,
vI, vL, vo, ve, vD, vo, vg, vs,
eI, eL, eo, ev, eD, eo, eg, es,
DI, DL, Do, Dv, De, Do, Dg, Ds,
oI, oL, oo, ov, oe, oD, og, os,
gI, gL, go, gv, ge, gD, go, gs,
sI, sL, so, sv, se, sD, so, sg,*/
