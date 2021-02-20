package class101.foo.io;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

// ES
@Data
@Document(indexName = "post_shard_8")
public class Post {
    @Id
    private String id;
    private String content;
}

//// JPA
//@Data
//@Entity(name = "post")
//public class Post {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_seq")
//    @SequenceGenerator(name="post_id_seq", sequenceName = "post_id_seq", allocationSize = 1)
//    private Long id;
//    private String content;
//}
