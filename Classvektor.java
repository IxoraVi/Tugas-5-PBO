package classvektor;
import java.util.Vector;
import java.util.ListIterator;
public class Classvektor {
    public static void main(String[] args) {
        
        Vector theVector = new Vector();
        for(int i=0; i<=10; i++){
            theVector.add(new Integer(i));}
        System.out.println("isi theVector:"+theVector.toString());
        System.out.println("Ukuran:"+theVector.size());
        System.out.println("Masing-masing isi elemen vector:");
        ListIterator iter= theVector.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());}
        
        Vector v = new Vector();
        v.add(new Integer(20));
        v.add(new Long(1000L));
        v.add(new Float(10.4f));
        v.add(new Double(10.14));
        System.out.println(v);
        v.add(2,new String("Ini sisipan"));
        System.out.println(v);
        v.set(3,new String("Nilai Pengganti"));
        System.out.println(v);
    }   
}