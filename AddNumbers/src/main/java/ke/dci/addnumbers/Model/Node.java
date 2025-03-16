package ke.dci.addnumbers.Model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node {

    int val;

    Node next;

}
