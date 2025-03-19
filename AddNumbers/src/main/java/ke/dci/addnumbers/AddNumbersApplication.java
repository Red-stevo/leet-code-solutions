package ke.dci.addnumbers;

import ke.dci.addnumbers.Model.Node;
import ke.dci.addnumbers.Solution.Solution;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AddNumbersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AddNumbersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Solution solution = new Solution();

        Node node = solution.add(solution.generateList(new int[]{9,9,9}), solution.generateList(new int[]{9,9,9}));

        while (true){
            log.info("Val {}", node.getVal());
            node = node.getNext();

            if (node == null) break;
        }
    }
}
