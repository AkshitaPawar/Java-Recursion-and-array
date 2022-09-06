public class string {
    public static void RevString(String str, int indx){
        if(indx == 0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        RevString(str,indx-1);
    }
    public static void main(String[] args) {
        String str="sagar is a bad boy";
        RevString(str,str.length()-1);

    }
}
