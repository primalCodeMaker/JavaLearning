package pl.lombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@With

public class Dog {

    @EqualsAndHashCode.Include
    private String name;
    private  int age;

    @ToString.Exclude
    private Owner owner;

    public void nonNullExample (@NonNull String sth) {
        System.out.println("is null here?: " + sth);
    }
}
