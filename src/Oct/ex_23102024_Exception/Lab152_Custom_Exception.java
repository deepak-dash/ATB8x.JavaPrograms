package Oct.ex_23102024_Exception;

public class Lab152_Custom_Exception {
    public static void main(String[] args) throws Exception {
        oct.ex_23102024_Exception.Bank sbi = new oct.ex_23102024_Exception.Bank("INR",100);
        oct.ex_23102024_Exception.Bank icici = new oct.ex_23102024_Exception.Bank("INR",123);
        oct.ex_23102024_Exception.Bank jp_chase = new oct.ex_23102024_Exception.Bank("USD",100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));
    }
}
