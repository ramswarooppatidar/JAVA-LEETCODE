package linkedlist2.com;

public class BinaryToDecimal {
    public int getDecimalVAlue(Node head){
            StringBuilder sb = new StringBuilder();
            while(head != null){
                sb.append(head.data);
                head = head.next;
            }
            String BinaryString = sb.toString();
            int decimal = Integer.parseInt(BinaryString, 2);
            return decimal;
    }
    public static void main(String args[]){

    }
}
