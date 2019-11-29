package hibernate;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "phones")
@ToString
@RequiredArgsConstructor
public class Phones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    @NonNull
    private String name;

    @Column(name = "model")
    @Getter
    @Setter
    @NonNull
    private String model;

    public Phones(){

    }

}

