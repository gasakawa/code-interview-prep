import com.gasakawa.cip.strings.LicenseKeyFormating;

public class TemporaryTests {

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(LicenseKeyFormating.reformatString(s, k));
    }
}
