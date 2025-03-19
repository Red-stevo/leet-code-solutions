package ke.dci.addnumbers.Model;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Node {

    int val;

    Node next;

}
